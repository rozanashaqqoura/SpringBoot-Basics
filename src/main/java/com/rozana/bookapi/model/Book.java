package com.rozana.bookapi.model;

public class Book {
    private int id ;
    private String title ;
    private String author;
    private double price ;
    private String category;
    private String language;
    private int pages;
    private int publicationYear;
    private String description;
    private boolean available;


    public Book(
        int id , String title , String author ,
        double price , String category , String language, 
        int pages , int publicationYear , String description , 
        boolean available){
        this.id = id ;
        this.title = title ;
        this.author = author ;
        this.price = price ;
        this.category = category ;
        this.language = language ;
        this.pages = pages ;
        this.publicationYear = publicationYear ;
        this.description = description ;
        this.available = available;
    }


    public int getId(){
        
        return id ;
    }
    public String getTitle(){
        
        return title ;
    }

    public String getAuthor(){
        
        return author ;
    }
    public double getPrice(){
        
        return price ;
    }
    public String getCategory(){
        
        return category ;
    }
    public String getLanguage(){
        
        return language ;
    }
    public int getPages(){
        
        return pages ;
    }
    public int getPublicationYear(){
        
        return publicationYear ;
    }
    public String getDescription(){
        
        return description ;
    }
    public boolean isAvailable(){
        
        return available ;
    }
     
    public void setTitle(String title){
        this.title = title ;

    }
    public void setAuthor(String author){
        this.author = author ;

    }
    public void setPrice(double price){
        this.price = price ;
    }
    public void setCategory(String category){
        this.category = category ;
    }
    public void setLanguage(String language){
        this.language = language ;
    }
    public void setPages(int pages){
        this.pages = pages ;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear ;
    }
    public void setDescription(String description){
        this.description = description ;
    }
    public void setAvailable(boolean available){
        this.available = available ;
    }




}
