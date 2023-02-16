package com.author.app;

import java.util.ArrayList;
import java.util.List;

import com.author.dto.AssociationRepository;
import com.author.entity.Author;
import com.author.entity.Book;

public class App {

	public static void main(String[] args) {
		Author author = new Author();
		author.setEmail("abc123@gmail.com");
		author.setName("abc");
		
		Book book1 = new Book();
		book1.setAuthor(author);
		book1.setTitle("Java Full reference");
		Book book2 = new Book();
		book2.setAuthor(author);
		book2.setTitle("C with Data Structure");
		Book book3 = new Book();
		book3.setAuthor(author);
		book3.setTitle("Python Full reference");
		List<Book> books = new ArrayList<>();
		books.add(book1);
		books.add(book2);
		books.add(book3);
		
		AssociationRepository repository = new AssociationRepository();
		repository.savePersonDetails(author);

	}

}
