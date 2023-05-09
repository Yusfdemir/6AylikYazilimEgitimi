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
            
            double price,priceWithKDV;
            //Describe Scanner object
            Scanner input =new Scanner(System.in);
            //Take the notes for each lesson
            System.out.print("Fiyatı Giriniz : ");
            price=input.nextInt();
            
            if(price> 1000){
                priceWithKDV=price+(price*0.08);
            }
            else{
                priceWithKDV=price+(price*0.18);
            }
            
            System.out.println("Girilen Fiyat: " +price+"\nKDV'li Fiyat: "+priceWithKDV);
    }
    
}
