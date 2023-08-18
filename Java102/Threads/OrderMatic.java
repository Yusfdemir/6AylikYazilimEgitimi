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
public class OrderMatic implements Runnable {
    private int orderNo;
    private final Object LOCK=new Object();
    
    public OrderMatic(){
        this.orderNo=0;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        /*synchronized(LOCK){
            this.orderNo++;
            System.out.println("Thread: "+Thread.currentThread().getName()+" OrderNo: "+this.orderNo);
        }*/
        // OR
        increaseOrder();
    }
    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println("Thread: "+Thread.currentThread().getName()+" OrderNo: "+this.orderNo);
    }
    
    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }
    
}
