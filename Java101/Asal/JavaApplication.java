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
 
        for(int sayi=2;sayi<=100;sayi++){
            int kontrol = 0;
            for (int i = 2; i < sayi; i++){
               if (sayi % i == 0){
                    kontrol = 1;
                    break;
                } 
            }    
            if(kontrol==0){
               System.out.print(sayi+"\n");  
            }
        }       
    }
}
