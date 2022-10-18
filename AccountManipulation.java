
class Customer{
	private int customerid;
	String customrName;
	String emailid;
	
	public Customer(int id,String cname,String email) {
		super();
		this.customerid=id;
		this.customrName=cname;
		this.emailid=email;
	}
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomrName() {
		return customrName;
	}
	public void setCustomrName(String customrName) {
		this.customrName = customrName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	
}

abstract class Account{
	protected int  accountNumber;
	protected Customer o;
	protected double balance;
	
	public Account (int n,Customer ob,double b)
	{
		this.accountNumber=n;
		this.o=ob;
		this.balance=b;
}
	
	public abstract boolean withdraw(double amount);

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Customer getO() {
		return o;
	}

	public void setO(Customer o) {
		this.o = o;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}

 class SavingsAccount extends Account{
	private double minimumBalance;

	public double getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	public SavingsAccount(int an,Customer co,int b,int minb) {
		super(an,co,b);
		this.minimumBalance=minb;
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance-amount > this.minimumBalance) {
			balance=balance-amount;
			return true;
		}
		
		else
			return false;
	}
	
}

public class AccountManipulation {

	public static void main(String[] args) {
		
		Customer c= new Customer(100,"Akshay","akshay@gmail.com");
		SavingsAccount s=new SavingsAccount(300,c,5000,2000);
		if(s.withdraw(1000))
			System.out.println("withdraw succsessful");
		else
			System.out.println("withdraw unsuccssesful");
	}

}
