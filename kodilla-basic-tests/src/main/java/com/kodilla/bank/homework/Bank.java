package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] cashMachine;
    private int numberOfDevices;

    public Bank(int numberOfDevices){
        this.numberOfDevices = numberOfDevices;
        this.cashMachine = new CashMachine[numberOfDevices];

        for (int i = 0; i < cashMachine.length; i++) {
            cashMachine[i] = new CashMachine();
        }
    }

    public int getNumberOfDevices(){
        return numberOfDevices;
    }

    public void addTransaction (int deviceID, int amount){
        if (deviceID < cashMachine.length){
            cashMachine[deviceID].addTransaction(amount);
        }
    }

    public int getTotalBalance(){
        int sum = 0;
        for (int i=0; i < cashMachine.length; i++){
            sum = sum + cashMachine[i].getBalance();
        }
        return sum;
    }

    public int getTotalNumberOfDeposits() {
        int sum = 0;
        for (int i=0; i<cashMachine.length; i++){
            sum = sum + cashMachine[i].getNumberOfDeposits();
        }
        return sum;
    }

    public int getTotalNumberOfWithdrawals(){
        int sum = 0;
        for (int i=0; i<cashMachine.length; i++){
            sum = sum + cashMachine[i].getNumberOfWithdrawals();
        }
        return sum;
    }

    public double geTotalAvgDeposits(){
        if (this.cashMachine.length == 0){
            return 0;
        }

        double sum = 0;
        for (int i=0; i<cashMachine.length; i++){
            sum = sum + cashMachine[i].getAvgDeposit();
        }
        return sum / cashMachine.length;
    }


    public double getTotalAvgWithdrawals(){
        if (this.cashMachine.length == 0){
            return 0;
        }

        double sum = 0;
        for (int i=0; i<cashMachine.length; i++){
            sum = sum + cashMachine[i].getAvgWithdrawal();
        }
        return (sum / cashMachine.length) * -1;
    }
}
