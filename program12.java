package workout;
import java.util.*;
import java.util.stream.*;


 class Employee1 {
	private String empId;
	private String empName;
	private double salary;

	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}


class EmployeeUtility{
	public Employee1[] getEmployeeDetails(String[] details)
	{
		Employee1 ob[] =new Employee1[details.length];
		for(int i=0;i<details.length;i++) {
			String x[] =details[i].split(";");
			Employee1 o=new Employee1();
	        o.setEmpId(x[0]);
	        o.setEmpName(x[1]);
	        o.setSalary(Double.parseDouble(x[2]));
	           
	        ob[i]=o;
		}
		return ob;
	}
	
	public Stream <Employee1> getStreamOfEmployee(Employee1[] empDetails){
		Stream<Employee1> s=Arrays.stream(empDetails);
        return s;
	}
	
	public String[] shortlistedEmployee (Stream <Employee1> empStream , Double minSalary)
	{
		ArrayList <String> name=new ArrayList<>();
		
		empStream.forEach(a->
		{
			if(a.getSalary()>=minSalary) {
				double d=a.getSalary();
				String sal=String.valueOf(d);
				name.add(a.getEmpId()+" "+a.getEmpName()+" "+sal);
			}
		}
				);
		
		String x[]=new String[name.size()];
        for(int i=0;i<x.length;i++){
            x[i]=name.get(i);
        }
        Arrays.sort(x);
        return x;
	}
}
public class program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the number of employee");
		int n=sc.nextInt();
		String a[]= new String [n];
		sc.nextLine();
		System.out.println("Enter the details of Employee");
		for(int i=0;i<n;i++) {
			String ip=sc.next();
			a[i]=ip;
			
		}
		
		System.out.println("Enter the minimum eligible salary");
		double minsal=sc.nextDouble();
		
		EmployeeUtility no= new EmployeeUtility();
		String [] result =no.shortlistedEmployee(no.getStreamOfEmployee(no.getEmployeeDetails(a)), minsal);
		if(result.length>0)	{
			System.out.println("Shortlisted Employees are");
			for(String s:result) {
				System.out.println(s);
			}
		}
		else {
			System.out.println("No Employee is having the required salary");
		}
		
		
		

	}

}
