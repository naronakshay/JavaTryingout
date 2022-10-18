package workout;
import java.util.*;
public class program1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER");
		int a = sc.nextInt();
		System.out.println("ENTER THE SECOND NUMBER");
		int b = sc.nextInt();
		
		int c=0;
		for(int i=1; i<a || i<b; i++) {
			if(a%i==0 && b%i==0) {
				c=c+1;
			}
		}
		
		System.out.println(c+"numbers can divide both "+a+"and"+b);
	}

}
