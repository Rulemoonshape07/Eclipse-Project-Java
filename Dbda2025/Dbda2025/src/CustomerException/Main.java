package CustomerException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a = new Account("Savings", 10001 , 50000);
		
		Customer c = new Customer("Sobhy","HYD",101,987564321L, a);
		
		c.disp();
		
		
		try {
			double r = a.Calint();
			System.out.println("Interest : "+r);
		}
		catch(NegativeBalanceException e) {
			System.out.println("Exception : "+e.getMessage());
		}

	}

}
