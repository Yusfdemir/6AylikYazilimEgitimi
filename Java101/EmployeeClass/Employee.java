/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
public class Employee {
    String name;
        int salary;
        int workHours;
        int hireYear;
        
        Employee(String name,int salary,int workHours,int hireYear){
            this.name=name;
            this.salary=salary;
            this.workHours=workHours;
            this.hireYear=hireYear;
        }
       public double tax(){
            if(this.salary<1000){
                return 0;
            }
            else{
                return this.salary*3/100;
            }   
        }
        
        public int bonus(){
            if(this.workHours<40){
                return 0;
            }
            else{
                return (this.workHours-40)*30;
            }
        }
    
       public double raiseSalary(){
            if((2021-this.hireYear)<10){
                return this.salary*0.05;
            }
            else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
                return this.salary*0.1;
            }
            else {
                return this.salary*0.15;
            }       
        }
        public String toString(){
            return "\nAdı: "+this.name+"\nMaaşı: "+this.salary+"\nÇalışma Saati: "+this.workHours+"\nBaşlangıç yılı: "+this.hireYear+"\nVergi :"+this.tax()+"\nBonus :"+this.bonus()+"\nMaaş Artışı: "+this.raiseSalary()+"\nVergi ve bonus ile birlikte maaş :"+(this.salary+this.bonus()-this.tax())+"\nToplam Maaş :"+(this.salary+this.raiseSalary());
        } 
}
