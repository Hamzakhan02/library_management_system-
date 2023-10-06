package com.jsp.library.controller;

import java.util.List;

import com.jsp.library.dto.Book;
import com.jsp.library.services.LibrarianService;

public class GetAllInRequestBooks {
	public static void main(String[] args) {

		LibrarianService librarianService = new LibrarianService();
		List<Book> books = librarianService.getAllInRequestBooks();

		for (Book b1 : books) {
			System.out.println("=======================s");
			System.out.println(b1.getId());
			System.out.println(b1.getName());
			System.out.println(b1.getStatus());
			System.out.println("=======================s");
		}

	}
}
