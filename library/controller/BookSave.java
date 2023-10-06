package com.jsp.library.controller;

import com.jsp.library.dto.Book;
import com.jsp.library.services.BookService;

public class BookSave {

	public static void main(String[] args) {
		BookService bookService = new BookService();
		Book book = new Book();
		book.setName("book4");
		book.setStatus("Issued");
		bookService.saveBook(book);
	}
}

