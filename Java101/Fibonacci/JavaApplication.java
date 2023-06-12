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
        Scanner reader = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("N Sayısını Girin:");
        n = reader.nextInt();
        System.out.print(n1+" "+n2);//0 ve 1 yazdır 
  
        for(i=2;i<n;++i) {  
            n3=n1+n2;  
            System.out.print(" "+n3);  
            n1=n2;  
            n2=n3;  
        }
        System.out.println();   
    }
}
