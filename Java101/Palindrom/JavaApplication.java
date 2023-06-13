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
        Scanner reader = new Scanner(System.in);
        int number;
        String sNum,sRevNum="";
        System.out.print("Sayı Girin:");
        number = reader.nextInt();
        sNum=""+number;
        //Sayıyı string çevirip tersini aldık
        for (int i = 0; i < sNum.length(); i++) {
            sRevNum = sNum.charAt(i) + sRevNum;
        }
        //Sayının string hali ile ters çevrilmiş hali eşitse sayı palindromdur
        if(sNum.equals(sRevNum)){
            System.out.println(number+" sayısı palindomdur");
        }
        else{
            System.out.println(number+" sayısı palindom değildir");
        }
        
    }
}
