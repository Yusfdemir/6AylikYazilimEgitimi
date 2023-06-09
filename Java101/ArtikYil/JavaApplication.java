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
        int yil;
        Scanner input=new Scanner(System.in);
        System.out.print("Yılı girin : ");
        yil=input.nextInt();
        
          boolean artikMi = false;

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artikMi = true;
                else
                    artikMi = false;
            }
            else
                artikMi = true;
        }
        else {
            artikMi = false;
        }

        if(artikMi==true)
            System.out.println(yil + " artık bir yıldır.");
        else
            System.out.println(yil + " artık bir yıl değildir.");
        
       
        
    }
}
