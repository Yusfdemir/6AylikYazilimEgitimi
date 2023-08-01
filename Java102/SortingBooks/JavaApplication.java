/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author yusuf
 */

public class JavaApplication {
    
    public static void main(String[] args) {
       TreeSet<Book> books=new TreeSet<>(new OrderByName());
       books.add(new Book("Semerkant",281,"Amin Maalouf","12-12-1995"));
       books.add(new Book("Dava",321,"Franz Kafka","12-12-1995"));
       books.add(new Book("Simyacı",134,"Paulo Coelho","12-12-1995"));
       books.add(new Book("Olasılıksız",452,"Adam Fawer","12-12-1995"));
       books.add(new Book("Şah Sultan",367,"İskender Pala","12-12-1995"));
       
       Iterator<Book> itr=books.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next().getName());
       }
       System.out.println("\n###########################\n");
       TreeSet<Book> books1=new TreeSet<>(new OrderByPageNumber());
       books1.add(new Book("Semerkant",281,"Amin Maalouf","12-12-1995"));
       books1.add(new Book("Dava",321,"Franz Kafka","12-12-1995"));
       books1.add(new Book("Simyacı",134,"Paulo Coelho","12-12-1995"));
       books1.add(new Book("Olasılıksız",452,"Adam Fawer","12-12-1995"));
       books1.add(new Book("Şah Sultan",367,"İskender Pala","12-12-1995"));
        
       for(Book b:books1){
           System.out.println(b.getName()+"--->"+b.getPageNum());
       }
    }
    
  } 

