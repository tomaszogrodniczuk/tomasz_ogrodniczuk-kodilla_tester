package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
        });

        When("I request $30", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30, cashSlot.getContents());
        });

        Then("Balance after withdrawal is $170", () -> {
            Assert.assertEquals(170, wallet.getBalance());
        });

        When("I request $300", () -> {
            Teller teller = new Teller(cashSlot);
            teller.withdraw(wallet, 300);
        });

        Then("Request rejected, balance after withdrawal is $200", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
            Assert.assertEquals(200, wallet.getBalance());
        });
    }
}