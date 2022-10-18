import java.util.Scanner;

class Swap

{
	public static void main (String args[])
	{
		System.out.println("First Number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Second Number:");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("First Number:"+a);
		System.out.println("Second Number:"+b);
		
		



	}



}