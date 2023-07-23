/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author yusuf
 */
public class SafeHouse extends NormalLoc {

    public SafeHouse(Player player ) {
        super(player,"Güvenli Ev");
    }
    @Override
    public boolean onLocation() {
        System.out.println("Güvenli Evdesiniz");
        if(this.getPlayer().isHaveFirewood()&&this.getPlayer().isHaveFood()&&this.getPlayer().isHaveWater()){
            System.out.println("Tebrikler!!!! Yemek, Odun ve Suyu toplayıp başarıyla güzenli eve geldiniz\nOYUNU KAZANDINIZ !!!");
            return false;
        }
        System.out.println("Canınız Yenilendi");
        this.getPlayer().setHealth(this.getPlayer().getOrjinalHealth());
        return true;
    }
}
