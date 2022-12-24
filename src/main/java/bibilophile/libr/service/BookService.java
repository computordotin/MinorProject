package bibilophile.libr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bibilophile.libr.entity.Book;
import bibilophile.libr.repository.BookRepository;

@Service
public class  BookService {
	@Autowired
	private BookRepository repository;
	
	public Book saveBook(Book book){
		return repository.save(book);
	}
	public List<Book> saveBooks(List<Book> books) {
		return repository.saveAll(books);
	}
	
	public List<Book> getBooks() {
		return repository.findAll();
	}
	
	public Book getBookById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	//public Book getBookByName(String name) {
		//return repository.findByName(name);
	//}
	
	public String deleteBook(int id) {
		repository.deleteById(id);
		return "Book "+id+" has been removed";
	}
//	public Book updateBook(Book book) {
//		Book existingBook = repository.findById(book.getBookid()).orElse(null);
//		existingBook.setTitle(book.getTitle());
//		existingBook.setAuthor(book.getAuthor());
//		existingBook.setGenre(book.getGenre());
//		existingBook.setDescription(book.getDescription());
//		return repository.save(existingBook);
//	}
}
