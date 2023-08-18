/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javathreads;

/**
 *
 * @author yusuf
 */
public class Counter extends Thread{
    private String name;

    public Counter(String name) {
        this.name = name;
    }
     
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println(this.name+" : "+i);
        }
    }
    
    
}
