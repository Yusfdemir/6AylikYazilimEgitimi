/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.ArrayList;

/**
 *
 * @author yusuf
 */
public abstract class Account implements Comparable<Account> {
    private AuthenticationStatus authenticationStatus;
    private User user;
    protected ArrayList<Insurance> insurances;

    public enum AuthenticationStatus {
        SUCCESS, FAIL
    }

    public Account(User user) {
        this.user = user;
        this.authenticationStatus = AuthenticationStatus.FAIL;
        this.insurances = new ArrayList<>();
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
            this.authenticationStatus = AuthenticationStatus.SUCCESS;
        } else {
            throw new InvalidAuthenticationException("Invalid email or password");
        }
    }

    public void addAddress(Adress address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            user.addAddress(address);
        }
    }

    public void removeAddress(Adress address) {
        if (authenticationStatus == AuthenticationStatus.SUCCESS) {
            user.removeAddress(address);
        }
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public abstract void addInsurance(Insurance insurance);

    public final void showUserInfo() {
        System.out.println("------------------------------------------");
        System.out.println("Name: " + user.getFname());
        System.out.println("Surname: " + user.getLname());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Profession: " + user.getJob());
        System.out.println("Age: " + user.getAge());
        user.updateDate();
        System.out.println("Last login date: " + user.getDate());
        if (this instanceof Enterprise) {
            System.out.println("Company Name: " + ((Enterprise) this).getCompanyName());
        }
        System.out.println("Addresses: ");
        System.out.println("------------------------------------------");
        for (Adress address : user.getAdressList()) {
            System.out.println(address);
        }
        System.out.println("Insurances: ");
        System.out.println("------------------------------------------");
        for (Insurance insurance : insurances) {
            System.out.println(insurance);
        }
        System.out.println("------------------------------------------");
    }

    @Override
    public int compareTo(Account other) {
        // you can compare accounts based on the email
        return this.user.getEmail().compareTo(other.user.getEmail());
    }

    @Override
    public int hashCode() {
        // you can use the email as the basis for the hash code
        return user.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Account)) {
            return false;
        }
        Account other = (Account) obj;
        // you can check if two accounts are equal based on the email
        return this.user.getEmail().equals(other.user.getEmail());
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(ArrayList<Insurance> insurances) {
        this.insurances = insurances;
    }
}
