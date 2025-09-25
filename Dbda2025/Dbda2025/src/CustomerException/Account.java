package CustomerException;

public class Account {
	
	String acctype ; 
	int accnum; 
	double minbal;
	static double r = 8.5;
	static int t =5;
	
	public Account(String acctype, int accnum, double minbal) {
		this.acctype = acctype;
		this.accnum = accnum;
		this.minbal = minbal;
	}
	public double Calint() throws  // double so use return
	NegativeBalanceException{
		if(minbal<0) {
			throw new NegativeBalanceException("Balance cannot be Negative !!!");
		}
		return (minbal*t*r)/100;
		}
	
	public void disp1() {
		System.out.println("Account Type: "+acctype);
		System.out.println("Account Number: "+accnum);
		System.out.println("Balance : "+minbal);
		System.out.println("Interest : "+r);
		System.out.println("Time : "+t);
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
