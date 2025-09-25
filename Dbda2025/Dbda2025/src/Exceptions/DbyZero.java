package Exceptions;
import java.util.Scanner;


public class DbyZero { //Division by Zero
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 No.s : ");
		int a = sc.nextInt();
		int b = sc.nextInt(); //there is error for b=0
		
		try { // works for b if want for a upside before int a ,b
			System.out.println("Division : "+(a/b));
			
		}
		catch(ArithmeticException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("The operation is complete");
			sc.close(); // To Avoid Warning of Scanner
		}
		
		
	}

}


//Problem 1: Division by Zero
//Task: Write a program that takes two integers from the user 
//and performs division. Use a try block to perform the division, 
//and a catch block to handle the ArithmeticException in case
//of division by zero. Ensure that a finally block prints a message
//indicating that the operation is complete.
