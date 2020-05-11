package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;


    public  CashMachine(){
        this.transactions = new int[0];
        this.size = 0;
    }

    public void addTransaction(int amount)
    {
        if ((getBalance() + amount) >= 0){
            this.size++;
            int[] tempTab = new int[size];
            System.arraycopy(transactions, 0, tempTab, 0, transactions.length);
            tempTab[size - 1] = amount;
            this.transactions = tempTab;
        }
    }

    public int[] getTransactions(){
        return transactions;
    }

    public int getBalance(){
        int sum = 0;
        for (int i = 0; i <transactions.length; i++){
            sum = sum + transactions[i];
        }
        return sum;
    }

    public int getNumberOfDeposits(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                count++;
            }
        }
        return count;
    }

    public int getNumberOfWithdrawals(){
        int count = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0){
                count++;
            }
        }
        return count;
    }

    public double getAvgDeposit(){
        if (this.transactions.length == 0){
            return 0;
        }

        if (getNumberOfDeposits() == 0){
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] > 0){
                sum = sum + transactions[i];
            }
        }
        return sum / getNumberOfDeposits();
    }

    public double getAvgWithdrawal(){
        if (this.transactions.length == 0){
            return 0;
        }

        if (getNumberOfWithdrawals() == 0){
            return 0;
        }

        double sum = 0;
        for (int i = 0; i < transactions.length; i++){
            if (transactions[i] < 0){
                sum = sum + transactions[i];
            }
        }
        return (sum / getNumberOfWithdrawals());
    }
}
