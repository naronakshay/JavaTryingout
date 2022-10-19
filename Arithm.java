import java.util.*;



class Arithm{


	public static void main (String [] args)
	{

		int c;
		while(true){

		
		Scanner sc= new Scanner(System.in);
		System.out.println("Choose Appropriate option");
		System.out.println("1.ADDITION");
		System.out.println("2.SUBTRACTION");
		System.out.println("3.MULTIPLICATION");		
		System.out.println("4.DIVISION");
		System.out.println("5.EXIT");
		 c= sc.nextInt();
		if(c==5)
			System.exit(0);
		System.out.println("Enter the first number:");	
		float  x=sc.nextFloat();
		System.out.println("Enter the second number:");
		float  y=sc.nextFloat();
		switch(c){

		case 1 : System.out.println("Sum is "+ (x+y));break;
		case 2 : System.out.println("Difference  is "+ (x-y));break;
		case 3 : System.out.println("Product is "+ (x*y));break;
		case 4 : System.out.println("Quotient is "+ (x/y));break;
		case 5 : System.exit(0);
		default: System.out.println(" option not valid");
		

		}			

		}


	}



}