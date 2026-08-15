package com.rozana.bookapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rozana.bookapi.model.Book;
@Service
public class BookService {
   private List<Book> books = new ArrayList<>();

     public String addBook(Book book){
        books.add(book);
        return "Book Added Successfully";
     }

     public List<Book> getAllBooks(){
         return books;
     }

     public  Book   getBookById(int id){
      for(Book book : books){
         if(book.getId() == id){
            return book;
         }

      }
      return null;

     }



     public Book updateBookById(int id , Book updatedBook){
      for(Book currentBook : books){
         if(currentBook.getId() == id){
            currentBook.setTitle(updatedBook.getTitle());
            currentBook.setAuthor(updatedBook.getAuthor());
            currentBook.setPrice(updatedBook.getPrice());
            currentBook.setCategory(updatedBook.getCategory());
            currentBook.setLanguage(updatedBook.getLanguage());
            currentBook.setPages(updatedBook.getPages());
            currentBook.setPublicationYear(updatedBook.getPublicationYear());
            currentBook.setDescription(updatedBook.getDescription());
            currentBook.setAvailable(updatedBook.isAvailable());
            return currentBook;
         }
      }
      return null;   
     }


     


     public String deleteBookById(int id){
      for(int i =0 ;i < books.size(); i++){
         Book book = books.get(i);
         if(book.getId()  == id){
            books.remove(i);
            return "Book Deleted Successfully";
         }
      }
      return "Book not found";
     }

     

}
