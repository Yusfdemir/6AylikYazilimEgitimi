/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

import java.util.Scanner;

/**
 *
 * @author yusuf
 */
public abstract class Location {
    private Player player;
    private String name;
    public static Scanner input=new Scanner(System.in); 
            
    public Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }
    
    public abstract boolean onLocation();
    
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
