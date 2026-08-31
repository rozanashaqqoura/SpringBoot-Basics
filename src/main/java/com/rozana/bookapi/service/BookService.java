package com.rozana.bookapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rozana.bookapi.model.Book;
import com.rozana.bookapi.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void save(Book book) {
      bookRepository.save(book);
        
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Book findById(int id) {
        return bookRepository.findById(id);
    }

    public Book update(Book book , int id) {
        book.setId(id);
       int rowsAffected = bookRepository.update(book);
        if (rowsAffected == 0) {
            throw new RuntimeException("Book not found with id: " + id);
        }
        return book;
    }

    public void delete(int id) {
        bookRepository.delete(id);
    }
}