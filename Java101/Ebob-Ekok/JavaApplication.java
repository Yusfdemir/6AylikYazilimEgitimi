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
        int n1,n2,ebob=1,ekok=1,i=1;
        Scanner input=new Scanner(System.in);
        System.out.print("İlk sayıyı girin : ");
        n1=input.nextInt();
        System.out.print("\nİkinci sayıyı girin : ");
        n2=input.nextInt();
        
        if(n1<n2){
            while(i<=n1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                }
                i++;  
            }
        }
        ekok=(n1*n2)/ebob;
        if(ebob==1){
            ekok=n1;
        }
        System.out.println("Ebob: "+ebob+" Ekok: "+ekok);
    }
}
