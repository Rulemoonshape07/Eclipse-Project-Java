package Nestedclass;
// Annonymous class
public interface Person {

	public void eat();
	
	public static void main(String[] args) {
		
		new Person() {
			public void eat() {
				System.out.println("Biryani!!!");
			}
		}.eat();
	}
}
