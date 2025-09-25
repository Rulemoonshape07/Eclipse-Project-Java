package Exceptions;

public class ArrayOBE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[5];
		
		try {
		System.out.println(arr[6]);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e);
			//e.printStackTrace();
		}
		System.out.println("Exception Handled");

	}

}
