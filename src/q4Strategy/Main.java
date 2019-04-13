package q4Strategy;

public class Main {

	public static void main(String[] args) {
		BookLibrarian librarian = new BookLibrarian();
		
		librarian.addBook(new BookInformation("Marcel Proust", "In Search of Lost Time", 1913, 
				"Swann's Way, the first part of A la recherche de temps perdu, Marcel Proust's "
				+ "seven-part cycle, was published in 1913."));
		librarian.addBook(new BookInformation("Miguel de Cervantes", "Don Quixote", 1605, 
				"Alonso Quixano, a retired country gentleman in his fifties, lives in an "
				+ "unnamed section of La Mancha with his niece and a housekeeper."));
		librarian.addBook(new BookInformation("Herman Melville", "Moby Dick", 1851, 
				"Melville's masterpiece is, in Elizabeth Hardwick's words, \"the greatest "
				+ "novel in American literature.\" "));
		librarian.addBook(new BookInformation("Leo Tolstoy", "War and Peace", 1869, 
				"Epic in scale, War and Peace delineates in graphic detail events leading "
				+ "up to Napoleon's invasion of Russia."));
		librarian.addBook(new BookInformation("William Shakespeare", "Hamlet", 1599, 
				"The Tragedy of Hamlet, Prince of Denmark, or more simply Hamlet, is a "
				+ "tragedy by William Shakespeare, believed to have been written around 1599."));
		librarian.addBook(new BookInformation("Jordan Peterson", "12 Rules For Life", 2018, 
				"An Antidote to Chaos is a 2018 self-help book by Canadian clinical "
				+ "psychologist and psychology professor Jordan Peterson."));
		librarian.addBook(new BookInformation("Andrew Murray", "Absolute Surrender", 1895, 
				"Absolute Surrender extols the need for \"absolute surrender\" to God."));
		librarian.addBook(new BookInformation("Friedrich Nietzsche", "Beyond Good and Evil", 1886, 
				"Prelude to a Philosophy of the Future is a book by philosopher Friedrich Nietzsche "
				+ "that expands the ideas of his previous work"));
		librarian.addBook(new BookInformation("Friedrich Nietzsche", "Thus Spoke Zarathustra", 1883, 
				"A Book for All and None is a philosophical novel by German philosopher Friedrich Nietzsche."));
		librarian.addBook(new BookInformation("Immanuel Kant", "Critique of Pure Reason", 1781, 
				"The author seeks to determine the limits and scope of metaphysics."));
		librarian.addBook(new BookInformation("Jordan Peterson", "Peacemaking Among Higher Order Primates", 2018, 
				"It is therefore the job of the peacemaker to bridge the gap between opinions, and in that manner, "
				+ "bring about reconciliation."));
		librarian.addBook(new BookInformation("C. S. Lewis", "Mere Christianity", 1952, 
				"Adapted from a series of BBC radio talks made between 1941 and 1944, while Lewis was at Oxford "
				+ "during the Second World War."));
		librarian.addBook(new BookInformation("C. S. Lewis", "The Abolition of Man", 1943, 
				"Reflections on education with special reference to the teaching of English in the upper forms "
				+ "of schools"));
		librarian.addBook(new BookInformation("John F. MacArthur", "Doce Hombres", 2002, 
				"Look no further than the twelve disciples whose many weaknesses are forever preserved "
				+ "throughout the pages of the New Testament."));
		librarian.addBook(new BookInformation("Ravi Zacharias", "The End of Reason", 2008, 
				"When you pray, are you talking to a God who exists? Or is God nothing more than your "
				+ "“imaginary friend,” like a playmate contrived by a lonely and imaginative child?"));
		librarian.addBook(new BookInformation("Immanuel Kant", "Groundwork of the Metaphysic of Morals", 1785, 
				"The first of Immanuel Kant's mature works on moral philosophy and remains one of the most influential "
				+ "in the field."));
		librarian.addBook(new BookInformation("Joshua Becker", "The More of Less", 2016, 
				" Most of us know we own too much stuff. We feel the weight and burden of our clutter, "
				+ "and we tire of cleaning and managing and organizing."));
		librarian.addBook(new BookInformation("Ben Shapiro", "True Allegiance", 2016, 
				"Ben Shapiro’s new novel asks how close are we to our country’s collapse—and will we "
				+ "be able to stop it once it begins?"));
		librarian.addBook(new BookInformation("Douglas Crockford", "JavaScript: The Good Parts", 2008, 
				"Most programming languages contain good and bad parts, but JavaScript has more than "
				+ "its share of the bad."));
		librarian.addBook(new BookInformation("Benjamin Listwon", "Vue.js in Action", 2018, 
				"Vue.js is a lightweight frontend framework, offering easy two-way data binding, a reactive "
				+ "UI, and a common-sense project structure."));
		
		// Unsorted
		System.out.println("Sort: Unsorted");
		librarian.printList();
		
		// Sort by Author
		System.out.println("\n\nSort: Author alphabetical");
		librarian.setSortMethod(new SortBook("author"));
		librarian.printList();
		
		// Sort by Title
		System.out.println("\n\nSort: Title alphabetical");
		librarian.setSortMethod(new SortBook("title"));
		librarian.printList();
		
		
		// Sort by Year Published
		System.out.println("\n\nSort: Year Published oldest");
		librarian.setSortMethod(new SortBook("year published"));
		librarian.printList();
	}

}
