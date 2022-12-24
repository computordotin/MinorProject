package bibilophile.libr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import bibilophile.libr.entity.Book;

@Service
public interface BookRepository extends JpaRepository<Book, Integer> {

	//Book findByName(String name);
	// Book - It is a class
	// Integer - It is the data type of Primary key

}
