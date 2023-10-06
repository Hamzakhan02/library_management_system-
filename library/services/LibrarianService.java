package com.jsp.library.services;

import java.util.ArrayList;
import java.util.List;
import com.jsp.library.dao.BookDao;
import com.jsp.library.dao.LibrarianDao;
import com.jsp.library.dao.StudentDao;
import com.jsp.library.dto.Book;
import com.jsp.library.dto.Librarian;
import com.jsp.library.dto.Student;

public class LibrarianService {

	BookDao bookDao = new BookDao();
	StudentDao studentDao = new StudentDao();
	LibrarianDao librarianDao = new LibrarianDao();

	public Librarian saveLibrarian(Librarian librarian) {

		librarian.setStatus("unauthorise");
		Librarian lib = librarianDao.saveLibrarian(librarian);
		return lib;
	}

	public boolean deleteLibrarian(int id) {
		return librarianDao.deleteLibrarian(id);
	}

	public Librarian getLibrarianById(int id) {
		return librarianDao.getLibrarianById(id);
	}

	public Librarian updateLibararian(int id, String name) {
		Librarian librarian = librarianDao.getLibrarianById(id);
		librarian.setName(name);
		return librarianDao.updateLibararian(librarian);
	}

	public List<Librarian> getAllLibrarian() {
		return librarianDao.getAllLibrarian();
	}

	public Book addBook(Book book) {
		BookDao bookDao = new BookDao();
		book.setStatus("Available");
		bookDao.saveBook(book);
		return book;

	}

	public Boolean removeBookById(int bookid) {
		BookDao bookDao = new BookDao();
		bookDao.deleteBookById(bookid);
		return true;
	}

	public boolean issueBookById(int bookid, int libid, int studid) {
		Book book = bookDao.getBookById(bookid);
		Student student = studentDao.getStudentById(studid);
		Librarian librarian = librarianDao.getLibrarianById(libid);
		if (librarian != null && book != null && student != null) {
			book.setStatus("Issued");
			book.setStudent(student);
			book.setLibrarian(librarian);
			return bookDao.issue(book);
		}
		return false;
	}

	public boolean returnBookById(int bookid) {
		Book book = bookDao.getBookById(bookid);
		if (book != null && book.getStatus().equals("Issued")) {
			Student student = book.getStudent();
			Librarian librarian = book.getLibrarian();

			if (student != null && librarian != null) {
				book.setStatus("Available");
				book.setStudent(null);
				book.setLibrarian(null);
				return bookDao.returnBook(book);
			}
		}
		return false;
	}

	public List<Book> getAllInRequestBooks() {

		BookService bookService = new BookService();
		List<Book> books = bookService.getAllBooks();
		List<Book> inrequestBooks = new ArrayList<Book>();

		for (Book b : books) {
			if (b.getStatus().equals("in request")) {
				inrequestBooks.add(b);
			}

		}
		return inrequestBooks;

	}

}
