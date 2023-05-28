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
        int n1,n2,n1Factorial=1,n2Factorial=1,n1n2Factorial=1;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        n1 = inp. nextInt();
        System.out.print("Bir sayı girin: ");
        n2 = inp. nextInt();
        for(int i=1;i<=n1;i++){
           n1Factorial*=i;
        }
        for(int i=1;i<=n2;i++){
           n2Factorial*=i;
        }
        for(int i=1;i<=(n1-n2);i++){
           n1n2Factorial*=i;
        }
        
        int result=n1Factorial/(n2Factorial*n1n2Factorial);
        System.out.println(result);
    }
}
