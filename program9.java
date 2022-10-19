package workout;

import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a[]=new int[4];
		System.out.println("Enter the digits");
		for(int i=0;i<4;i++) {
			a[i]=sc.nextInt();
			System.out.println(a[i]+"-"+((char)(a[i])));
		}
		
		
	}

}
