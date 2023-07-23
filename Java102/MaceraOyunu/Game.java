/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maceraoyunu;

/**
 *
 * @author yusuf
 */

import java.util.Scanner;

public class Game {
    private Scanner input=new Scanner(System.in);
    public void start(){
        System.out.println("Macera Oyununa Hoşgeldiniz !!!");
        System.out.print("Lütfen bir isim girin : ");
        String playerName=input.nextLine();
        Player player=new Player(playerName);
        System.out.print("Sayın "+player.getName()+ " bu karanlık ve sisli adaya hoşgeldiniz !! Burada yaşananların hepsi gerçek");
        System.out.println("Lütfen bir karakter seçiniz !");
        System.out.println("----------------------------------------------");
        player.selectChar();
       
        Location location=null;
        while(true){
            player.printInfo();
            System.out.println();
            System.out.println("#####Bölgeler#####");
            System.out.println();
            System.out.println("1- Güvenli Ev");
            System.out.println("2- Eşya dükkanı");
            System.out.println("3- Mağaraya git, Burada karşına Zombi çıkabilir -> Ödül= <Yemek>");
            System.out.println("4- Ormana git, Burada karşına Vampir çıkabilir -> Ödül= <Odun>");
            System.out.println("5- Nehire git, Burada karşına Ayı çıkabilir -> Ödül= <Su>");
            System.out.println("0- Oyundan Çık");
            System.out.print("Lütfen gitmek istediğiniz bölgeyi seçiniz: ");
            int selectLoc=input.nextInt();
            switch(selectLoc){
                case 0:
                    location=null;
                    break;
                case 1:
                    location=new SafeHouse(player);
                    break;
                case 2:
                    location=new ToolStore(player);
                    break;
                case 3:
                    location=new Cave(player);
                    break;
                case 4:
                    location=new Forest(player);
                    break;
                case 5:
                    location=new River(player);
                    break;
                default:
                    System.out.println("Lütfen Geçerli bir bölge girin");
                    //location=new SafeHouse(player);
                    break;
            }
            if(location == null){
                System.out.println("Bu karanlık ve sisli adadan çabuk vazgeçtin !");
                break;
            }
            if(!location.onLocation()){
                System.out.println("Öldünüz ---> Game Over");
                break;
            }
        }
    }
}
