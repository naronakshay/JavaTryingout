package workout;

import java.util.*;

interface Loan1{
	abstract double issueLoan();
}

interface Insurance{
	abstract double takeInsurance();
}


class Vehicle implements Loan1 , Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private  String vehicleType;
	private double price;
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle(String vehicleNumber, String modelName, String vehicleType, double price) {
		super();
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		this.price = price;
	}
	
	public double issueLoan() {
		if(vehicleType.equals("4 wheeler")) {
			return (price-(price*20/100));
		}else if(vehicleType.equals("3 wheeler")) {
			return (price-(price*25/100));
		}else if(vehicleType.equals("2 wheeler")) {
			return (price-(price*50/100));
		}
		return price;
	}
	public double takeInsurance() {
		if(price<=150000) {
			price = 3500;
		}
		else if(price>150000 && price<=300000) {
			price=4000;
		}
		else if(price>300000) {
			price=5000;
		}
		return price;
		
	}
	
	
	
	
}




public class program15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the vehicle number");
		String vn= sc.next();
		System.out.println("Enter the model name:");
		String mn=sc.next();
	
		System.out.println("Enter the vehicle type:");
		String vt=sc.next();
		sc.nextLine();
		System.out.println("Enter the price:");
		double p=sc.nextDouble();
		
		Vehicle v= new Vehicle(vn,mn,vt,p);
		System.out.println("Loa is "+v.issueLoan());
		System.out.println("Insurance is "+v.takeInsurance());
		

	}

}
