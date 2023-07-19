/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author yusuf
 */
public abstract class NormalLoc extends Location {
    public NormalLoc(Player player,String name){
        super(player,name);
    }
    @Override
    public boolean onLocation() {
        return true;
    }
    
}
