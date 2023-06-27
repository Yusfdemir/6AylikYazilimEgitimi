/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */

public class JavaApplication {
    
    public static void main(String[] args) {
        int [][] matrix = { {1,2,3},{4,5,6} };
        System.out.println("Transpoze of matrix:");
        change(matrix);
    }
    public static void change (int [][] matrix) { //This method is for replacing the rows and columns of the matrix.
        int [][] transpoze = new int [matrix[0].length][matrix.length];
        for (int rows = 0; rows < matrix.length; rows++) { 
            for (int col = 0; col < matrix[0].length; col++) { 
                transpoze[col][rows] = matrix [rows][col]; 
            }
        }
        printArray(transpoze); //we called the printArray method and printed the new array on the screen.
    }
    public static void printArray(int [][] matrix) { 
        for (int [] rows : matrix) {
            for (int col : rows) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
  } 

