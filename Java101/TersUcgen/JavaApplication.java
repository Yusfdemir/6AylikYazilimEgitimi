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
        Scanner scan = new Scanner(System.in);
         
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
         
        for(int i = 0; i < sayi; i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=sayi-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
