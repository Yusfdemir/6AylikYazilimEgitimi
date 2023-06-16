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

    public static boolean isPrime(int num, int divider){
        if (num < 2) { // 2'den kücük sayılar asal değil.
            return false;
        }
        if (num == 2){ // 2 asal bir sayıdır.
            return true;
        }
        if (num % divider == 0) { // Eğer sayı bölündüyse asal değildir.
            return false;
        }
        if (divider * divider > num){ // Sayının karekokunden büyük sayılara bölünmezse asaldır.
            return true;
        }
        return isPrime(num, divider +1); //Böleni arttırarak fonksiyonu tekrar çağırır.
    }


    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Bir sayı girin: ");
       int num = scan.nextInt();
       if (isPrime(num,2)){
            System.out.println(num + " asal bir sayıdır.");
        } else {
            System.out.println(num + " asal bir sayı değildir.");
        }
    }
    
}
