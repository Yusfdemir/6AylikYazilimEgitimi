/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yusuf
 */
import java.util.*;

public class Fixture
{
    Scanner input=new Scanner(System.in);
    ArrayList <String> clubs=new ArrayList<>();// Takımların ekleneceği arrayList
    ArrayList <String >coupleTeams=new ArrayList<>();// Fikstüre eklenmiş olan takımların eklendiği arrayList
    int fixtureValue=0;// O hafta takım sayasına göre kaç adet maç oynanacağını belirleyecek sayaçta kullanılacak sayaç(ileride anlatılacak)

    Random random=new Random();


    public void run()
    {

        boolean status=true;
        while (status)
        {

            System.out.println("""
                Lütfen yapmak istediğiniz işlemi seçiniz:\s
                1-Takım ekleme
                2-Fikstür oluşturma
                0-Çıkış""");

            System.out.println("--------------------");
            int choose=input.nextInt();


            switch (choose) {
                case 1 -> {
                    System.out.print("Eklenecek olan takımın adını giriniz: ");
                    input.nextLine();
                    String clubName = input.nextLine();
                    clubs.add(clubName);
                    System.out.println("Takım eklendi: " + clubs.get(clubs.size() - 1));
                    System.out.println("--------------------");
                }
                case 2 -> createFixture();
                case 0 -> status = false;
                default -> System.out.println("Lütfen geçerli bir işlem giriniz..");
            }
        }
    }


    public void createFixture()
    {
        if (clubs.size()%2!=0)//Takım sayısı tek ise 'Bay' takımımını ekle
            clubs.add("Bay");
         
        for (int i=0;i<clubs.size()-1;i++)
        {
            String away;
            String home;
            int matchQuality=0;
            String selectedTeams="";

               while (matchQuality<clubs.size()/2)//bir haftada takım sayısının yarısı kadar maç vardır
               {
                    away=clubs.get(random.nextInt(clubs.size()));
                    home=clubs.get(random.nextInt(clubs.size()));
                    if (!away.equals(home))//Aynı takımın seçilmemeli
                    {
                        if (!selectedTeams.contains(away) && !selectedTeams.contains(home))//bir takım bir haftada bir maç yapabilir
                        {
                            String match1=(away+" vs "+home);
                            String match2=(home+" vs "+away);

                            if (!coupleTeams.contains(match1) && !coupleTeams.contains(match2))//maç yapan takımlar birdaha karşılaşmamalıdır
                            {
                                coupleTeams.add(match1);//Maç yapan takımlar listeye eklenerek birdaha karşılaşmamaları sağlanmıştır
                                coupleTeams.add(match2);

                                selectedTeams+=home;//O hafta maç yapan takımlar birdaha seçilmemesi için bir stringe atanmıştır
                                selectedTeams+=away;
                                matchQuality++;
                            }
                        }
                    }

               }
        }
        displayFixtures();
    }

    public void displayFixtures(){
       for (int bringMeet=0;bringMeet<coupleTeams.size();bringMeet+=2)
       {
        fixtureValue++;
        System.out.println("--------Fixture "+fixtureValue+"--------");
        int fixtureCounter=0;//O haftadaki maç miktarı sağlanana kadar devam edecek döngü için eklenene değişken
        while (fixtureCounter<clubs.size()/2){
            System.out.println(coupleTeams.get(bringMeet));
            fixtureCounter++;
            bringMeet+=2;
            if (bringMeet>=coupleTeams.size())//Eğer toplam maç miktarını geçerse döngüyü kır.
                break;
           }

           bringMeet-=2;
       }
        
        for (int bringMeet=1;bringMeet<coupleTeams.size();bringMeet+=2)
        {
            //rövanş maççları yazdırılıyor
            fixtureValue++;
            System.out.println("--------Fixture "+fixtureValue+"--------");
            int fixtureCounter=0;
            while (fixtureCounter<clubs.size()/2)
            {
                System.out.println(coupleTeams.get(bringMeet));
                fixtureCounter++;
                bringMeet+=2;

                if (bringMeet>=coupleTeams.size())
                {
                    break;
                }
            }
            bringMeet-=2;
        }
    }
}