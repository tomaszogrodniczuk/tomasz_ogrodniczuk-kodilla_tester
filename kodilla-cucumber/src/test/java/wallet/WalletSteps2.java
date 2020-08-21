package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps2 implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private int balance;
    private String answer;

    public WalletSteps2() {
        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I check my balance", () -> {
            this.balance = wallet.getBalance();
        });

        Then("I should see that {string}", (String string1) -> {
            Assert.assertEquals(string1, wallet.showBalance());
        });

        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I withdraw $200", () -> {
            Teller teller = new Teller(cashSlot);
            this.answer = teller.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
            Assert.assertEquals(100, wallet.getBalance());
        });

        Then("I should be told that {string}", (String string1) -> {
            Assert.assertEquals(string1, answer);
        });
    }
}
