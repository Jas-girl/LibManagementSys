package project;

import java.util.ArrayList;

public class Borrower {
	private int userId;
	private ArrayList<Book> books;
	private String name;
	Book book;
	
	public Borrower(int userId,String name) {
		super();
		this.userId = userId;
		this.books = new ArrayList<Book>();
		this.name = name;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public ArrayList<Book> getBook() {
		return books;
	}
	public void setBook(ArrayList<Book> book) {
		this.books = book;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	void borrowBook(Book book) {
		this.book=book;
		book.setAvailable(true);
	}
	void returnBook(Book book) {
		this.book=book;
		book.setAvailable(false);
	}
	
	@Override
	public String toString() {
		return "Borrower [userId=" + userId + ", book=" + book + ", name=" + name + "]";
	}
	
	
//	Book b[];
//	public Borrower(Book b[]) {
//		this.b=b;
//	}
// Library l=new Library();
// void borrowTitle(Book b[],String title) {
//	 System.out.println("*********Search the book*******");
//	l.searchTitle(b,title);
//	
//	
// }
// public void searchAuthor(Book[] books, String author) {
//     System.out.println("********* Search Author's Books *********");
//     l.searchUser(books, author);
// }
// void returnBook(Book b[],String title) {
//	 System.out.println("********* Return The Book *********");
//	 l.returnTitle(b, title);
// }
}
