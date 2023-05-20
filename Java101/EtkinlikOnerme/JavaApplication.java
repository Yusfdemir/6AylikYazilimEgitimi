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
        int temperature;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını girin: ");
        temperature = inp. nextInt();
        
        if(temperature<5)
            System.out.println("Kayak Yapabilirsiniz");
        else if(temperature>5&&temperature<15)
            System.out.println("Sinemaya Gidebilirsiniz ");
        else if(temperature>15 && temperature<25)
            System.out.println("Pikniğe Gidebilirsiniz");
        else 
            System.out.println("Yüzmeye Gidebilirsiniz");
        
        
     }
}
