/**
 * 
 */
package com.apress.books.model;

/**
 * @author Bryan
 *
 */
public class Book {
	private Long id;
	private Long categoryId;
	private String bookTitle;
	private String authorFirstName;
	private String authorLastName;
	private String publisherName;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public long getCategoryId() {
		return this.categoryId;
	}
	
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	
	public String getBookTitle() {
		return this.bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getAuthorFirstName() {
		return this.authorFirstName;
	}
	
	public void setAuthorFirstName(String authorFirstName) {
		this.authorFirstName = authorFirstName;
	}
	
	public String getAuthorLastName() {
		return this.authorLastName;
	}
	
	public void setAuthorLastName(String authorLastName) {
		this.authorLastName = authorLastName;
	}
	
	public String getPublisherName() {
		return this.publisherName;
	}
	
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	public String toString() {
		return "Book - Id: " + id + ", Book Title: " + bookTitle + ", Author: " + authorFirstName + " " + authorLastName;
	}
	
}
