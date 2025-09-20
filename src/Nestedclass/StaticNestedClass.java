package Nestedclass;

public class StaticNestedClass {
	static private int x = 199139; // anything static u dont req obj
	
	static class Nested{ // but there is static method then u need static obj
		static  void msg() {
			System.out.println(x);
			
		}
	}
	public static void main(String[] args) {
		//StaticNestedClass.Nested d = new Nested();
		//d.msg();
		
		StaticNestedClass.Nested.msg();
		
		
	}

}
