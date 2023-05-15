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

        //Describe variables
        int n1,n2,select;
        
        //Describe Scanner object
        Scanner input =new Scanner(System.in);
        //Take the height and weight
        System.out.print("Birinci sayıyı girin : ");
        n1=input.nextInt();
        System.out.print("\nİkinci sayıyı girin : ");
        n2=input.nextInt();
        System.out.print("\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nYapmak istediğiniz işlemin rakamını seçiminiz: ");
        select=input.nextInt();
        //Calculate 
        switch(select){
            case 1:
                System.out.println("Toplama : "+(n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma : "+(n1-n2));
                break;
            case 3:
                System.out.println("Çarpma : "+(n1*n2));
                break;
            case 4:
                System.out.println("bölme : "+(n1/n2));
                break;
        }
        
    }
    
}
