import java.util.*;








class ArrayManipulation{

public String getPriceDetails(){
	 
	try{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n = sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the element");
		arr[i]=sc.nextInt();

	}
	System.out.println("Enter the Index:");
	int index=sc.nextInt();
	return "The Array element is "+arr[index];
	

	}
	catch(ArrayIndexOutOfBoundsException ae)
	{
		return "Array Index is out of range";

	}	
	catch(InputMismatchException ie)
	{
		return "Input was not in the correct format";
	}

}


public static void main(String args[]){


	ArrayManipulation o = new ArrayManipulation();
	String str = o.getPriceDetails();
	System.out.println(str);



}




}