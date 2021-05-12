package com.readShare.Model;

public class User {
    private int id;
    //private String username;
    private String password;
    private String name;
    private String lastName;
    private String eMail;

    //DEFAULT CONSTRUCTOR
    public User(){


    }

    public User(String name, String lastName, String email, String password, int id ){
        this.name = name;
        this.lastName = lastName;
        this.eMail = email;
        this.password = password;
        this.id = id;


    }

    //GETTERS AND SETTERS
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }*/

    public String getEmail() {
        return this.eMail;

    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }
}
