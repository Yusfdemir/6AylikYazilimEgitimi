/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javathreads;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yusuf
 */
public class JavaThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // Threads with extend Thread Class
        /*Counter c1 = new Counter("Counter 1");
        Counter c2 = new Counter("Counter 2");
        c1.start();
        c2.start();
        */
        
        //Threads with implement Runnable interface
        /*
        Counter1 c1=new Counter1("c1");
        Counter1 c2=new Counter1("c2");
        Counter1 c3=new Counter1("c3");
        
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        Thread t3=new Thread(c3);
        
        t1.start();
        t2.start();
        t3.start();
        */
        
        // Thread beklemek ve durdurmak   !!!Not:Counter1 clasında değişiklik yapıldı
        
        /*Counter1 c1=new Counter1("c1",1);
        Thread t1=new Thread(c1);
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        c1.stop();
        */
        
        //Critical Section and Race Condition
        OrderMatic oMatic=new OrderMatic();
        /*Thread t1=new Thread(oMatic);
        t1.start();
        t1.join();
        Thread t2=new Thread(oMatic);
        t2.start();
        t2.join();*/
        
        /*List<Thread> islemler=new ArrayList<>();
        for(int i=0;i<=100;i++){
            Thread t=new Thread(oMatic);
            islemler.add(t);
            t.start();
        }*/
        
        //Thread Pooling
        ExecutorService pool=Executors.newFixedThreadPool(10);
        for(int i=0;i<100;i++){
            pool.execute(oMatic);
        }
        
    }
    
    
    
    
    
}
