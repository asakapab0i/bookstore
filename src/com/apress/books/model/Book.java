/**
 * 
 */
package com.apress.books.model;

import java.util.List;
import com.apress.books.model.Author;

/**
 * @author Bryan
 *
 */
public class Book {
	private Long id;
	private Long categoryId;
	private String bookTitle;
	private List<Author> authors;
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
	
	public List<Author> getAuthors(){
		return authors;
	}
	
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}
	
	public String getPublisherName() {
		return this.publisherName;
	}
	
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	public String toString() {
		return "Book - Id: " + id + ", Book Title: " + bookTitle;
	}
	
}
