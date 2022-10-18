package workout;
import java.util.*;
class Account{
	private String accountNumber;
	private double balance;
	private String customerName;
	
	public Account(String  ac, String n , double b) {
		this.accountNumber=ac;
		this.balance=b;
		this.customerName=n;
		
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}

interface MaintananceCharge{
	public float calculateMaintananceCharge(float noOfYears);
}

class CurrentAccount extends Account implements MaintananceCharge {
	public CurrentAccount(String  ac, String n , double b)
	{
		super(ac,n,b);
	}
	public float calculateMaintananceCharge(float noOfYears)
	{
		return 100*noOfYears;
		
	}
}

class SavingsAccount extends Account implements MaintananceCharge {
	public SavingsAccount(String  ac, String n , double b)
	{
		super(ac,n,b);
	}
	public float calculateMaintananceCharge (float noOfYears)
	{
		return 50*noOfYears;
		
	}
}




public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Savings Account");
		System.out.println("2.Current Account");
		System.out.println("Enter Your Choice");
		
		Scanner sc=new Scanner(System.in);
		int c= sc.nextInt();
		System.out.println("Enter Account Number");
		String ac=sc.next();
		System.out.println("Enter Customer Name");
		String n=sc.next();
		System.out.println("Enter the balance amount");
		double b=sc.nextDouble();
		System.out.println("Enter the number of years");
		float y=sc.nextFloat();
		
		if(c==1)
		{
			SavingsAccount o = new SavingsAccount(ac,n,b);
			System.out.println("Customer Name "+o.getCustomerName());
			System.out.println("Account Number"+o.getAccountNumber());
			System.out.println("Account Balance"+o.getBalance());
			System.out.println("Maintanance Charge Savings Account "+o.calculateMaintananceCharge(y));
		}
		else if(c==2)
		{
			CurrentAccount o = new CurrentAccount(ac,n,b);
			System.out.println("Customer Name "+o.getCustomerName());
			System.out.println("Account Number"+o.getAccountNumber());
			System.out.println("Account Balance"+o.getBalance());
			System.out.println("Maintanance Charge Savings Account "+o.calculateMaintananceCharge(y));
		}
		else 
		{
			System.out.println("Enter a valid choice ");
		}
		
	}

}
