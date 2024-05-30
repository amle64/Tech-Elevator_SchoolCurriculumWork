package com.techelevator;

public class CreditCardAccount implements Accountable{

    private String accountHolderName;

    private String cardNumber;

    private int debt=0;

    //Getters
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getDebt() {
        return debt;
    }


    //Constructor
    public CreditCardAccount(String accountHolderName,String cardNumber){
        this.accountHolderName = accountHolderName;
        this.cardNumber = cardNumber;

    }
    @Override
    public int pay(int amountToPay){
        if(amountToPay>0){
            debt -= amountToPay;

        }

        return debt;
    }
    @Override
    public int charge(int amountToCharge){
        if(amountToCharge>0){
            debt += amountToCharge;
        }
        return debt;
    }

    @Override
    public int getBalance() {

        return -debt;
    }


}
