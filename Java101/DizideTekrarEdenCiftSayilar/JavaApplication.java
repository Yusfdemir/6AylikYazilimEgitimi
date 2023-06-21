/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */

import java.util.Arrays;
public class JavaApplication {
    
    static boolean isFind(int[] arr,int value){
        for(int i: arr){
            if(i==value){
                return true;
            }   
        }
        return false;
    }
    public static void main(String[] args) {
      int[] list={2,5,6,7,8,9,2,5,8,7,7,3,12,53,12};
      int[] evenDuplicate=new int[list.length];
      int start=0;
      for(int i=0;i<list.length;i++){
        for(int j=0;j<list.length;j++){
            if((i!=j)&&(list[i]==list[j])&& (list[i]%2==0)){
                if(!isFind(evenDuplicate,list[i])){
                    evenDuplicate[start++]=list[i];
                }
                break;
            }
        }
      }
      
      for(int value:evenDuplicate){
          if(value!=0){
            System.out.println(value);
          }
      }
      
    }
  } 

