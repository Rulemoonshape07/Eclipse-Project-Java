package Exceptions;

public class NullPE {
	//NullPointerException

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		
		try {
		System.out.println(s.length());
		}
		
		catch(NullPointerException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Operation is Completed");
		}
	}

}

//Problem 3: Null Pointer Exception
//Task: Write a program that initializes a string variable to null
//and then tries to call a method on it. Use a try block to call 
//the method and a catch block to handle the NullPointerException.
//Ensure a finally block prints a message indicating the operation 
//is complete

