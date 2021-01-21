package com.cdac.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdac.Exeption.ResourceNotFoundExeption;
import com.cdac.model.Book;
import com.cdac.repository.BookRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("")
public class BookController {

	@Autowired
	private BookRepository bookrepository;
	
	//get booklist rest api
	@GetMapping("/books")
	public List<Book> getAllBooks(){
		return bookrepository.findAll();
	}
	//update book by id rest api
	@PutMapping("/books/{bookid}")
	public ResponseEntity<Book> updateBook(@PathVariable long bookid,@RequestBody Book booku){
		Book book= bookrepository.findById(bookid)
				.orElseThrow(()->new ResourceNotFoundExeption("book does not exits with id:"+bookid));
		book.setAuthor(booku.getAuthor());
		book.setCost(booku.getCost());
		book.setGenre(booku.getGenre());
		book.setIsbn(booku.getIsbn());
		book.setPublisher(booku.getPublisher());
		book.setTitle(booku.getTitle());
		Book updateBooks= bookrepository.save(book);
		return ResponseEntity.ok(updateBooks);
	}
	
}