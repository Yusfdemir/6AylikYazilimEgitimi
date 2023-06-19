/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.util.Random;
/**
 *
 * @author yusuf
 */
public class Ring {
     Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if(isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0 ){
                System.out.println(">>>>NEW ROUND<<<<");

                if (firstToAttack() == true) {
                    this.f2.health = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + "'s Health = " + this.f2.health);
                    System.out.println(this.f1.name + "'s Health =  " + this.f1.health);
                    if (isWin()) {
                        break;
                    }
                }
                else {
                    this.f1.health = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + "'s Health =  " + this.f1.health);
                    System.out.println(this.f2.name + "'s Health = " + this.f2.health);
                    if (isWin()) {
                        break;
                    }

                }
            }

        }
        else {
            System.out.println("Athletes' weights don't match !");
        }
    }
    public boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " won !");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " won !");
            return true;
        }
        return false;
    }
    public boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
    public boolean firstToAttack () {
        int number = (int)(Math.random()*10);
        if (number <= 5) {
            return true; // if it is true, then f1 will start.
        }
        return false;
    }
}
