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
        int num;
        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Sayı gireceksiniz : ");
        num=input.nextInt();
        int [] arr=new int[num];
        
        for(int i=0;i<num;i++){
            System.out.print("\n"+(i+1)+ ". sayıyı girin :");
            arr[i]=input.nextInt();
        }
        
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;                
                }
            }
        }
       System.out.println("Max is : "+arr[num-1]);
       System.out.println("Min is : "+arr[0]); 
    }
}
