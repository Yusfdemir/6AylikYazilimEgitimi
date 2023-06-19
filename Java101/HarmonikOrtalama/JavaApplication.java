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
    public static void main(String[] args) {
       int num;
       double harmonik=0.0;
       Scanner inp=new Scanner(System.in);
       System.out.println("Eleman Sayısını Girin");
       num=inp.nextInt();
       for(double i=1.0;i<num;i++){
           harmonik+=1/i;
       }
        System.out.println("Harmonik Ortalama= "+(num/harmonik));
    } 
}
