package CustomerException;

public class Customer {

	
		
		String name;
		String add;
		int id;
		long phnum;
		Account account; // association
		
		public Customer(String name, String add, int id, long phnum, Account account) {
			this.name = name;
			this.add = add;
			this.id = id;
			this.phnum = phnum;
			this.account = account;
		}
		public void disp() {
			System.out.println("Name: "+name+"\nAddress: "+add+"\nID : "+id+"\nPhone Number : "+phnum);
			account.disp1();
			
			
		}
		
		

	}



//Problem 1: Create Customer class with the relevant information like name, address, id, phone no etc. 
//Write a parameterized constructor and relevant methods (disp(), etc) appropriately.         
//Create Account class with account type, account number, minimum balance etc.,
//Write calculateInterest method (use simple interest – assume time and rate appropriately).
//Create a user defined exception class “NegativeBalanceException” and throw that exception
//when there is negative balance while calculating the interest.
//Use Account class in Customer class display the details of 
//customer with account information. (No Inheritance – use association only)