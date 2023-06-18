/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */


public class JavaApplication {
    public static void main(String[] args) {
       Employee emp= new Employee("kemal",2000,45,1985);
       emp.tax();
       emp.bonus();
       emp.raiseSalary();
       System.out.print(emp.toString());
    }
    
}
