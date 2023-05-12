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
            int a,b,c;
            double u,area;
            //Describe Scanner object
            Scanner input =new Scanner(System.in);
            //Take the lenghts
            System.out.print("Üçgeninin birinci kenar uzunluğunu giriniz : ");
            a=input.nextInt();
            System.out.print("\nÜçgeninin ikinci kenar uzunluğunu giriniz : ");
            b=input.nextInt();
            System.out.print("\nÜçgeninin üçüncü kenar uzunluğunu giriniz : ");
            c=input.nextInt();
            //Calculate Area
            u=(a+b+c)/2;
            area=u*(u-a)*(u-b)*(u-c);
            System.out.println("Alan: " +area);
    }
    
}
