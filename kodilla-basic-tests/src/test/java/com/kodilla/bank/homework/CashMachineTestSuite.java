package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldCountNumberOfTransactionsEvenIfInvalidTransactionTriedToBeMade(){
        //invalid transaction - trying withdraw money when not enough cash in the cash machine
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(10);
        assertEquals(4, cashMachine.getTransactions().length);
    }

    @Test
    public void shouldCalcBalanceEvenIfInvalidTransactionTriedToBeMade(){
        //invalid transaction - trying withdraw money when not enough cash in the cash machine
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(10);
        assertEquals(60, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfEmpty(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(20);
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-150);
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfNoTransactionsWereMade(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfNoTransactionsWereMade(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0.0, cashMachine.getAvgDeposit() + cashMachine.getAvgWithdrawal(), 0.01);
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfEmpty(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(-20);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-50);
        assertEquals(0,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfNotEnoughMoney(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-20);
        assertEquals(2,cashMachine.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageDepositEqualsZeroIfNoDeposits(){
        CashMachine cashMachine = new CashMachine();
        assertEquals(0.0, cashMachine.getAvgDeposit());
    }

    @Test
    public void shouldReturnAverageWithdrawalEqualsZeroIfNoWithdrawals(){
        CashMachine cashMachine = new CashMachine();
        cashMachine.addTransaction(50);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(20);
        assertEquals(0.0, cashMachine.getAvgWithdrawal());
    }
}
