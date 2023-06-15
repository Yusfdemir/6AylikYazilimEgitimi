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

    static int pow(int taban,int us){
        if(us==0){
            return 1;
        }
        return taban*pow(taban,us-1);
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Tabanı girin: ");
       int taban=scan.nextInt();
       System.out.print("Üssü girin: ");
       int us=scan.nextInt();
       
       System.out.println(taban+"^"+us+" = "+pow(taban,us));
    }
    
}
