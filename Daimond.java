import java.util.*;
import java.lang.*;



class Daimond{
	
	public static void main (String [] args)
		{
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the number of lines");
			int n=sc.nextInt();
			

			for(int i=0;i<n;i++)
				{
					for(int j=i;j<n;j++)
					{
						System.out.print(" ");
					}
					for(int k=0;k<2*i-1;k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}

			for(int i=n;i>0;i--)
				{
					for(int j=n;j>i;j--)
					{
						System.out.print(" ");
					}
					for(int k=0;k<2*i-1;k++)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		
		}




}