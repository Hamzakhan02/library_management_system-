package com.jsp.library.controller;

import com.jsp.library.services.LibrarianService;

public class GetByIdLibrarian {
	
	public static void main(String[] args) {
		
		
		LibrarianService librarianService= new LibrarianService();
		
		librarianService.getLibrarianById(3);
		
		
	}

}
