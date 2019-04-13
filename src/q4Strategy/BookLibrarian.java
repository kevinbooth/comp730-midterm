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
	
	public void sort() {
		if (sortMethod != null) {
			List<BookInformation> sortedBooks = sortMethod.sort(books);
			print(sortedBooks);
		} else {
			System.out.println("A sorting method has not been defined.");
			print(books);
		}
	}
	
	private void print(List<BookInformation> bookList) {
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
