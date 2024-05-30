package com.techelevator;

public class SavingsAccount extends BankAccount{

    private int serviceCharge = 2;
    public SavingsAccount(String accountHolderName, String accountNumber){
        super(accountHolderName,accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int withdrawAmount){
        if(withdrawAmount>0){
            //Check if newBalance after withdrawAmount
            int newBalance = getBalance()-withdrawAmount;

            //Check for less than 150 to trigger servicecharge
            if(newBalance<150){
                newBalance -= serviceCharge;

                //If New balance is not negative, transactions are requested
                if(newBalance>=0){
                    super.withdraw(withdrawAmount);
                    super.withdraw(serviceCharge);
                }
                //If newBalance is negative after service charge, cancel transaction
                else {
                    return getBalance();
                }

            }
            //Normal transactions with no service charges
            else {
                super.withdraw(withdrawAmount);
            }

        }
        return getBalance();
    }
}
