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

        //Describe variables
        double armut,elma,domates,muz,patlıcan,toplamTutar;
        
        //Describe Scanner object
        Scanner input =new Scanner(System.in);
        //Take the height and weight
        System.out.print("Armut kaç kilo : ");
        armut=input.nextDouble();
        System.out.print("\nElma kaç kilo : ");
        elma=input.nextDouble();
        System.out.print("\nDomates kaç kilo : ");
        domates=input.nextDouble();
        System.out.print("\nMuz kaç kilo : ");
        muz=input.nextDouble();
        System.out.print("\nPatlıcan kaç kilo : ");
        patlıcan=input.nextDouble();
        //Calculate 
        toplamTutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlıcan*5.00);
        
        System.out.println("Toplam Tutar : "+toplamTutar+" TL");
    }
    
}
