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
public class Player {
    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private Scanner input=new Scanner(System.in);
    
    public Player(String name){
        this.name=name;
    }
    
    public void selectChar(){

        
        GameCharacter[] charList={new Samurai(),new Archer(),new Knight()};
        System.out.println("-------------");
        for(GameCharacter gameChar:charList){
            System.out.println("Id: "+gameChar.getId()+
                    "\tKarakter: "+gameChar.getName()+
                    "\t\tHasar: "+gameChar.getDamage()+
                    "\t\tSağlık: "+gameChar.getHealth()+
                    "\t\tPara: "+gameChar.getMoney());
        }
        System.out.println("-------------");
        System.out.print("Lütfen bir karakter id seçin...");
        int selectChar=input.nextInt();
        
        switch(selectChar){
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer(new Samurai());
        }
        System.out.println("Karakter: "+this.getCharName()+
                ", Hasar: "+this.getDamage()+
                ", Sağlık: "+this.getHealth()+
                ", Para: "+this.getMoney());
    }
    
    public void initPlayer(GameCharacter gameChar){
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
    }
    
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }
    
}
