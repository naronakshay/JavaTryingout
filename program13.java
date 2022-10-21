package workout;
import java.util.*;
public class program13 {
	
	 static String Checki(String str) {
     	
		 String result = "YES";
	        char[] strArr = str.toCharArray();
	        if(strArr[0] == '0')
	            result ="NO";
	        else {
	            for(int i=0;i<strArr.length;i++)
	            {
	                if(strArr[i] =='.')
	                {
	                    for(int j=i+1;j<strArr.length;j++)
	                    {
	                            if(strArr[j] != '0')
	                            {
	                                result = "NO";
	                                break;
	                            }
	                    }
	                }
	            }
	        }
	        return result;
		 
     }
	


	public static void main(String[] args) {

		Scanner sc=new Scanner (System.in);
        System.out.println("Enter the count");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++) {
        	String s=sc.next();
        	String out=Checki(s);
        	System.out.println(out);
        }
        
        
        
       

}



}


