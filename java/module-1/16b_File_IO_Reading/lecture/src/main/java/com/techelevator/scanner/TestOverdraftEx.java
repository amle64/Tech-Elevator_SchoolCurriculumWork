package com.techelevator.scanner;

import com.techelevator.exceptions.OverdraftException;

public class TestOverdraftEx {

    public static void main(String[] args) {
        /* The withdraw method can throw a checked exception (i.e. OverdraftException) so we need to catch it since
         * the main method does not declare that it throws any exceptions. */
        double currentBalance = 250;
        double amountToWithdraw = 300;
        try {
            double newBalance = withdraw(currentBalance, amountToWithdraw);
            System.out.println("new balance is "+newBalance);
        } catch (OverdraftException2 e) {
            System.out.println("Unfortunately, you can't withdraw more money than you have in the bank...");
            System.out.println("The requested amount would overdraw the account by "+e.getOverdraftAmount2());
        }
        System.out.println();
    }

    public static double withdraw(double currentBalance, double amountToWithdraw) throws OverdraftException2 {
        double newBalance;
        if (amountToWithdraw <= currentBalance) {
            newBalance = currentBalance - amountToWithdraw;
        } else {
            throw new OverdraftException2("The requested withdrawal amount is greater than the current balance", Math.abs(currentBalance - amountToWithdraw));
        }
        return newBalance;
    }
}
