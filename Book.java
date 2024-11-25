package project;

public class Book {
	private String title;
	private String author;
	private int isbn;
	private boolean isAvailable;
	private String genre;
	
	public Book(String title, String author, int isbn,String genre) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre=genre;
		this.setAvailable(isAvailable);
	}
	
	public void setTitle(String title) {
		if(title.length()<3) {
			try {
				throw new InvalidTitleException("title should be long");
			}
			catch(InvalidTitleException p) {
				System.out.println(p);
			}
			
		}
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getIsbn() {
		return isbn;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", isbn=" + isbn + ", isAvailable=" + isAvailable
				+ ", genre=" + genre + "]";
	}
	
	
}
