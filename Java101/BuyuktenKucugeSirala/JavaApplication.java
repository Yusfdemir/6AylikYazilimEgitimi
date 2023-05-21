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
        int n1,n2,n3,first,second,third;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("1. sayıyı girin: ");
        n1 = inp. nextInt();
        System.out.print("2. sayıyı girin: ");
        n2 = inp. nextInt();
        System.out.print("3. sayıyı girin: ");
        n3 = inp. nextInt();
        
        
        if(n1>n2&&n1>n3){
            first=n1;
            if(n2>n3){
                second=n2;
                third=n3;
            }else{
                second=n3;
                third=n2;
            }
        }
        else if(n2>n1&&n2>n3){
            first=n2;
            if(n1>n3){
                second=n1;
                third=n3;
            }else{
                second=n3;
                third=n1;
            }
        }
        else{
            first=n3;
            if(n1>n2){
                second=n1;
                third=n2;
            }else{
                second=n2;
                third=n1;
            }
        }        
        System.out.println("Büyükten küçüğe sıralama: "+first+">"+second+">"+third);
     }
}
