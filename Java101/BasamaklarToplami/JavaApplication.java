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
        int n1,n2,sum=0;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        n1 = inp. nextInt();
        n2=n1;
        while(n1>0){
            sum+=(n1%10);
            n1/=10;
        }
        System.out.println(n2+" sayısının basamaklarının toplamı: "+sum);
    }
}
