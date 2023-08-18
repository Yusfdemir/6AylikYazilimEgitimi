/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javathreads;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yusuf
 */
public class Counter1 implements Runnable {
    private String name;
    private int id;
    private boolean isRun=true;
            

    public Counter1(String name,int id) {
        this.name = name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {
       System.out.println(this.getName()+" sayacı başladı");
      /* for(int i=0;i<100;i++){
           try {
            Thread.sleep(1000L * this.id);
           }
           catch (InterruptedException ex) {
            ex.printStackTrace();
           }
           System.out.println(this.getName()+" : "+i);
       }*/
      int i=0;
      while(isRun){  
        try {
          Thread.sleep(1000L * this.id);
        }
        catch (InterruptedException ex) {
          ex.printStackTrace();
        }
        System.out.println(this.getName()+" : "+i++);
      }
    }
    
    public void stop(){
        this.isRun=false;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
