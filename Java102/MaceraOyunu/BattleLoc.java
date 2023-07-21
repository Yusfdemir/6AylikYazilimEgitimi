/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

import java.util.Random;

/**
 *
 * @author yusuf
 */
public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    
    public BattleLoc(Player player, String name,Obstacle obstacle, String award,int maxObstacle) {
        super(player, name);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }
    
    @Override
    public boolean onLocation(){
        int obsNumber=this.randomObstacleNumber();
        System.out.println("Şu anda şu konumdasınız : "+this.getName());
        System.out.println("Dikkatli Ol!! Burada "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor");
        System.out.print("<S>avaş veya <K>aç : ");
        String selectCase=input.nextLine();
        selectCase=selectCase.toUpperCase();
        if(selectCase.equals("S")){
            System.out.println("Savaş işlemleri olacak");
        }
        
        return true;
    }
    
    public int randomObstacleNumber(){
        Random r=new Random();
        return r.nextInt(this.getMaxObstacle())+1; //r.nextInt(3)+1 -> 1,2 veya 3 dönderir
    }
    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
    
    
}
