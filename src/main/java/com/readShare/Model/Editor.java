package com.readShare.Model;

public class Editor extends User {

    Book newBook;
    public Editor(String name, String lastName, String email, String password, int id){
        super(name, lastName, email,password, id);
    }

}
