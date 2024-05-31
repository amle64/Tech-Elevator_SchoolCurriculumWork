package com.techelevator;


import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String name;

    private String address;

    private String phoneNumber;

    private List<Accountable> accounts;

    private boolean VIPStatus;

    public BankCustomer(){
        this.accounts = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Accountable[] getAccounts(){
        return accounts.toArray(new Accountable[0]);
    }

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);

    }

    public boolean isVip(){

        int totalSum = 0;

        for (Accountable account: accounts){
            totalSum += account.getBalance();
        }
        if(totalSum>=25000){
            return VIPStatus=true;
        }
        return VIPStatus=false;
    }
}
