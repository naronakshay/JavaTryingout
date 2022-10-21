package workout;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your id");
		String n=sc.next();
		
		if(n.length()==12) {
			Pattern p=Pattern.compile("^GBL/([0-9]){3}/[0-9]{4}");
			Matcher m =p.matcher(n);
			boolean found =m.find();
			
			if (found) {
                System.out.println("Login success");
            }
            else
                System.out.println("Incorrect ID");
			
			
		}

}

}