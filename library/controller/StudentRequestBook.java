package com.jsp.library.controller;

import com.jsp.library.services.BookService;

public class StudentRequestBook {
	public static void main(String[] args) {
		
		BookService bookService = new BookService();
		boolean res = bookService.requestBook(5, 3);	
		
		if(res==false) {
			System.out.println("book is already issued");
		}
	}
	
}
