/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.Comparator;

/**
 *
 * @author yusuf
 */
public class OrderByName implements Comparator<Book>{
    @Override
    public int compare(Book b1,Book b2){
        return b1.getName().compareTo(b2.getName());
    }
}
