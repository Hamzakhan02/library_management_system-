package com.jsp.library.controller;

import com.jsp.library.services.LibrarianService;

public class IssueInRequestBooks {
	public static void main(String[] args) {
		LibrarianService librarianService=new LibrarianService();
		
		librarianService.issueBookById(5, 3, 3);
	}
}