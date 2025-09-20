package Interface9;



public interface Java9Interface {
	String name ="CDAC HYD";
	void dispName();
	default void test() {
		System.out.println("Default method");
		testPrivate();
	}
	static void teststatic() {
	System.out.println("PVT METHOD");
	testPvtStatic();
		// TODO Auto-generated method stub

	}
	private void testPrivate() {
		System.out.println("PVT METHOD");
		
	}
	private static void testPvtStatic() {
		System.out.println("Its a private static method");
	}
}
