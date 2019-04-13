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
		List<BookInformation> sortedBooks = sortMethod.sort(books);
		print(sortedBooks);
	}
	
	public void print(List<BookInformation> bookList) {
		for (BookInformation b : bookList) {
			System.out.print(	
							"Author: " + b.getAuthor() +
							" Title: " + b.getTitle() +
							" Year Published: " + b.getYearPublished() +
							" Summary: " + b.getSummary()
							);
		}
	}
	
	public void setSortMethod(SortBook sortMethod) {
		this.sortMethod = sortMethod;
	}
}
