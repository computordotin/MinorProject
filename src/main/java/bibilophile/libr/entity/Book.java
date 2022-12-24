package bibilophile.libr.entity;

import jakarta.persistence.Entity;



import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity //for entity class 
@Table(name = "book_table")
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id // @Id is for primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // For auto increment for autogeneration id
	private int bookid;
	private String title;
	private String genre;
	private String author;
	private String description;

}
