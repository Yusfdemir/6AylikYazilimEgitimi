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
        int number,calculatefor4=1,calculatefor5=1;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        number = inp. nextInt();
        
        for(int i=1;i<=number;i++){
            for(int j=i;j<=i;j++){
                calculatefor4*=4;
                calculatefor5*=5;
                System.out.println("4^"+j+"= "+calculatefor4+"  5^"+j+"= "+calculatefor5);
            }
        }
    }
}
