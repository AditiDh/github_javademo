package com.cybage.basic;

public class BookDemo {

	public static void main(String[] args) {
		Book book=new Book(1001, "C", "Aditi");
		
		System.out.println(book);
		book=null;
		
		/*System.out.println(book.getISBN());
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());*/
		System.gc();
	
		

	}

}
