package com.techelevator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*BankAccount account1 = new BankAccount("A100",10000);
        BankAccount account2 = new BankAccount("A100", 20000);
        *//*System.out.println(account1.transferFunds(account2,30));
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());*//*

        CreditCardAccount account3 = new CreditCardAccount("A100","2001");
        SavingsAccount account4 = new SavingsAccount("A100",10000);

        BankCustomer testing = new BankCustomer();

        System.out.println();*/

        BankAccount account1 = new BankAccount("A100", 10000);
        BankAccount account2 = new BankAccount("A101", 15000);
        BankAccount account3 = new BankAccount("A102", 5000);

        BankCustomer customer = new BankCustomer();
        customer.addAccount(account1);
        customer.addAccount(account2);
        customer.addAccount(account3);

        for(Accountable account: customer.getAccounts()){
            System.out.println(account.getBalance());
        }
        System.out.println("Is VIP: " + customer.isVip());


    }
}
