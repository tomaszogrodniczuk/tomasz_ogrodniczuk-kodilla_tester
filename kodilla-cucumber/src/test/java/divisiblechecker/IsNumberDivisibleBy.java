package divisiblechecker;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleBy implements En {
    private int number;
    private String result;

    public IsNumberDivisibleBy () {
        Given("{int} is divisible by three or five", (Integer int1) -> {
            this.number = int1;
        });

        When("I ask whether number is divisible", () -> {
            DivisibleChecker divisibleChecker = new DivisibleChecker();
            this.result = divisibleChecker.checkIfDivisible(this.number);
        });

        Then("Answer is {string}", (String string) -> {
            Assert.assertEquals(string, this.result);
        });
    }
}
