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
        double boy,kilo,vki;
        //Describe Scanner object
        Scanner input =new Scanner(System.in);
        //Take the height and weight
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        boy=input.nextDouble();
        System.out.print("\nKilonuzu giriniz : ");
        kilo=input.nextDouble();
        //Calculate 
        vki=kilo/(boy*boy);
        System.out.println("Vücut Kitle indexsiniz: "+vki);
    }
    
}
