package workout;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no of elements ");
		int n =sc.nextInt();
		
		if(n<=0)
		{
			System.out.println("Invalid range ");
		}
		else
		{
			int arr[]= new int[20];
			System.out.println("Enter the elements");
			int sum=0;
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				sum=sum+arr[i];
				System.out.print(sum+" ");
		}
		
		
		}

	}

}
