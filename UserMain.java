package workout;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your id");
		String n=sc.next();
		
		if(n.contains("GBL")) {
			System.out.println("Login successs");
		}
		else
			System.out.println("Incorrect ID");

	}

}
