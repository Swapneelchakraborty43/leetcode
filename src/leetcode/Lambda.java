package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book{
	private int id;
	private String title;
	private String author;
	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + "]";
	}
	
}

public class Lambda {
	
	
	static List<Book> list = new ArrayList<Book>();

    static{
        list.add(new Book(2,"java complete ref", "herbert"));
        list.add(new Book(3,"think in java", "laltu"));
        list.add(new Book(4,"python is op", "gobi"));
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bid = 2;
		Stream<Book>s = list.stream();
		Stream<Book> filter = s.filter(n-> n.getId()==bid);
		System.out.println(filter.findFirst().get());
		
		
		//list.forEach(n->System.out.println(n.toString()));
		

	}

}
