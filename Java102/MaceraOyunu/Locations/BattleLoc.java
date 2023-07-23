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
        String selectCase=input.nextLine().toUpperCase();
        if(selectCase.equals("S")&& combat(obsNumber)){
            System.out.println(this.getName()+ " konumundaki tüm düşmanları yendiniz");
            if(this.getName() !="Maden"){
                System.out.println("Envanterinize "+this.getAward()+" eklendi");
                if(this.getName()=="Mağara"){
                    this.getPlayer().setHaveFood(true);
                }
                else if(this.getName()== "Orman"){
                    this.getPlayer().setHaveFirewood(true);
                }else if(this.getName()== "Nehir"){
                    this.getPlayer().setHaveWater(true);
                }
            }else{
                System.out.println("Madenden sağ çıktınız");
            }
            /*System.out.println("envanter:\nfood:"+this.getPlayer().isHaveFood()+
                "\nfirewood: "+this.getPlayer().isHaveFirewood()+
                "\nwater: "+this.getPlayer().isHaveWater());*/
            return true;     
        }
        
        if(this.getPlayer().getHealth()<=0){
            System.out.println("Öldünüz!!!");
            return false;
        }
        
        return true;
    }
    
    public boolean combat(int obsNumber){
        for(int i=1;i<=obsNumber;i++){
            this.getObstacle().setHealth(this.getObstacle().getOrjinalHealth());
            playerStats();
            obstacleStats(i);
            while(this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                System.out.print("<V>ur veya <K>aç : ");
                String selectCombat=input.nextLine();
                selectCombat=selectCombat.toUpperCase().toUpperCase();
                if(selectCombat.equals("V")){
                    if(randomNumber()>50){
                        hitPlayer();
                        hitObstacle();
                    }else{
                        hitObstacle();
                        hitPlayer();
                    }
                    
                }else{
                    return false;
                }
            }
            if(this.getObstacle().getHealth() < this.getPlayer().getHealth()){
                System.out.println("Düşmanı yendiniz");
                if(this.getName()!="Maden"){
                    System.out.println(this.getObstacle().getAward()+" para kazandınız");
                    this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                    System.out.println("Güncel Paranız: " +this.getPlayer().getMoney());
                }else{
                    awardOfMine();   
                }
                
                System.out.println();
            }else{
                return false;
            }
        }
        return true;
    }
    public void afterHit(){
        System.out.println("Canınız: "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + " Canı: "+this.getObstacle().getHealth());
        System.out.println("--------");
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("-----------------");
        System.out.println("Sağlığınız: "+this.getPlayer().getHealth());
        System.out.println("Silahınız: "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasarınız: "+this.getPlayer().getTotalDamage());
        System.out.println("Zırhınız: "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama Gücünüz: "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Paranız: "+this.getPlayer().getMoney()); 
        System.out.println();
    }
    public void obstacleStats(int i){
        System.out.println(i+". "+this.getObstacle().getName()+" Değerleri");
        System.out.println("-----------------");
        System.out.println("Sağlığı: "+this.getObstacle().getHealth());
        System.out.println("Hasarı: "+this.getObstacle().getDamage());
        System.out.println("Ödül: "+this.getObstacle().getAward());
        System.out.println();
    }
    public int randomObstacleNumber(){
        Random r=new Random();
        return r.nextInt(this.getMaxObstacle())+1; //r.nextInt(3)+1 -> 1,2 veya 3 dönderir
    }
    public int randomNumber(){
        Random r=new Random();
        return r.nextInt(100)+1;
    }
    public void hitPlayer(){
        if(this.getPlayer().getHealth()>0){
        System.out.println("Siz vurdunuz!!");
        this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getTotalDamage());
        }
        afterHit();
    }
    public void hitObstacle(){
        if(this.getObstacle().getHealth()>0){
            System.out.println();
            System.out.println("Canavar Size Vurdu !!");
            int obstacleDamage=this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
            //Mesela canavar hasarı 3 kalkan koruması 5 olsun canavar hasarı -2 olur burada onu kontrol ediyoruz
            if(obstacleDamage<0){
                obstacleDamage=0;
            }
            this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
            afterHit();
        }
    }
    public void awardOfMine(){
        Random r=new Random();
        int rand=r.nextInt(100)+1;
        if(rand<=15){//Silah Kazanma Olasılığı
            rand=r.nextInt(100)+1;
            if(rand<50){//Tabanca Kazanma Olasılığı
                if(this.getPlayer().getInventory().getWeapon().getDamage()>2){
                    System.out.println("Tabanca kazandınız ama elinizdeki silahın hasarı daha yüksek olduğundan almadınız !!!");
                }
                else{
                    System.out.println("Tabanca kazandınız");
                    //Weapon'a eklenen static metod ile tabanca id'sini kullanarak tabanca ekledik
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(1));
                }
            }
            else if(rand>50&&rand<=80){//Kılıç Kazanma Olasılığı
                if(this.getPlayer().getInventory().getWeapon().getDamage()>3){
                    System.out.println("Kılıç kazandınız ama elinizdeki silahın hasarı daha yüksek olduğundan almadınız !!!");
                }
                else{
                    System.out.println("Tabanca kazandınız");
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(2));
                }
            }
            else{//Tüfek Kazanma Olasılığı
                if(this.getPlayer().getInventory().getWeapon().getDamage()>7){
                    System.out.println("Tüfek kazandınız ama elinizdeki silahın hasarı daha yüksek olduğundan almadınız !!!");
                }
                else{
                    System.out.println("Tüfek kazandınız");
                    this.getPlayer().getInventory().setWeapon(Weapon.getWeaponObjById(3));
                }
            }
        }
        else if(rand>15&&rand<=30){//Zırh Kazanma Olasılığı
            rand=r.nextInt(100)+1;
            if(rand<50){//Hafif Zırh Kazanma Olasılığı
                if(this.getPlayer().getInventory().getArmor().getBlock()>1){
                    System.out.println("Hafif Zırh kazandınız ama elinizdeki zırh daha sağlam olduğu için almadınız !!!");
                }
                else{
                    System.out.println("Hafif Zırh kazandınız");
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(1));
                }    
            }
            else if(rand>50&&rand<=80){//Orta Zırh Kazanma Olasılığı
                if(this.getPlayer().getInventory().getArmor().getBlock()>3){
                    System.out.println("Orta Zırh kazandınız ama elinizdeki zırh daha sağlam olduğu için almadınız !!!");
                }
                else{
                    System.out.println("Orta Zırh kazandınız");
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(2));
                }
            }
            else{//Ağır Zırh Kazanma Olasılığı
                if(this.getPlayer().getInventory().getArmor().getBlock()>5){
                    System.out.println("Ağır Zırh kazandınız ama elinizdeki zırh daha sağlam olduğu için almadınız !!!");
                }
                else{
                    System.out.println("Ağır Zırh kazandınız");
                    this.getPlayer().getInventory().setArmor(Armor.getArmorObjById(3));
                }
            }
        }
        else if(rand>30&&rand<=55){//Para Kazanma Olasılığı
            rand=r.nextInt(100)+1;
            if(rand<50){// 1 para kazanma olasılığı
                System.out.println("1 Para kazandınız");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
                System.out.println("Güncel Paranız: " +this.getPlayer().getMoney());
            }
            else if(rand>50&&rand<=80){// 5 para kazanma olasılığı
                System.out.println("5 Para kazandınız");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
                System.out.println("Güncel Paranız: " +this.getPlayer().getMoney());
            }
            else{// 10 para kazanma olasılığı
                System.out.println("10 Para kazandınız");
                this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
                System.out.println("Güncel Paranız: " +this.getPlayer().getMoney());
            }

        }
        else{// Hiçbirşey Kazanamama Olasılığı
            System.out.println("Hiçbirşey Kazanamadınız :(");
        }
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
