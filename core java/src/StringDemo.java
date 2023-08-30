
public class StringDemo {
public static void main(String[] args) {
	String s1 = "Hello";  //Created in StringPool
	String s2 = new String("Hello");  //Created in HEAP memory area
	String s3 ="Hello";//Created in StringPool
	
	System.out.println(s1);
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	
	// Comparing string values
	System.out.println(s1.equals(s2));
	System.out.println(s2.equals(s3));
	
	s1 = s1 + "World";
	System.out.println(s1);
	System.out.println(s1 == s3);
	System.out.println(s1.toUpperCase());
	System.out.println(s1.toLowerCase());
	System.out.println(s1.indexOf('o'));
	System.out.println(s1.lastIndexOf('o'));
	System.out.println(s1.charAt(5));
	
	System.out.println(s1.substring(3));
	System.out.println(s1.substring(3,7));
	System.out.println(s1.replace('o', 'e'));
	
	System.out.println(s1);
	
	String week = "Sun-Mon-Tue-Wed-Thurs-Frid-Sat";
	String[] days = week.split("-");
	for (String day : days) {
		System.out.println(day);

	}
	String num1= "10";
	String num2= "20";
    System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
}
}
// StringPool is a special memory area 
//All strings created in primitive style are stored here.
// When 2 strings are holding the same value they are sharing the same memory location
// In the case of string value manipulation a new memory area is created to store modified string
// Therefore it is not advisable to use String class in string centric applications
//There are 2 alternate to Stirng class named StringBuffer and StirngBuilder