
@new_feature
Feature: Welcome to FizzBuzz

  Background: User is on Welcome page
    Given user is on "Welcome to FizzBuzz!" page.

@first
  Scenario: Print Fizz
    When user enters a number divisible by 3
    Then user should able to see Fizz

  Scenario: Print Buzz
    When user enters another number divisible by 5
    Then user should able to see Buzz

  Scenario: Print FizzBuzz
    When user enters a number divisible by 3 and 5
    Then user should able to see FizzBuzz