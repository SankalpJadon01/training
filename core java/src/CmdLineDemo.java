
public class CmdLineDemo {
public static void main(String[] args) {
	int sum =0;
	for (String a : args) {
		sum = sum+ Integer.parseInt(a);
	}
	System.out.println(sum);
	int x =10;
	Integer xo = x; //Boxing
	int z= xo; //Unboxing
	System.out.println(x + xo * z);
	// Java takes care of the boxing and unboxing hence called Auto-boxing
	
	
}
}

//Go to -> Run->Run configuration-> project