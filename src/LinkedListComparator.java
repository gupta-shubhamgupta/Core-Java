import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
class Com implements Comparator<Book>{
	public int compare(Book b, Book d) {
		return b.id - d.id;
	}

	
}
class Book{
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Book(int id, String name, String author, String publisher, int quantity) {  
	    this.id = id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
	}  
}

public class LinkedListComparator {

	public static void main(String[] args) {
		List<Book> list=new LinkedList<Book>();  
	     
	    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
	    list.add(b1);  
	    list.add(b3);  
	    list.add(b2); 
	    Collections.sort(list, new Com());
	    for(Book b:list){  
	        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	        }  
	    
	}

}
