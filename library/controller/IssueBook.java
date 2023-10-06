package com.jsp.library.controller;

import com.jsp.library.services.LibrarianService;

public class IssueBook {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService = new LibrarianService();
		
		librarianService.issueBookById(2, 2, 3)	;
	}

}
