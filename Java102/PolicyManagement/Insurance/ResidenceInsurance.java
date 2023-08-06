/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.time.LocalDate;

/**
 *
 * @author yusuf
 */
public class ResidenceInsurance extends Insurance {
     private double buildingValue;
    private double contentValue;

    public ResidenceInsurance(double buildingValue, double contentValue) {
        super("Residence Insurance", 980, LocalDate.now(), LocalDate.now().plusMonths(4));
        this.buildingValue = buildingValue;
        this.contentValue = contentValue;
    }

    public double getBuildingValue() {
        return buildingValue;
    }

    public void setBuildingValue(double buildingValue) {
        this.buildingValue = buildingValue;
    }

    public double getContentValue() {
        return contentValue;
    }

    public void setContentValue(double contentValue) {
        this.contentValue = contentValue;
    }

    @Override
    public void calculate() {
        double basePrice = getPrice();
        double buildingValue = getBuildingValue();
        double contentValue = getContentValue();
        // calculate the premium based on the base price, building value, and content
        // value
        double premium = basePrice + (buildingValue * 0.002) + (contentValue * 0.001);
        setPrice(premium);
    }

    @Override
    public String toString() {
        return "ResidenceInsurance [name=" + getName() + ", price=" + getPrice() + ", startDate=" + getStartDate()
                + ", endDate=" + getEndDate() + ", buildingValue=" + buildingValue + ", contentValue=" + contentValue
                + "]";
    }
}
