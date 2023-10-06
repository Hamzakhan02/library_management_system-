package com.jsp.library.controller;

import com.jsp.library.dto.Admin;
import com.jsp.library.services.AdminService;

public class SaveAdmin {
	public static void main(String[] args) {

		Admin admin = new Admin();

		admin.setUsername("abc");
		admin.setPassword("abc");

		AdminService adminService = new AdminService();

		adminService.saveAdmin(admin);

	}

}
