package workout;
import java.io.*;
import java.util.*;

class FileManager{
	
	static public File createFile() {
		File file = new File("C:\\Users\\ustjavafsdb125\\eclipse-workspace\\workout\\src\\workout\\example.txt");
        if (!file.exists()) {
           try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
        } 
        return file;
	}
	
	static public void writeFile(File f,String record)
	{
		try {
			FileWriter writer = new FileWriter(f,true);
			BufferedWriter b= new BufferedWriter(writer);
			b.append(record);
			b.close();
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	static public String[] readFile(File f) {
		
		Scanner sc;
		
		
		ArrayList <String> arr= new ArrayList<String>();
		try {
			sc = new Scanner(f);
			sc.useDelimiter(";");
		
			int l=0;
			while(sc.hasNext())
			{
				arr.add(sc.next());
	 		}
			sc.close();
			

			String [] a= new String[arr.size()];
			for(int i=0;i<arr.size();i++)
			{
				a[i]=arr.get(i);
			}
	
		
		return a;
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		System.out.println(e);
		}
		
		 return null;
	}
	
}



public class program17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		FileManager fm= new FileManager();
		File f=fm.createFile();
		while(true) {
			String input="";
			System.out.println("Enter name:");
			String n=sc.next();
			input+=n+",";
			System.out.println("Enter phone:");
			String p=sc.next();
			input+=p+",";
			System.out.println("Enter email:");
			String e=sc.next();
			input+=e+";";
			System.out.println(input);
			fm.writeFile(f, input);
			System.out.println("Do you want to enter another record ");
			String q=sc.next();
			if(q.equals("yes"))
				continue;
			else
				break;
			
			
		}
		
		
		String [] arr=fm.readFile(f);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

		
		
		
	}

}
