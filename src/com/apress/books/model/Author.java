/**
 * 
 */
package com.apress.books.model;

/**
 * @author Bryan
 *
 */
public class Author {
	private Long id;
	private Long bookId;
	private String firstName;
	private String lastName;
	
	public Long getId() {
		return this.id;
	}
	
	public Long getBookId() {
		return bookId;
	}
	
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return "Author - Id: " + id + ", Book id: " + bookId + ", First Name: " + firstName + ", Last Name: " + lastName;
	}
	
}
