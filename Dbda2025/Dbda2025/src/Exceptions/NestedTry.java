package Exceptions;

import java.util.*;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 2 No.s : ");
		int a = sc.nextInt();
		int b = sc.nextInt(); //there is error for b=0
		int[] arr = new int[5];
		
		try {
			try { // works for b if want for a upside before int a ,b
				System.out.println("Division : "+(a/b));
			
			}
			catch(ArithmeticException e) {
				System.err.println(e);
				}
		
		
			try {
				System.out.println(arr[6]);

			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println(e);
			//e.printStackTrace();
			}
		}
		
		catch(Exception e) {
			System.err.println(e);
		}
	
	finally {
		System.out.println("Operation is Completed" );
		sc.close();
		}
	}
}


//
//Problem: Nested Try Blocks with Multiple Exceptions
//Task: Write a program that demonstrates the use of nested try blocks.
//The program should perform the following tasks:
//try should have two separate try blocks.
//In the first nested try:
//Divide two integers, handling any potential ArithmeticException.
//
//Within the second try block, initialize an array and attempt 
//to access an out-of-bounds index, handling the 
//ArrayIndexOutOfBoundsException.
//Ensure that appropriate messages are printed for each exception, and that a final message is printed indicating the completion of the operation.
