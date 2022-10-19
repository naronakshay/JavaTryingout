
import java.util.*;
class Student{
	private int id ;
	private String name;
	private int marks [];
	private char grade;
	float avg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public Student(int id, String name, int[] marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		
	}
	
	public void calculateAvg() {
		int sum=0;
		for(int i=0;i<this.marks.length;i++)
		{
			sum=sum+marks[i];
		}
		this.avg=sum/marks.length;
		
	}
	
	public void findGrade() {
		if(avg>80 && avg<=100)
			this.setGrade('O');
		else if(avg<50)
			this.setGrade('F');
		else
			this.setGrade('A');
	}
	
}


public class program5 {
	
	public static Student getStudentDetails() {
		System.out.println("Enter the id");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("Enter the name :");
		String n=sc.next();
		int num;
		do {
			System.out.println("Enter the no of subjects:");
			 num=sc.nextInt();
			 if(num==0)
				 System.out.println("Enter a valid input");
			
		}while(num==0);
		int marks[]=new int[num];
		for(int i=0;i<num;i++) {
			int t;
			System.out.println("Enter the marks for subject"+(i+1));
			t=sc.nextInt();
			do
			{
				
				if(t>=0 && t<=100)
					marks[i]=t;
				else
				{
					System.out.println("Invalid mark");
					i--;
				}
			}while(t<=0 &&  t>=100);
		}
		Student o=new Student(id,n,marks);
		return o;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student o= getStudentDetails();
		System.out.println("Id:"+o.getId());
		System.out.println("Name"+o.getName());
		o.calculateAvg();
		System.out.println("Average"+o.avg);
		o.findGrade();
		System.out.println("Grade "+o.getGrade());
	}

}
