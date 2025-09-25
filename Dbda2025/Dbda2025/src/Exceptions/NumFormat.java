package Exceptions;
import java.util.Scanner;

public class NumFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String a = sc.next();
		
		try { // only numbers are taken into consideration
			int n = Integer.parseInt(a);		}
		catch( NumberFormatException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Operation is completed");
			sc.close();
		}

	}

}
//Problem 4: Number Format Exception
//Task: Write a program that takes a string input from the user and tries to convert it to an integer. 
//Use a try block to perform the conversion and a catch block to handle the NumberFormatException. 
//Ensure a finally block prints a message indicating the operation is complete.
