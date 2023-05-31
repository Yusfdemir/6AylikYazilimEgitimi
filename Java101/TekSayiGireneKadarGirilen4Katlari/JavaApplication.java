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
        //Describe Variables
        int number,sum=0;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        number = inp. nextInt();
        
        while(number%2==0){
            System.out.print("Bir sayı girin: ");
            number = inp. nextInt();
            if(number%4==0){
                System.out.println(number);
                sum+=number;
            }
        }
        System.out.println("Toplam: "+sum);
     }
}
