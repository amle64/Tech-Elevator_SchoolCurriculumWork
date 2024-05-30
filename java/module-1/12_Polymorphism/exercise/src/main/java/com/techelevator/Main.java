package com.techelevator;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("A100",100);
        BankAccount account2 = new BankAccount("A101", 20);
        /*System.out.println(account1.transferFunds(account2,30));
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());*/

        CreditCardAccount account3 = new CreditCardAccount("A102","2001");
        SavingsAccount account4 = new SavingsAccount("A103",100);

        //BankAccount testing = new


    }
}
