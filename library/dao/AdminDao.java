package com.jsp.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.library.dto.Admin;

public class AdminDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("hamza");

	EntityManager entityManager = entityManagerFactory.createEntityManager();

	EntityTransaction entityTransaction = entityManager.getTransaction();

	Admin admin = new Admin();

	private Object librarian;

	public Admin saveAdmin(Admin admin) {

		entityTransaction.begin();
		entityManager.persist(admin);
		entityTransaction.commit();

		return admin;

	}

	public Admin getById(int id) {

		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	public List<Admin> getAll() {

		String sql = "SELECT e FROM Admin e";

		Query query = entityManager.createQuery(sql);

		List<Admin> employees = query.getResultList();

		return employees;
	}

	public Admin updateAdmin(Admin admin) {
//		 Employee employee= entityManager.find(Employee.class,id);

		if (admin != null) {

			entityTransaction.begin();
			entityManager.merge(admin);
			entityTransaction.commit();

		}
		return admin;

	}

	public boolean deleteAdmin(int id) {
		Admin admin = entityManager.find(Admin.class, id);

		if (admin != null) {

			entityTransaction.begin();
			entityManager.remove(admin);
			entityTransaction.commit();
			return true;

		} else {
			System.out.println("id not found ");
			return false;

		}

	}
	
	

	



}
