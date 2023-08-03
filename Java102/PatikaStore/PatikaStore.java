/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author yusuf
 */
public class PatikaStore {
    ArrayList<Phone> phones = new ArrayList<>();
    ArrayList<Notebook> notebooks = new ArrayList<>();
    ArrayList<String> brands=new ArrayList<>();
    Scanner input=new Scanner(System.in);
    public PatikaStore() {
        addBrands();
        addNotebook();
        addPhone();
    }
    // Statik ekleme İşlemleri
    public void addBrands(){
        brands.add("Samsung");
        brands.add("Lenovo");
        brands.add("Apple");
        brands.add("Huawei");
        brands.add("Casper");
        brands.add("Asus");
        brands.add("HP");
        brands.add("Xiomi");
        brands.add("Monster");
        Collections.sort(brands);
    }
    public void addNotebook(){
        notebooks.add(new Notebook(1,"Huawei Matebook 14",7000,"Huawei",512,14.0));
        notebooks.add(new Notebook(2,"LENOVO V14 IGL",3699,"Lenovo",1024,14.0));
        notebooks.add(new Notebook(3,"ASUS Tuf Gaming",8199,"Asus",2048,15.6));
    }
    public void addPhone(){
        phones.add(new Phone(1,"SAMSUNG GALAXY A51",3200,"Samsung",128,6.5));
        phones.add(new Phone(2,"Iphone 11 64 GB",7379,"Apple",64,6.1));
        phones.add(new Phone(3,"Redmi Noe 10 Pro 8GB",4012,"Xiomi",128,6.5));
    }
    // Markaları Alfabetik Sıralayan Kod
    public void displayBrands(){
        Iterator <String> itr= brands.iterator();
        System.out.println("MARKALARIMIZ");
        System.out.println("\n---------------------");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("---------------------\n");
    }

    //*********Telefonlar İçin İşlemler
    public void operationForPhones(){
        displayPhones();
        boolean flag=true;
        while(flag){
            System.out.println("1-Ürün ekle\n2-Ürün Sil\n0-Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int select=input.nextInt();

            switch(select){
                case 0 -> flag=false;
                case 1 ->{
                    addOnePhone();

                }
                case 2->{
                    deletePhone();

                }
                default -> System.out.println("Geçerli bir işlem yapınız");
            }
        }
    }    
    public void addOnePhone(){
        String name;
        int price;
        String brand;
        int memory;
        double screen;
        
        System.out.print("Cihaz Adını Girin : ");
        name=input.next();
        System.out.print("Cihaz Fiyatını Girin : ");
        price=input.nextInt();
        System.out.print("Cihaz Markasını Girin : ");
        brand=input.next();
        System.out.print("Cihaz Hafızasını Girin : ");
        memory=input.nextInt();
        System.out.print("Cihaz Ekran Boyutunu Girin : ");
        screen=input.nextDouble();
        
        if(brands.contains(brand)){
            phones.add(new Phone(Phone.getCount()+1,name,price,brand,memory,screen));
            Phone.setCount(Phone.getCount()+1);
            System.out.println("Tebrikler "+name+" adlı cihazı başarıyla eklediniz");
            displayPhones();
        }
        else{
            System.out.println("Eklediğiniz cihazın markası PatikaStore mağazasında bulunan markalardan biri olmak zorunda !!!");
        }
    }
    public void deletePhone(){
      int id;
      displayPhones();
      System.out.print("Silmek istediğiniz cihazın id numarasını girin : ");
      id=input.nextInt();
      
      phones.remove(id-1);
      
      displayPhones();
    }
    public void displayPhones(){
        Iterator <Phone> itr= phones.iterator();
        System.out.println("\n TELEFONLAR");
        System.out.printf("| %-3s | %-20s | %5s | %7s | %10s | %5s |%n", "ID", "Ürün Adı", "Fiyat","Marka","Depolama","Ekran");
        System.out.println("---------------------");
        while(itr.hasNext()){
            Phone p=itr.next();
            System.out.printf("| %-3s | %-20s | %5s | %7s | %10s | %5s |%n",p.getId(),p.getName(), p.getPrice(),p.getBrand(),p.getMemory(),p.getScreen());
        }
        System.out.println("---------------------\n");
    }
    //**********Notebooklar için İşlemler
    public void operationForNotebooks(){
        displayNotebooks();
        boolean flag=true;
        while(flag){
            System.out.println("1-Ürün ekle\n2-Ürün Sil\n0-Çıkış Yap");
            System.out.print("Tercihiniz : ");
            int select=input.nextInt();

            switch(select){
                case 0 -> flag=false;
                case 1 ->{
                    addOneNotebook();

                }
                case 2->{
                    deleteNoteBook();

                }
                default -> System.out.println("Geçerli bir işlem yapınız");
            }
        }
    }
    public void addOneNotebook(){
        String name;
        int price;
        String brand;
        int memory;
        double screen;
        
        System.out.print("Cihaz Adını Girin : ");
        name=input.next();
        System.out.print("Cihaz Fiyatını Girin : ");
        price=input.nextInt();
        System.out.print("Cihaz Markasını Girin : ");
        brand=input.next();
        System.out.print("Cihaz Hafızasını Girin : ");
        memory=input.nextInt();
        System.out.print("Cihaz Ekran Boyutunu Girin : ");
        screen=input.nextDouble();
        
        if(brands.contains(brand)){
            notebooks.add(new Notebook(Notebook.getCount()+1,name,price,brand,memory,screen));
            Notebook.setCount(Notebook.getCount()+1);
            System.out.println("Tebrikler "+name+" adlı cihazı başarıyla eklediniz");
            displayNotebooks();
        }
        else{
            System.out.println("Eklediğiniz cihazın markası PatikaStore mağazasında bulunan markalardan biri olmak zorunda !!!");
        }
    }
    public void deleteNoteBook(){
      int id;
      displayNotebooks();
      System.out.print("Silmek istediğiniz cihazın id numarasını girin : ");
      id=input.nextInt();
      System.out.println(notebooks.get(id-1).getName()+" adlı cihazı sildiniz!!\nMevcut cihazlarınız :");
      notebooks.remove(id-1);
      displayNotebooks();
    }
    public void displayNotebooks(){
        Iterator <Notebook> itr= notebooks.iterator();
        System.out.println("\n NOTEBOOKLAR");
        System.out.printf("| %-3s | %-20s | %5s | %7s | %10s | %5s |%n", "ID", "Ürün Adı", "Fiyat","Marka","Depolama","Ekran");
        System.out.println("---------------------");
        while(itr.hasNext()){
         Notebook n=itr.next(); 
         System.out.printf("| %-3s | %-20s | %5s | %7s | %10s | %5s |%n",n.getId(),n.getName(),n.getPrice(),n.getBrand(),n.getMemory(),n.getScreen());
        }
        System.out.println("---------------------\n");
    }
}