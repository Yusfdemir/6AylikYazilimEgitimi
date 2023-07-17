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
        player.selectChar();
    }
}
