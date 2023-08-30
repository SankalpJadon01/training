import java.util.Iterator;
import java.io.*;
import java.util.*;

public class EmailValidator {
public static void main(String[] args) {
	//1- min 4 chars before @
	// 2 - min 3 chars between @ and .
	// 3 - min 2 chars after .
	// 4 - Only 1 occurence of @ and . is allowed
	// Note : No regular expression allowed
	
	
//	String email = "sankalpjadon18@gmail.com";
//	boolean beforeat4 = false; 
//	boolean betweenatanddot3 = false;
//	boolean afterdot2 = false;
//	
//	if(email.lastIndexOf('@')==email.indexOf('@') && email.lastIndexOf('.')==email.indexOf('.') && email.indexOf('@')!=-1 ) //Checking if we have only 1 occurrence of @ and .
//	{
//	    beforeat4 = email.substring(0,email.indexOf('@')).length()>3; // checking if min 4 char before @
//		betweenatanddot3 = email.substring(email.indexOf('@')+1,email.indexOf('.')).length()>2; // checking if min 3 chars between @ and .
//		afterdot2 = email.substring(email.indexOf('.')+1,email.length()).length()>1; // checking if min 2 char after .
//	}
//	
//	if(beforeat4==true && betweenatanddot3==true && afterdot2==true)System.out.println("Email is valid"); //checking if all conditions are true
//	else System.out.println("Email is invalid");
	String email = "sankalpjadon18@gmail.com";
	int iat = email.indexOf('@');
	int idot = email.indexOf('.');
	
	if(iat == email.lastIndexOf('@')&& idot == email.lastIndexOf('.')&&iat>=4 && (idot-iat)>=3 && (email.length()-idot)>=2)
	System.out.println("valid email");
	else System.out.println("Invalid email");
		

	}

}

