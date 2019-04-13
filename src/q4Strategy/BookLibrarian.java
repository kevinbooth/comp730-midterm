package q4Strategy;

import java.util.ArrayList;
import java.util.List;

public class BookLibrarian {
	private List<BookInformation> books = new ArrayList<BookInformation>();
	private SortBook sortMethod;
	
	public BookLibrarian() { }
	
	public void addBook(BookInformation b) {
		books.add(b);
	}
	
	public void printList() {
		List<BookInformation> bookList;
		
		if (sortMethod != null) {
			bookList = sortMethod.sort(books);
		} else {
			bookList = books;
		}
		
		for (BookInformation b : bookList) {
			System.out.println(	
							"Author: " + b.getAuthor() +
							"\t\tTitle: " + b.getTitle() +
							"\t\tYear Published: " + b.getYearPublished() +
							"\n\tSummary: " + b.getSummary()
							);
		}
	}
	
	public void setSortMethod(SortBook sortMethod) {
		this.sortMethod = sortMethod;
	}
}
