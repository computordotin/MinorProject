package bibilophile.libr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bibilophile.libr.entity.Book;
import bibilophile.libr.service.BookService;
@RestController
public class BookController {
	
	@Autowired
	private BookService service;

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book) {
		
		return service.saveBook(book);
	}
	@PostMapping("/addbooks")
	public List<Book> addBooks(@RequestBody List<Book> books) {
		return service.saveBooks(books);
	}
	@GetMapping("/findallbooks")
	public List<Book> findAllBooks(List<Book> books){
		return service.getBooks();
	}
	@GetMapping("/findbookbyid/{id}")
	public Book findBookById(@PathVariable int id) {
		return service.getBookById(id);
	}
	@DeleteMapping("/deletebook/{id}")
	public String deleteBook(@PathVariable int id) {
		return service.deleteBook(id);
		
	}
	@PutMapping("/updateBook")
	public Book updateBook(@RequestBody Book book) {
		return service.saveBook(book);
		
	}
	
}
