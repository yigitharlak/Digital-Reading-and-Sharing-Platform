package com.readShare.Model;

public class Book {
    private int id;
    private String title;

    public Book(int id, String title){
        this.id = id;
        this. title = title;
    }

    //GET AND SET METHODS
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }

}
