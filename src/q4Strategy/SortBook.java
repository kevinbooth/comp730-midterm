package q4Strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBook {
	
	String field;
	
	public SortBook(String field) {
		this.field = field;
	}
	
	public List<BookInformation> sort(List<BookInformation> books) {
		List<BookInformation> sorted;
		
		if (field == "author") {
			sorted = sortAuthor(books);
			return sorted;
		} else if (field == "title") {
			sorted = sortTitle(books);
			return sorted;
		} else if (field == "yearPublished") {
			sorted = sortYearPublished(books);
			return sorted;
		} else {
			System.out.println("The specified sorting field is invalid");
			return books;
		}
	}
	
	public List<BookInformation> sortAuthor(List<BookInformation> books) {
		Collections.sort(books, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation b1, BookInformation b2) {
				return String.valueOf(b1.getAuthor()).compareTo(b2.getAuthor());
			}
		});
		
		return books;
	}
	
	public List<BookInformation> sortTitle(List<BookInformation> books) {
		Collections.sort(books, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation b1, BookInformation b2) {
				return String.valueOf(b1.getTitle()).compareTo(b2.getTitle());
			}
		});
		
		return books;
	}
	
	public List<BookInformation> sortYearPublished(List<BookInformation> books) {
		Collections.sort(books, new Comparator<BookInformation>() 
		{
			public int compare(BookInformation b1, BookInformation b2) {
				return Integer.valueOf(b1.getYearPublished()).compareTo(b2.getYearPublished());
			}
		});
		
		return books;
	}
}
