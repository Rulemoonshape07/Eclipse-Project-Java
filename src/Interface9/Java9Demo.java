package Interface9;

public class Java9Demo implements Java9Interface{

	@Override
	public void dispName() {
		// TODO Auto-generated method stub
		System.out.println(name);
		
	}
	public static void main(String[] args) {
		Java9Interface d = new Java9Demo();
		d.dispName();
		d.test();
	}
	

}
