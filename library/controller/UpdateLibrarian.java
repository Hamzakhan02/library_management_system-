package com.jsp.library.controller;

import com.jsp.library.services.LibrarianService;

public class UpdateLibrarian {
	
	public static void main(String[] args) {
		
		LibrarianService librarianService=new LibrarianService();
		
		librarianService.updateLibararian(3, "vedant");
		
		
	}

}
