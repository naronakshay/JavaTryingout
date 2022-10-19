
import java.util.*;

class Book{
	private int  isbnno;
	private String bookName;
	private String author;
	public int getIsbnno() {
		return isbnno;
	}
	public void setIsbnno(int isbnno) {
		this.isbnno = isbnno;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}

class Library {
	private ArrayList <Book>bookList = new ArrayList();

	public ArrayList  <Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList  <Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	
	public boolean isEmpty() {
		return bookList.isEmpty();
	}
	
	public ArrayList <Book> viewllBooks(){
		return bookList;
	}
	
	public ArrayList <Book> viewBooksByAuthor (String author){
		ArrayList <Book> booklist2 = new ArrayList();

		for(Book book:bookList) {
			if(book.getAuthor().contains(author)) {
				booklist2.add(book);
			}
			
			
			
			
		}
		return booklist2;
		
	}
	
	public int countnoofbook(String bname) {
		int c=0;
		for(Book b3:bookList) {
			if(b3.getBookName().contains(bname))
				c++;
		
		}
		return c;
	}
}


public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l = new Library();
		while(true) {
			System.out.println("1.Add Book");
			System.out.println("2.Display all book details");
			System.out.println("3.Search Book by author");
			System.out.println("4.Count number of books -by book");
			System.out.println("5.Exit");
			System.out.println("Enter the choice");
			
			Scanner sc= new Scanner(System.in);
			int c= sc.nextInt();
			
			
			
			switch(c) {
			
			case 1: 
				System.out.println("Enter the isbn no:");
				int n = sc.nextInt();
				System.out.println("Enter the book name");
				String name=sc.next();
				System.out.println("Enter the author name");
				String aname=sc.next();
				
				Book b=new Book();
				b.setAuthor(aname);
				b.setBookName(name);
				b.setIsbnno(n);
				l.addBook(b);break;
			case 2:
				
				
				for(Book bo: l.getBookList()) {
					System.out.println(bo.getIsbnno());
					System.out.println(bo.getBookName());
					System.out.println(bo.getAuthor());
				}
					
				break;
				
			case 3:
				System.out.println("Enter the author name");
				String a=sc.next();
				
				List<Book> books = l.viewBooksByAuthor(a);
				if(books.isEmpty())
					System.out.println("No book exixts");
				else
				{
					for(Book b2:books) {
						System.out.println(b2.getIsbnno());
						System.out.println(b2.getBookName());
						System.out.println(b2.getAuthor());
					}
				}
				
				break;
					
			case 4:
				
				System.out.println("Enter the book name");
				String a2=sc.next();
				int x=l.countnoofbook(a2);
				System.out.println(x);
				break;
			case 5:
				System.exit(0);
			
				
						
			
			}



			
		}

	}

}
