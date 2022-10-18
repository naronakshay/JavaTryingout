package workout;

import java.util.Scanner;
import java.util.*;

public class program2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
		System.out.println("ENTER THE  LENGTH OF ARRAY OF NUMBERS:");
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the element "+i);
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println("ENTER THE SUM");
		int a = sc.nextInt();
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==a)
				{
					if(!(hm.containsValue(arr[i])))
						hm.put(arr[i], arr[j]);
				}
					
			}
		}
		
		for(Map.Entry m : hm.entrySet())
		{
			System.out.println("("+m.getKey()+","+m.getValue()+")");
		}
		

	}

}
