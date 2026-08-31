package com.rozana.bookapi.repository;


import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rozana.bookapi.model.Book;

@Repository
public class BookRepository {
 private final JdbcTemplate jdbcTemplate;

 private final RowMapper<Book> rowMapper = (rs , rowNum) -> {
      Book book = new Book();
      book.setId(rs.getInt("id"));
      book.setTitle(rs.getString("title"));
      book.setAuthor(rs.getString("author"));
      book.setPrice(rs.getDouble("price"));
      book.setCategory(rs.getString("category"));
      book.setLanguage(rs.getString("language"));
      book.setPages(rs.getInt("pages"));
      book.setPublicationYear(rs.getInt("publication_year"));
      book.setDescription(rs.getString("description"));
      book.setAvailable(rs.getBoolean("available"));
      return book;
   };

 public BookRepository(JdbcTemplate jdbcTemplate){
    this.jdbcTemplate = jdbcTemplate;
 }

 public void save(Book book){
    String sql = """   
    INSERT INTO books(
    title,
    author,
    price,
    category,
    language,
    pages,
    publication_year,
    description,
    available
    )VAlUES(? , ? , ? ,? , ? , ? , ? , ? , ?) """ ;


    jdbcTemplate.update(
        sql, 
        book.getTitle() ,
        book.getAuthor(),
        book.getPrice(),
        book.getCategory(),
        book.getLanguage(),
        book.getPages(),
        book.getPublicationYear(),
        book.getDescription(),
        book.isAvailable()

        );
 }



//  GET ALL BOOKS //
public List<Book> findAll(){
   String sql = """
         SELECT * FROM books  
         """;




return jdbcTemplate.query(
   sql , rowMapper
);

}




public Book findById(int id){
   String sql = """
   SELECT * FROM books WHERE id = ?      

    """;   
 return jdbcTemplate.queryForObject(sql , rowMapper , id);

}




public int update(Book book){
   String sql = """
   UPDATE books SET
   title =?,
   author = ?,
   price = ?,
   category = ?,
   language = ?,
   pages = ?,
   publication_year = ?,
   description = ?,
   available = ?
   WHERE id = ?
         """;


   return jdbcTemplate.update(
      sql ,
      book.getTitle(),
      book.getAuthor(),
      book.getPrice(),
      book.getCategory(),
      book.getLanguage(),
      book.getPages(),
      book.getPublicationYear(),
      book.getDescription(),
      book.isAvailable(),
      book.getId()
   );
}

public void delete(int id){
   String sql = """
   DELETE FROM books WHERE id = ?
         

         """;
   jdbcTemplate.update(sql, id);
}



}

