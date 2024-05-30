package com.techelevator;

public class Main {
    public static void main(String[] args) {
        CheckingAccount account1 = new CheckingAccount("Andrew","100",100);
       //System.out.println(account1.withdraw(22));
        /*System.out.println(account1.getBalance());
        System.out.println(account1.withdraw(101));
        System.out.println(account1.getBalance());*/

        SavingsAccount account2 = new SavingsAccount("Andrew","100",200);

        System.out.println(account2.withdraw(25));
    }
}
