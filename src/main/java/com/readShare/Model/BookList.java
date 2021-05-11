package com.readShare.Model;

import java.util.Arrays;
import java.util.Date;

public class BookList {
    private int id;
    private String listName;
    private Book[] bookList;
    private int size;
    private Date date;

    public BookList(int id ,String listName, Date date){
        this.id = id;
        this.listName = listName;
        this.date = date;
        size = 0;
        bookList = new Book[size];
    }

    //Get and Set methods
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setListName(String listName){
        this.listName = listName;
    }

    public String getListName(){
        return this.listName;
    }

    public void setDate(Date date){
        this.date = date;

    }

    public Date getDate(){
        return this.date;
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }
    public void addBook(Book book){
        if(isEmpty()){
            this.size++;
            bookList[0] = book;
        }
        else{
            size++;
            bookList[size-1] = book;
        }
    }

    public void removeBookByIndex(int index){
        if(isEmpty()){
            System.out.println("The book list is empty");
        }
        else{
            for(int i = index; i < bookList.length-1; i++){
                bookList[i] = bookList[i+1];
            }
            size--;
        }
    }

}
