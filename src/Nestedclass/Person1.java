package Nestedclass;

public abstract class Person1 {
	
	
	

		abstract void eat();
		void speak() {
			System.out.println("SPEAKS JAVA");
		}
		
		public static void main(String[] args) {
			
			Person1 p = new Person1() { // if 2 methods we maded then we need to make obj but if 1 we can diectly call it
				public void eat() {
					System.out.println("Biryani!!!");
				}
				
			void speak() {
				System.out.println("SPEAK PYTHON");
				
			}
			};
			p.eat();
			p.speak();
		}
}
