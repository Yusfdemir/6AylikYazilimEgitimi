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
        int number,sum=0,count=0;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        number = inp. nextInt();
        
        for(int i=0;i<number;i++){
            if(i%3==0 && i%4==0){
                count++;
                sum+=i;
            }
        }
        double avarage=(double)sum/count;
        System.out.println(number+"'e kadar 3'e ve 4'e tam bölünen sayıların ortalaması: "+avarage);
     }
}
