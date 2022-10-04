package com.cybage.basic;
//using getters and setters
//and constructor fields
public class Book {

	private int ISBN;
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private String title;
	private String author;
	public Book(int iSBN, String title, String author) {
		super();
		ISBN = iSBN;
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + "]";
	}
	
	@Override
	protected void finalize()
	{
		System.out.println("finalize method of book");
	}
	
		
	}


