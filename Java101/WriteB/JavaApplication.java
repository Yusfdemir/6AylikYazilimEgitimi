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
       String[][] letter = new String[5][5];

        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 2 || i==4) {
                    if(j==4) letter[i][j] = " ";
                    else
                    letter[i][j] = " *";
                } else if (j == 0 || j == 4) {
                    if(j==4){
                    letter[i][j]="  *";
                    }else
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = " ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
  } 

