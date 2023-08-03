/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

import java.util.Scanner;




/**
 *
 * @author yusuf
 */

public class JavaApplication {
       
       
    public static void main(String[] args) {
      PatikaStore patika=new PatikaStore();
      Scanner input=new Scanner(System.in);
      boolean flag=true;
      int select;
      
      while(flag){
        System.out.println("Patika Store Ürün Yönetim Paneli\n1-Notebook İşlemleri\n2-Telefon İşlemleri\n3-Marka Lİstele\n0-Çıkış Yap");
        System.out.print("Tercihiniz : ");
        select=input.nextInt();
        
        switch(select){
            case 0 -> flag=false;
            case 1 ->{
                //notebook işlemleri
                patika.operationForNotebooks();
            }
            case 2->{
                //telefon işlemleri
                patika.operationForPhones();
            }
            case 3->{
                // Marka işlemleri
                patika.displayBrands();
            }
            
            
        }
      }
      
      
    }

  } 

