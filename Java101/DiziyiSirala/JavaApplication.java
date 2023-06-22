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
     Scanner inp=new Scanner(System.in);
     System.out.print("Dizi kaç eleman sayısını girin :");
     num=inp.nextInt();
     
     int[] list=new int[num];
     
     for(int i=0;i<num;i++){
        System.out.print("\n"+(i+1)+". elemenı girin :");
        list[i]=inp.nextInt();
     }
     Arrays.sort(list);
      System.out.println("Dizinin sıralı hali : "+Arrays.toString(list));
    }
  } 

