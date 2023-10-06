package com.jsp.library.controller;

import com.jsp.library.services.AdminService;

public class AdminLogin {
	public static void main(String[] args) {
		

		AdminService adminService = new AdminService();

		boolean res = adminService.adminLogin(2, "ayesha", "ayesha");

		System.out.println(res);

	}

}
