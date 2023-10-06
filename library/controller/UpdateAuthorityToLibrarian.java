package com.jsp.library.controller;

import com.jsp.library.services.AdminService;

public class UpdateAuthorityToLibrarian {
	public static void main(String[] args) {
		
		
		AdminService adminService=new AdminService();
		
		adminService.approveLibrarianById(4, 3);
		
		
	}

}
