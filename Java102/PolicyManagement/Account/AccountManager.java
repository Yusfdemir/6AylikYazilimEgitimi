/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import java.util.TreeSet;
import javaapplication.Account.AuthenticationStatus;
/**
 *
 * @author yusuf
 */
public class AccountManager {
   private TreeSet<Account> accountList;

    public AccountManager() {
        accountList = new TreeSet<>();
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    public Account login(String email, String password) {
        for (Account account : accountList) {
            try {
                account.login(email, password);
                if (account.getAuthenticationStatus() == authenticationStatus.SUCCESS) {
                    return account;
                }
            } catch (InvalidAuthenticationException e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public TreeSet<Account> getAccountList() {
        return accountList;
    } 

    private static class authenticationStatus {

        private static Account.AuthenticationStatus SUCCESS;

        public authenticationStatus() {
        }
    }
}
