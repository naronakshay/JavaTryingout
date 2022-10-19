import java.util.*;



class Temp{

	public static void main (String [] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Choose Appropriate option");
		System.out.println("1.CELCIUS TO FARANHEIT");
		System.out.println("2.FARENHEIT TO CELCIUS");
		int c = sc.nextInt();

		switch(c){
		
		case 1: 
			System.out.println("Enter temperature in celcius");
			float t=sc.nextFloat();
			
			float f = (t * 9 / 5) + 32;
			System.out.println(f);
			break;
		case 2:
			System.out.println("Enter temperature in farenhiet");
			double t2=sc.nextFloat();
			double ce = (t2-32)*5/9;
			System.out.println(ce);
			break;
				
		default:
			System.out.println("Select Approproate Option");
			
		}

	}




}