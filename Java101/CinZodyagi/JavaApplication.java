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
        int dogumyili;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Doğum yılınızı girin : ");
        dogumyili=input.nextInt();
       
        switch(dogumyili%12){
            case 0:
                System.out.println("Çin Zodyağı burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Çin Zodyağı burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Çin Zodyağı burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Çin Zodyağı burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Çin Zodyağı burcunuz : Fare");
                break;
            case 5:
                System.out.println("Çin Zodyağı burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Çin Zodyağı burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Çin Zodyağı burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Çin Zodyağı burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Çin Zodyağı burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Çin Zodyağı burcunuz : At");
                break;     
            case 11:
                System.out.println("Çin Zodyağı burcunuz : Koyun");
                break;
        }
        
    }
}
