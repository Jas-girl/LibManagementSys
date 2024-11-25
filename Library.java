package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Library {
	ArrayList<Book> books=new ArrayList<Book>();
	ArrayList<Borrower> user=new ArrayList<Borrower>();
	Book book;
	Borrower person;
	Scanner sc=new Scanner(System.in);
	void already() {
			this.books.add(new Book("Ham","DrSeuss", 1013,"Children"));
			this.books.add(new Book("TheHungerGames ","SuzanneCollins", 1022, "Young adult"));
			this.books.add(new Book("Dune","FrankHerbert", 1032, "Science"));
			this.books.add(new Book("TheLeftHandofDarkness","UrsalaleGuin", 1042,"Science"));
			this.books.add(new Book("SwamiVivekanad","Sahitya", 2042,"Hindi"));
			this.books.add(new Book("GreenEggs","DrSeuss", 1012,"Children"));
		    this.books.add(new Book("SarvshreshthKahaniya","RabindranathTagore", 1042,"Science"));
		    for (Book book : books) {
				System.out.println(book);
			
		}	
		
		
	}
	void addBook() {
//		this.book=book;
		
		
		System.out.println("Enter the title");
		String title=sc.next();
		System.out.println("Enter the author");
		String author=sc.next();
		System.out.println("Enter the isbn number");
		int isbn=sc.nextInt();
		System.out.println("Enter the genre");
		String genre=sc.next();
		this.books.add(new Book(title,author,isbn,genre));
		System.out.println("Book is added successfully");
		
	}
	void viewBooks() {
		if(books.isEmpty()) {
			already();	
		}
		else {
			for (Book book : books) {
				System.out.println(book);
			
		}	
		}	
			
	}
	void searchTitle(String title) {
		if(books.isEmpty()) {
			already();	
		}
		boolean flag=true;
		for (Book book : books) {
			if(book.getTitle().equalsIgnoreCase(title)) {
//				System.out.println(book.toString());
				flag=true;
				break;
			}
		}
		System.out.println(flag==true?"Found the book of "+ title:"Not found");
	}
	void searchAuthor(String author) {
		if(books.isEmpty()) {
			already();	
		}
		boolean flag=true;
		for (Book book : books) {
			if(book.getAuthor().equalsIgnoreCase(author)) {
				System.out.println(book.toString());
				flag=true;
				
			}
		}
		//System.out.println(flag==true?"Found the book of "+ author:"Not found");
	}
	
	void removeBook(int isbn) {
		if(books.isEmpty()) {
			already();	
		}
		else {
			boolean flag=false;
			for (Book book : books) {
				if(book.getIsbn()==isbn) {
	                books.remove(book);
					flag=true;
					break;
				}
				
			}
			System.out.println(flag==true?"Remove the book of "+ isbn:"Not removed");
		}
		
	}
	
	void viewUser() {
		System.out.println(person.toString());
	}
	
	void borrowBook(String title) {
		if(books.isEmpty()) {
			already();	
		}
		System.out.println("Enter the userId");
		int userId=sc.nextInt();
		System.out.println("Enter the username");
		String name=sc.next();
		Book p=null;
		for (int i = 0; i < books.size(); i++) {
			if(books.get(i).getTitle().equalsIgnoreCase(title)) {
				p=books.get(i);
				break;
			}
		}
		if(p==null) {
			System.out.println("book is not found");
			return;
		}
		person=new Borrower(userId,name);
		person.borrowBook(p);
		System.out.println(person.toString());
		}
		
	
	
	void returnBook(int userId,int isbn) {
		if(books.isEmpty()) {
			already();	
		}
		else {
			Book returnBook=null;
			for (Book book : books) {
				if(book.getIsbn()==isbn) {
					returnBook=book;
					
				}
			}
			if(returnBook==null) {
				System.out.println("Book is not returned");
				return;
			}
			System.out.println(returnBook.toString());
			if(person.getUserId()!=userId && book.isAvailable()==true) {
				System.out.println("Book is not present");
				return;
			}
			
				returnBook.setAvailable(false);
				System.out.println("book returned");
				System.out.println("Book "+ returnBook.getTitle()+" is returned to "+person.getName());
		}
		
			
	}
	void sort() {
		if(books.isEmpty()) {
			already();
		}
		else {
			Collections.sort(books, new TitleComparatable());	
			for (Object object : books) {
				System.out.println(object);
			}
		}

		
		
		 
		
		
	}

}
