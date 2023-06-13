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
    static int fibo(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number;
        System.out.print("Sayı Girin:");
        number = reader.nextInt();
        System.out.println(fibo(number));
        
    }
    
}
