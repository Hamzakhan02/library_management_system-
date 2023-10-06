package com.jsp.library.controller;



import com.jsp.library.services.BookService;

public class BookUpdate {
	public static void main(String[] args) {
		BookService bookService = new BookService();
		if (bookService.updateBookNameById(1, "Song of Ice and fire") != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}
	}
}

