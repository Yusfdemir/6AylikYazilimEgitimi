/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
public class AdressManager {
    public static void addAdress(User user, Adress adres){
        user.getAdressList().add(adres);
    }
    
    public static void deleteAdress(User user, Adress adres){ 
     user.getAdressList().remove(adres);
    }
}
