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
        int n1,n2,result=1;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin: ");
        n1 = inp. nextInt();
        System.out.print("Üs olacak sayıyı girin: ");
        n2 = inp. nextInt();
        
        for(int i=0;i<n2;i++){
            result*=n1;
        }
        System.out.println(n1+"^"+n2+" = "+result);
    }
}
