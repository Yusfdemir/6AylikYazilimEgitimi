/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
public class Phone extends Device {
    private String type;
    private static int count=3;

    public Phone(int id, String name, int price, String brand, int memory, double screen) {
        super(id, name, price, brand, memory, screen);
        this.type = "Telephone";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Phone.count = count;
    }
    
}
