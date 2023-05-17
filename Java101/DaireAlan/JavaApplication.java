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
        int r,angle;
        double pi=3.14; 
        //Describe Scanner object
        Scanner input =new Scanner(System.in);
        //Take the height and weight
        System.out.print("Yarıçapı girin : ");
        r=input.nextInt();
        System.out.println("Merkez açıyı girin : ");
        angle=input.nextInt();
        //Calculate 
        System.out.println("Area of circle : " +(pi*(r*r)*angle)/360);
    }
    
}
