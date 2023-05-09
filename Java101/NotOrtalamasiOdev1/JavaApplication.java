/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
import java.util.Scanner;

public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Describe variables
            int mat,fizik,kimya,turkce,tarih,muzik;
            //Describe Scanner object
            Scanner input =new Scanner(System.in);
            //Take the notes for each lesson
            System.out.println("Matematik Notunuz: ");
            mat=input.nextInt();
            System.out.println("Fizik Notunuz: ");
            fizik=input.nextInt();
            System.out.println("Kimya Notunuz: ");
            kimya=input.nextInt();
            System.out.println("Türkçe Notunuz: ");
            turkce=input.nextInt();
            System.out.println("Tarih Notunuz: ");
            tarih=input.nextInt();
            System.out.println("Müzik Notunuz: ");
            muzik=input.nextInt();
            
            int toplam=mat+fizik+kimya+turkce+tarih+muzik;
            double result=toplam/6;
            System.out.println("Ders Notlarınızın Ortalaması: " + result);
    }
    
}
