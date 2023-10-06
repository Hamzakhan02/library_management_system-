package com.jsp.library.controller;

import com.jsp.library.services.AdminService;

public class UpdateAdmin {
	public static void main(String[] args) {
		
		AdminService adminService=new AdminService();
		
		adminService.updateAdmin(1, "password");
		
	}

}
