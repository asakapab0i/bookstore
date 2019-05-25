/**
 * 
 */
package com.apress.books.client;
import java.util.List;

import com.apress.books.dao.BookDAO;
import com.apress.books.dao.BookDAOImpl;
import com.apress.books.model.Book;
import com.apress.books.model.Category;

/**
 * @author Bryan
 *
 */
public class BookApp {
	
	private static BookDAO bookDao = new BookDAOImpl();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.err.println("Listing all Books:");
		findAllBooks();
		//searchBooks("Josh");
		//searchBooks("Groovy");
		//findAllCategories();
		//System.out.println("");
		//System.err.println("Search book by keyword in book title : Josh:");
		//searchBooks("Josh");
		//System.out.println("");
		//System.err.println("Search book by keyword in author's name: Josh:");
		//searchBooks("Groovy");
	}
	
	public static void findAllBooks() {
		List<Book> books = bookDao.findAllBooks();
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public static void searchBooks(String keyWord) {
		List<Book> books = bookDao.searchBooksByKeyword(keyWord);
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	public static void findAllCategories() {
		List<Category> categories = bookDao.findAllCategories();
		for (Category category : categories) {
			System.out.println(category);
		}
	}

}
