package com.rozana.bookapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rozana.bookapi.model.Book;
import com.rozana.bookapi.service.BookService;
@RestController
@RequestMapping("api/books")

public class BookController {
    private final BookService bookService;

    public BookController (BookService  bookService){
        this.bookService = bookService;
    }

    @GetMapping("/health")
    public String healthCheck(){
        return "Running Service";
    }

    @PostMapping("/addbook")
    public String addBook(@RequestBody Book book ){
       
      return bookService.addBook(book);


    }

    @GetMapping("/getallbooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public Book updateBook(
            @PathVariable int id,
            @RequestBody Book updatedBook) {
        return bookService.updateBookById(id, updatedBook);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBookById(id);
    }

}
