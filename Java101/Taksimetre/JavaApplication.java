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
        int km;
        double perKm=2.20,total,startPrice=10; 
        //Describe Scanner object
        Scanner input =new Scanner(System.in);
        //Take the height and weight
        System.out.print("Kilometreyi girin : ");
        km=input.nextInt();
        //Calculate 
        total=(km*perKm);
        total+=startPrice;
        if(total<=20)
            System.out.println("Total : 20");
        else
            System.out.println("total : "+total);
    }
    
}
