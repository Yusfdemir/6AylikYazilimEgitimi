/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author yusuf
 */
public class User {
    private String fname;
    private String lname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Adress> adressList=new ArrayList<>();
    private LocalDate date;

    public User(String fname, String lname, String email, String password, String job, int age) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
        this.date = LocalDate.now();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Adress> getAdressList() {
        return adressList;
    }

    public void setAdressList(ArrayList<Adress> adressList) {
        this.adressList = adressList;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
     public void addAddress(Adress address) {
        this.adressList.add(address);
    }

    public void removeAddress(Adress address) {
        this.adressList.remove(address);
    }

    public void updateDate() {
        this.date = LocalDate.now();
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    
    
}