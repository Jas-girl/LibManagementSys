package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Library lib = new Library();
		ArrayList<Book> books = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);

		System.out.println("**************Library Management System*************");

		int ch = 0;
		do {
			System.out.println("\t\t Enter the choice \nChoose 1: Add books \nChoose 2: View Books"
					+ "\nChoose 3: Search the book by title \nChoose 4: Search the book by author"
					+ "\nChoose 5:Remove a book \nChoose 6:Borrow Book \nChoose 7:Return the book \n Choose 8:Sorting");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				lib.addBook();
				break;
			case 2:
				
				lib.viewBooks();
				break;
			case 3:
				System.out.println("Enter the title to search for book");
				String title1 = sc.next();
				lib.searchTitle(title1);
				break;
			case 4:
				System.out.println("Enter the author to search for book");
				String author1 = sc.next();
				lib.searchAuthor(author1);
				break;
			case 5:
				System.out.println("Remove a book");
				System.out.println("Enter the isbn");
				int isbn = sc.nextInt();
				lib.removeBook(isbn);
				break;
			case 6:
				System.out.println("Borrow book");
				System.out.println("Enter the title of book");
				String title2 = sc.next();
				lib.borrowBook(title2);
				break;
			case 7:	System.out.println("Return the book");
				System.out.println("Enter the userId");
				int userId=sc.nextInt();
				System.out.println("Enter the isbn of the book");
				int isbn2=sc.nextInt();
				lib.returnBook(userId,isbn2);
				break;
			case 8:lib.sort();break;
			default:
				System.out.println("Exit");
			}
		} while (ch < 9);


	}
}
