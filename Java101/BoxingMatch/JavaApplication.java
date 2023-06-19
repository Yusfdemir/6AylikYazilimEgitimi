/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */


public class JavaApplication {
    public static void main(String[] args) {
       Fighter f1 = new Fighter("A", 10,120,100,30);
       Fighter f2 = new Fighter("B", 20, 85, 85,40);

       Ring match = new Ring(f1, f2, 85,100);
       match.run();
    } 
}
