package com.rozana.bookapi.model;

public class Book {
private Integer id;
private String title;
private String author;
private Double price;
private String category;
private String language;
private Integer pages;
private Integer publicationYear;
private String description;
private Boolean available;

        public Book() {
    }


  public Book(
    Integer id,
    String title,
    String author,
    Double price,
    String category,
    String language,
    Integer pages,
    Integer publicationYear,
    String description,
    Boolean available) {

    this.id = id;
    this.title = title;
    this.author = author;
    this.price = price;
    this.category = category;
    this.language = language;
    this.pages = pages;
    this.publicationYear = publicationYear;
    this.description = description;
    this.available = available;
}


    public Integer getId(){
        
        return id ;
    }
    public String getTitle(){
        
        return title ;
    }

    public String getAuthor(){
        
        return author ;
    }
    public Double getPrice(){
        
        return price ;
    }
    public String getCategory(){
        
        return category ;
    }
    public String getLanguage(){
        
        return language ;
    }
    public Integer getPages(){
        
        return pages ;
    }
    public Integer getPublicationYear(){
        
        return publicationYear ;
    }
    public String getDescription(){
        
        return description ;
    }
    public Boolean isAvailable(){
        
        return available ;
    }
    public void setId(Integer id){
        this.id = id ;
    }
     
    public void setTitle(String title){
        this.title = title ;

    }
    public void setAuthor(String author){
        this.author = author ;

    }
    public void setPrice(Double price){
        this.price = price ;
    }
    public void setCategory(String category){
        this.category = category ;
    }
    public void setLanguage(String language){
        this.language = language ;
    }
    public void setPages(Integer pages){
        this.pages = pages ;
    }
    public void setPublicationYear(Integer publicationYear){
        this.publicationYear = publicationYear ;
    }
    public void setDescription(String description){
        this.description = description ;
    }
    public void setAvailable(Boolean available){
        this.available = available ;
    }




}
