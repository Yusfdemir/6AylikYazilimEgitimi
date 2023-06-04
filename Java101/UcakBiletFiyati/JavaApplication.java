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
        int km,yas,secim;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Mesafeyi Km cinsinden girin : ");
        km=input.nextInt();
        System.out.print("\nYaşınızı girin : ");
        yas=input.nextInt();
        System.out.print("\nSeçiniz : 1-Tek gidiş 2-Gidiş-Dönüş .....->");
        secim=input.nextInt();
        if(km<0 || yas<0 || secim<0 || secim>2){
           System.out.println("Hatalı Veri Girdiniz");
           return ;
        }
        double indirim = 0;
        double indirim2=0;
        double normaltutar=km*0.10;
        System.out.println("Tutar : "+normaltutar);
        if(yas<12){
            indirim=normaltutar*0.5;
        }else if(yas>=12&&yas<25){
            indirim=normaltutar*0.1;
        }
        else if(yas>65){
            indirim=normaltutar*0.3;
        }
        double indirimlitutar=normaltutar-indirim;
        System.out.println("seçim hariç Tutar : "+indirimlitutar);
        if(secim==2){
            indirim2=indirimlitutar*0.2;
            indirimlitutar-=indirim2;
            indirimlitutar*=2;
        }
        
        System.out.println("Toplam Tutar : "+indirimlitutar +" TL");
    }
}
