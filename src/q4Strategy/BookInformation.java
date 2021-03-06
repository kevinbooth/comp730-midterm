package q4Strategy;

public class BookInformation {
	private String author;
	private String title;
	private int yearPublished;
	private String summary;
	
	public BookInformation(String author, String title, int yearPublished, String summary) {
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.summary = summary;
	}
	
	public String getAuthor() { return author; }
	public String getTitle() { return title; }
	public int getYearPublished() { return yearPublished; }
	public String getSummary() { return summary; }
}
