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
        
     int[] list = {10,20,20,10,10,20,5,20};
        for(int j = 0 ; j < list.length ; j++){
            int count = 0;
            boolean isCount = false;
            for (int k = j-1 ; k >= 0 ; --k){
                if(list[k]==list[j]){
                    isCount = true;
                    break;
                }
            }
            if(!isCount){
                for(int i = 0 ; i < list.length ; i++){
                    if (list[j] == list[i]) count++;
                }
            }
            if(count >= 1)System.out.println(list[j]+" sayısı "+count+" defa tekrar edildi");
        }

    }
  } 

