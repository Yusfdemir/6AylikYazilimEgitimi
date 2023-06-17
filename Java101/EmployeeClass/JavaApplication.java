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
/*
     class Employee{
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
        double tax(){
            if(this.salary<1000){
                return 0;
            }
            else{
                return this.salary*3/100;
            }   
        }
        
        int bonus(){
            if(this.workHours<40){
                return 0;
            }
            else{
                return (this.workHours-40)*30;
            }
        }
    
        double raiseSalary(){
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
        
        void toString(){
           System.out.println("Adı: "+this.name+"\nMaaşı: "+this.salary+"\nÇalışma Saati: "+this.workHours+"\nBaşlangıç yılı: "+this.hireYear);
           System.out.println("Vergi :"+this.tax()+"\nBonus :"+this.bonus()+"\nMaaş Artışı: "+this.raiseSalary());
           System.out.println("Vergi ve bonus ile birlikte maaş :"+(this.salary+this.bonus()-this.tax()));
           System.out.println("Toplam Maaş :"+(this.salary+this.raiseSalary()));
        }
    }
*/