
public class RegExDemo {

	public static void main(String[] args) {
		String name ="sankalp";
		String mobile = "9319713208";
		String email = "sankalpjadon182@gmail.com";
		
		String nameReg = "[A-Z]{1}[a-z]{3,}";
		String mobileReg = "[6-9]{1}[0-9]{9}";
		String emailReg = "^\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

		
		System.out.println(name.matches(nameReg)?"Valid name":"Invalid name");
		System.out.println(mobile.matches(mobileReg)?"Valid number":"Invalid number");
		System.out.println(email.matches(emailReg)?"Valid Email":"Invalid Email");
	}
	
}
