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
import java.util.Arrays;
public class JavaApplication {
    public static void main(String[] args) {
       int num;
       int num2;
       Scanner inp=new Scanner(System.in);
       //Kullanıcıdan Dizideki eleman sayısı alındı
       System.out.println("Eleman Sayısını Girin :");
       num=inp.nextInt();
        int[] list = new int[num];
        //Kıyaslama yapılacak sayıdan küçük en büyük sayının indexini tutacağımız değişken
        int smallerThanNum2=0;
        // Dizi elemanları kullanıcıdan alındı
        for(int i=0;i<num;i++){
            System.out.println(i+1+". elemanı girin : ");
            list[i]=inp.nextInt();
        }
        System.out.println("Hangi sayıya kıyas yapacaz :");
        num2=inp.nextInt();
        //Dizi sıralandı
        Arrays.sort(list);
        //Kıyaslama yapılacak sayıdan küçük en büyük sayının indexi bulundu
        for(int i=0;i<num;i++){
            if(list[i]<num2)
                smallerThanNum2=i;           
        }
       System.out.println("Girilen sayıdan küçük en büyük sayı : " +list[smallerThanNum2]+"\nGirilen sayıdan büyük en küçük sayı : "+list[smallerThanNum2+1]);

    }
  } 

