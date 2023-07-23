/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author yusuf
 */
public class ToolStore extends NormalLoc {

    public ToolStore(Player player) {
        super(player,"Mağaza");
    }
    @Override
    public boolean onLocation() {
        System.out.println("------- Mağazaya Hoşgeldiniz -------");
        boolean showMenu=true;
        while(showMenu){
            System.out.println("1-) Silahlar");
            System.out.println("2-) Zırhlar");
            System.out.println("3-) Çıkış Yap");
            System.out.print("Seçiminiz: ");
            int selectCase=input.nextInt();
            while(selectCase<1 || selectCase>3){
                 System.out.println("Geçersiz bir değer girdiniz tekrar giriniz: ");
                 selectCase=input.nextInt();
            }
            switch(selectCase){
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println("Bir daha bekleriz :)");
                    showMenu=false;
                    break;
            }
        }
        return true;
    }
    
    //************ Weapon functions
    
    public void printWeapon(){
        System.out.println("-------Silahlar-------");
        System.out.println();
        for(Weapon w:Weapon.weapons()){
            System.out.println(w.getId()+"- "+w.getName()+"  Para: "+w.getPrice()+"  Hasar: "+w.getDamage());
        }
        System.out.println("0 - Çıkış Yap");
    }
    public void buyWeapon(){
        System.out.println("Bir silah seçiniz :");
        int selectWeaponId=input.nextInt();
        while(selectWeaponId<0 || selectWeaponId>Weapon.weapons().length){
             System.out.println("Geçersiz bir değer girdiniz tekrar giriniz: ");
             selectWeaponId=input.nextInt();
        }
        if(selectWeaponId != 0){
            Weapon selectedWeapon=Weapon.getWeaponObjById(selectWeaponId);
            if(selectedWeapon!= null){
                if(selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli Paranız bulunmamaktadır");
                }
                else{
                    System.out.println(selectedWeapon.getName()+" silahını satın aldınız");
                    int balance=this.getPlayer().getMoney()-selectedWeapon.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız :"+this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setWeapon(selectedWeapon);

                }
            }
        }
       
    }
    
    //************ Armor functions
    
    public void printArmor(){
    System.out.println("-------Zırhlar-------");
    System.out.println();
        for(Armor a:Armor.armors()){
          System.out.println(a.getId()+"- "+a.getName()+"  Para: "+a.getPrice()+"  Koruma(Zırh): "+a.getBlock());  
        }
        System.out.println("0 - Çıkış Yap");
    }
    
    public void buyArmor(){
        System.out.println("Bir Zırh seçiniz :");
        int selectArmorId=input.nextInt();
        while(selectArmorId<0 || selectArmorId>Armor.armors().length){
             System.out.println("Geçersiz bir değer girdiniz tekrar giriniz: ");
             selectArmorId=input.nextInt();
        }
        
        if(selectArmorId != 0){
            Armor selectedArmor=Armor.getArmorObjById(selectArmorId);
        
            if(selectedArmor!= null){
                if(selectedArmor.getPrice()>this.getPlayer().getMoney()){
                    System.out.println("Yeterli Paranız bulunmamaktadır");
                }
                else{
                    System.out.println(selectedArmor.getName()+" zırhını satın aldınız");
                    int balance=this.getPlayer().getMoney()- selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println("Kalan Paranız :"+this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);

                }
            }
        }
        
    }
}
