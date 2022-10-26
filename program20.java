package workout;
import java.util.Scanner;

public class program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE COUNT");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("ENTER THE ELEMENTS:");
		for(int i=0;i<n;i++)
		
			a[i]=sc.nextInt();
			
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
		
		for(int i=1;i<n;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 &&a[j]>key )
			{
							a[j+1]=a[j];
							j=j-1;
			
			}	
			a[j+1]=key;
		}
		
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(a[i]);
	}
}
