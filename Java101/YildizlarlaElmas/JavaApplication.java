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
        int n;
        double result=0.0;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        n = inp. nextInt();
        
       for (int i=1; i <= n ; i++){
            for (int k = 0; k < (n-i); k++ )
            {
                System.out.print(" ");
            }

            for (int j=1; j<= (2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int a= n-1; a >= 0; a--)
        {
            for (int b=0; b < n-a; b++)
            {
                System.out.print(" ");
            }

            for (int c=1; c<=(2*a-1); c++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
