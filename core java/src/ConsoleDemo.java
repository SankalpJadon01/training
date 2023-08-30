import java.util.Scanner;

public class ConsoleDemo {
public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
	System.out.print("Enter name :");
	String name = console.next();
		System.out.println("Your name:"+ name);
		System.out.print("Enter age:");
		int age = console.nextInt();
		System.out.println("Your age:  "+age);
}
}
