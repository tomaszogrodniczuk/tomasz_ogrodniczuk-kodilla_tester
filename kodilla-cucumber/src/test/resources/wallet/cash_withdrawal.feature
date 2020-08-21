Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then Balance after withdrawal is $170

  Scenario: Unsuccessful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $300
    Then Request rejected, balance after withdrawal is $200