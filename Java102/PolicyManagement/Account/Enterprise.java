/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

/**
 *
 * @author yusuf
 */
public class Enterprise extends Account {
    private String companyName;

    public Enterprise(User user, String companyName) {
        super(user);
        this.companyName = companyName;
    }

    @Override
    public void addInsurance(Insurance insurance) {
        // Apply enterprise pricing and margin calculation
        double price = insurance.getPrice() * 1.1;
        insurance.setPrice(price);
        super.insurances.add(insurance);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
