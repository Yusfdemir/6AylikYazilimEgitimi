/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author yusuf
 */
public class Inventory {
    private Weapon weapon;
    private Armor armor;
    
    
    public Inventory(){
        this.weapon=new Weapon("Yumruk",-1,0,0);
        this.armor=new Armor(-1,"Paçavra",0,0);
        
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

   
    
    
}
