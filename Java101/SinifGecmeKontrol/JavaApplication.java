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
        int mat,turkce,fizik,kimya,muzik;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Mtematik notunuzu girin: ");
        mat = inp. nextInt();
        System.out.print("\nTürkçe Notunuzu girin: ");
        turkce = inp.nextInt();
        System.out.print("\nFizik Notunuzu girin: ");
        fizik = inp.nextInt();
        System.out.print("\nKimya Notunuzu girin: ");
        kimya = inp.nextInt();
        System.out.print("\nMüzik Notunuzu girin: ");
        muzik = inp.nextInt();

        double sum=0.0;
        int numofClass=0;
        
        if(mat>=0&&mat<=100){
            numofClass++;
            sum+=mat;
        }else{
           System.out.println("Matematik için geçersiz not girdiniz bundan dolayı ortalamaya dahil edilmeyecek !!!");
        }
        if(turkce>=0&&turkce<=100){
            numofClass++;
            sum+=turkce;
        }else{
           System.out.println("Türkçe için geçersiz not girdiniz bundan dolayı ortalamaya dahil edilmeyecek !!!");
        }
        if(fizik>=0&&fizik<=100){
            numofClass++;
            sum+=fizik;
        }else{
           System.out.println("Fizik için geçersiz not girdiniz bundan dolayı ortalamaya dahil edilmeyecek !!!");
        }
        if(kimya>=0&&kimya<=100){
            numofClass++;
            sum+=kimya;
        }else{
           System.out.println("Kimya için geçersiz not girdiniz bundan dolayı ortalamaya dahil edilmeyecek !!!");
        }
        if(muzik>=0&&muzik<=100){
            numofClass++;
            sum+=muzik;
        }else{
           System.out.println("Müzik için geçersiz not girdiniz bundan dolayı ortalamaya dahil edilmeyecek !!!");
        }
            
        double avarage=sum/numofClass;
        if(avarage>55){
            System.out.println("Geçtiniz");
        }
        else{
        System.out.println("Kaldınız");
        }
        System.out.println("Ortalamanız: "+avarage);
    }
}
