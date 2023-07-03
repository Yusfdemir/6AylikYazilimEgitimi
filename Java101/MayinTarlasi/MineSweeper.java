/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
import java.util.Scanner;
import java.util.Random;

public class MineSweeper {
     Scanner input = new Scanner(System.in);
    Random randomMineNumber = new Random();
    int row;
    int column;
    String[][] map;
    String[][] frame;
    int mineNumber;

    public void run(){
        System.out.println(" = Welcome to Minesweeper Game = ");
        System.out.print("Number of Row    : ");
        row = input.nextInt();
        System.out.print("Number of Column : ");
        column = input.nextInt();

        mineNumber = (row*column) / 4;

        map = new String[row][column];
        frame = new String[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                frame[i][j] = "-";
                map[i][j] = "-";
            }
        }

        while(mineNumber > 0){
            int rowMineNumber = randomMineNumber.nextInt(row);
            int columnMineNumber = randomMineNumber.nextInt(column);

            if(map[rowMineNumber][columnMineNumber].equals("-")){
                map[rowMineNumber][columnMineNumber] = "*";
                mineNumber--;
            }

        }
        printFrame();

        playCheck();
    }

    public void playCheck(){
        boolean finish = false;
        while(!finish){
            System.out.print("Number of Row    : ");
            int selectedRow = input.nextInt();
            System.out.print("Number of Column : ");
            int selectedColumn = input.nextInt();

            int mineNumber=0;

            if(selectedRow < row && selectedColumn < column){
                if(map[selectedRow][selectedColumn].equals("-") && frame[selectedRow][selectedColumn].equals("-")){
                    for(int i = selectedRow-1; i < selectedRow + 2; i++){
                        for(int j = selectedColumn-1; j < selectedColumn + 2; j++){
                            if(i>=0 && j>=0 && i<row && j<column && map[i][j].equals("*")){
                                mineNumber++;
                                frame[selectedRow][selectedColumn] = Integer.toString(mineNumber);
                            }else{
                                frame[selectedRow][selectedColumn] = Integer.toString(mineNumber);
                            }

                        }
                    }
                    printFrame();
                    if(!checkWin()){
                        System.out.println("Congratulations ! You won the game :)");
                        printMap();
                        finish = true;
                    }

                }else if(map[selectedRow][selectedColumn].equals("*")){
                    System.out.println("You lost :( You Hit a Mine :( Boom!!! ");
                    printMap();
                    finish = true;
                }else if(!frame[selectedRow][selectedColumn].equals("-")){
                    System.out.println("Previously entered! Enter a different cell...");
                }

            }
            else{
                System.out.println("Incorrect entry! Do not choose from outside the playground.");
            }
        }
    }

    public void printMap(){

        for(String[] row:map){
            for(String column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }
    public void printFrame(){
        for(String[] row:frame){
            for(String column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println("====================");
    }

    boolean checkWin(){
        int emptyCell=0;
        int minedCell=0;
        for(int i=0; i < frame.length; i++){
            for(int j=0; j < frame[i].length; j++){
                if(frame[i][j].equals("-")){
                    emptyCell++;
                }
                if(map[i][j].equals("*")){
                    minedCell++;
                }
            }
        }
        if(emptyCell == minedCell){
            return false;
        }
        return true;
    }
       
}
