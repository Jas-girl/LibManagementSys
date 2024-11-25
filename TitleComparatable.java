package project;

import java.util.Comparator;

public class TitleComparatable implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getTitle().compareToIgnoreCase(o2.getTitle());
	}

}
