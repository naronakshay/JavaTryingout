import java.util.*;


class Diamond2{

	public static void main(String [] args)
		{

			Scanner sc= new Scanner(System.in);
			int n = sc.nextInt();
			
			
				for(int i=0;i<n;i++)
				{
					for(int j=i;j<n;j++)
					{
						System.out.print("*");
					}
					for(int k=0;k<2*i-1;k++)
					{
						System.out.print(" ");
					}
					for(int l=i;l<n;l++)
					{
						System.out.print("*");
					}
					System.out.println();
				}

				for(int i=n;i>0;i--)
				{
					for(int j=n;j>i;j--)
					{
						System.out.print("*");
					}
					for(int k=0;k<2*i-1;k++)
					{
						System.out.print(" ");
					}
					for(int l=n;l>i;l--)
					{
						System.out.print("*");
					}
					System.out.println();
				}
		

		}




}