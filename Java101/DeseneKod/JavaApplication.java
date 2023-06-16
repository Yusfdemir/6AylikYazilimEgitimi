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

    public static void recursiveMethod(int n) { 
        if (n <= 0){ 
            System.out.println(n); 
            return; 
        } 
        System.out.println(n); 
        recursiveMethod(n - 5); 
        System.out.println(n); 
    }
    

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Bir sayı girin: ");
       int num = scan.nextInt();
       recursiveMethod(num);
    }
    
}
