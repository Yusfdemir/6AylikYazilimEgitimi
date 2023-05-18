/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
import java.util.Scanner;

public class JavaApplication {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        //Describe Variables
        String userName, password, answer, newPassword;
        //Describe scanner object
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adı: ");
        userName = inp. nextLine();
        System.out.print("Şifre: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }

        else if (userName.equals("patika") && !(password.equals("java123"))) {

            System.out.print("Şifre yanlış! Sıfırlamak ister misiniz? (Evet ve ya Hayır) ");
            answer = inp.nextLine();

            if (answer.equals("Evet") || answer.equals("evet")) {
                System.out.print("Önceden kullanmadığınız yeni şifre girin: ");
                newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else
                    System.out.println("Şifre oluşturuldu");
            }
            else {
                System.out.println("Şifre oluşturmadınız.");
            }
        }
        else {
            System.out.println("Bilgiler yanlış");
        }

    }
}
