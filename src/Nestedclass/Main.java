package Nestedclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person() { //Instantiating the class object
			public void eat() { // purpose of annonomous class : combining the class or instances of class
				
				System.out.println("Your Brain you can eat!!!");
				
			}
			//class defination
			
		};
		p.eat();

	}

}
