package workout;

abstract class  Employee{
	protected int employeeId;
	protected String employeeName;
	protected double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int empid,String empn) {
		this.employeeId=empid;
		this.employeeName=empn;
		
	}
	public abstract void calculateSalary();
}
class PermanentEmployee extends Employee {
	private double basicPay;

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public PermanentEmployee(int empid, String empn, double basicPay) {
		super(empid, empn);
		this.basicPay = basicPay;
	}
	
	public void  calculateSalary() {
	double salary= this.basicPay-(this.basicPay*0.12);
	this.setSalary(salary);
	}
	
}


class TemporaryEmployee extends Employee{
	private int hoursWorked;
	private int hourlyWages;
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyWages() {
		return hourlyWages;
	}
	public void setHourlyWages(int hourlyWages) {
		this.hourlyWages = hourlyWages;
	}
	public TemporaryEmployee(int empid, String empn, int hoursWorked, int hourlyWages) {
		super(empid, empn);
		this.hoursWorked = hoursWorked;
		this.hourlyWages = hourlyWages;
	}
	
	public void calculateSalary() {
		double salary=this.hourlyWages*this.hoursWorked;
		this.setSalary(salary);
	}
}

class Loan{
	public double calculateLoanAmount(Employee eo) {
		
		double loan=0.0;
		if(eo instanceof TemporaryEmployee) {
			loan=10*eo.getSalary()/100;
			
		}
		else if (eo instanceof PermanentEmployee ){
			loan=10*eo.getSalary()/100;
		}
		return loan;
	}
}

public class program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PermanentEmployee pe=new PermanentEmployee(101,"akshay",50000);
		pe.calculateSalary();
		System.out.print(pe.getEmployeeId()+" "+pe.getEmployeeName()+" "+pe.getBasicPay()+" ");
		System.out.println(pe.getSalary());
		Loan l=new Loan();
		double m=l.calculateLoanAmount(pe);
		System.out.println("Loan amount for"+pe.getEmployeeName()+"="+m);
		TemporaryEmployee te = new TemporaryEmployee (102,"adhwiath",20,1000);
		te.calculateSalary();
		System.out.print(te.getEmployeeId()+" "+te.getEmployeeName()+" ");
		System.out.println(te.getSalary());
		double m2 =l.calculateLoanAmount(te);
		System.out.println("Loan amount for "+te.getEmployeeName()+" "+m2);
		
		
	}

}
