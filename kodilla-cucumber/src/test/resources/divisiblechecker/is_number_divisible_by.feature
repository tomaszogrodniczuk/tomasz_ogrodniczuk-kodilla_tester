Feature: Is number divisible by ?
  Everybody likes Summer

  Scenario Outline: Number is or isn't divisible
    Given <number> is divisible by three or five
    When I ask whether number is divisible
    Then Answer is <result>
    Examples:
      | number | result |
      | 9 | "Fizz" |
      | 20 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 13 | "None" |