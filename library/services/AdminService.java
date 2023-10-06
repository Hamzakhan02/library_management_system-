package com.jsp.library.services;

import java.util.ArrayList;
import java.util.List;

import com.jsp.library.dao.AdminDao;
import com.jsp.library.dao.LibrarianDao;
import com.jsp.library.dto.Admin;
import com.jsp.library.dto.Librarian;

public class AdminService {

	AdminDao adminDao = new AdminDao();

	LibrarianService librarianService = new LibrarianService();
	
	LibrarianDao librarianDao=new LibrarianDao();

	public Admin saveAdmin(Admin admin) {

		return adminDao.saveAdmin(admin);

	}

	public Admin getById(int id) {
		return adminDao.getById(id);
	}

	public boolean adminLogin(int id, String username, String password) {
		Admin admin = adminDao.getById(id);

		if (admin.getUsername().equals(username) && admin.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}

	}

	public List<Admin> getAll() {
		return adminDao.getAll();
	}

	public Admin updateAdmin(int id, String password) {
		Admin admin = adminDao.getById(id);
		admin.setPassword(password);
		return adminDao.updateAdmin(admin);

	}

	public boolean deleteAdmin(int id) {

		boolean s = adminDao.deleteAdmin(id);
		return s;

	}

	public void getAllUnauthoriseLibByid() {
		List<Librarian> librarians = librarianService.getAllLibrarian();
//		    Librarian librarian=new Librarian();

		for (Librarian f : librarians) {

			System.out.println(f.getId());
			System.out.println(f.getCno());
			System.out.println(f.getStatus());
			System.out.println(f.getName());
			System.out.println("===================");

		}

	}


	
	public boolean approveLibrarianById(int libid, int adminid) {
		
		Librarian librarian= librarianDao.getLibrarianById(libid);
		
		Admin admin=adminDao.getById(adminid);
		if(librarian!=null && admin!=null) {
			
			
			librarian.setStatus("Approved");
			librarian.setAdmin(admin);
			return librarianDao.approve(librarian);
			
		}
		return false;
		
	}
	
public boolean rejectLibrarianById(int libid, int adminid) {
		
		Librarian librarian= librarianDao.getLibrarianById(libid);
		
		Admin admin=adminDao.getById(adminid);
		if(librarian!=null && admin!=null) {
			
			
			librarian.setStatus("Reject");
			librarian.setAdmin(admin);
			return librarianDao.approve(librarian);
			
		}
		return false;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
