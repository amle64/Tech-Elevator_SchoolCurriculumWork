package com.techelevator;

public class CheckingAccount extends BankAccount {

    private static int overDraftLimit = -100;
    private static int overDraftFee = 10;

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance){
        super(accountHolderName, accountNumber, balance);
    }
    @Override
    public int withdraw(int amountToWithdraw){
        //Adjust behavior of initial method
        if(amountToWithdraw>0){

            //Calculate new balance to check for overdraft situations
            int newBalance = getBalance()-amountToWithdraw;

            //Calculate overdraft fee to be utilized
            if (newBalance>overDraftLimit&&newBalance<0){
                super.withdraw(amountToWithdraw);
                super.withdraw(overDraftFee);
                //return getBalance();


            //Return balance since the withdraw has been denied since it is equal to -100 or less than -100 for balance
            } else if (newBalance<=overDraftLimit){
                return getBalance();

            //Return balance that is no overdraft fee
            } else {
                super.withdraw(amountToWithdraw);

            }


        }
        return getBalance();

    }
}
