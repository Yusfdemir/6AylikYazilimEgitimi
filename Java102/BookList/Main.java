/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author yusuf
 */
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class JavaApplication4 {
    //2018555014 Yusuf DEMİR
    public static void main(String[] args) {
        ArrayList<Book> bookList=new ArrayList<>();
        HashMap<String,String> bookMap=new HashMap<>();
        
        bookList.add(new Book("Semerkant",281,"Amin Maalouf","12-12-1995"));
        bookList.add(new Book("Dava",81,"Franz Kafka","12-12-1995"));
        bookList.add(new Book("Simyacı",34,"Paulo Coelho","12-12-1995"));
        bookList.add(new Book("Olasılıksız",452,"Adam Fawer","12-12-1995"));
        bookList.add(new Book("Şah Sultan",67,"İskender Pala","12-12-1995"));
        bookList.add(new Book("Uygarlıkların Batışı",198,"Amin Maalouf","12-12-1995"));
        bookList.add(new Book("Satranç",71,"Stefan Zweig","12-12-1995"));
        bookList.add(new Book("Veba",295,"Albert Camus","12-12-1995"));
        bookList.add(new Book("1984",350,"George Orwell","12-12-1995"));
        bookList.add(new Book("Modern Türkiyenin Doğuşu",660,"Bernard Lewis","12-12-1995"));
        
        System.out.println("###### Original Book List ######\n");
        bookList.forEach(book->System.out.println("Name: "+book.getName()+
                                   "\tAuthor: "+book.getAuthor()+
                                   "\tPage: "+book.getPage()+
                                   "\tDate: "+book.getDate()));
        bookList.forEach(book->bookMap.put(book.getName(), book.getAuthor()));
        
        System.out.println("\n###### Book Map <BookName,Author> ######\n");
        bookMap.forEach((k, v) -> {
        System.out.format("Name: %s, Author: %s%n", k, v);
        });
        
        System.out.println("\n###### Filtered Book List ######\n");
        bookList.stream().filter(book->book.getPage()>100).forEach(book->
                System.out.println("Name: "+book.getName()+
                                   "\tAuthor: "+book.getAuthor()+
                                   "\tPage: "+book.getPage()+
                                   "\tDate: "+book.getDate())
        );
        
        
    }
}
