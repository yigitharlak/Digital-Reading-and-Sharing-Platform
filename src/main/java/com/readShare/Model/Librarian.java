package com.readShare.Model;

public class Librarian extends User {
    private int salary;
    public Librarian(String name, String lastName, String email, String password, int id, int salary){
        super(name, lastName, email, password, id);
        this. salary = salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }
}
