package com.demo.step_definitions;

import com.demo.page.Fizz_buzz_page;
import com.demo.page.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class Fizz_buzz_step_definitions {

   Login login = new Login();


   Fizz_buzz_page fizz_buzz_page = new Fizz_buzz_page();


    @Given("user is on {string} page.")
    public void user_is_on_page(String string) {

     login.login();
    }

    @When("user enters a number divisible by {int}")
    public void user_enters_a_number_divisible_by(Integer int1) {
         fizz_buzz_page.enterDivisibleNum3();
    }

    @Then("user should able to see Fizz")
    public void user_should_able_to_see_fizz() {
      fizz_buzz_page.seeFizz();

    }

 @When("user enters another number divisible by {int}")
 public void user_enters_another_number_divisible_by(Integer int1) {
  fizz_buzz_page.enterDivisibleNum5();
 }

    @Then("user should able to see Buzz")
    public void user_should_able_to_see_buzz() {
     fizz_buzz_page.seeBuzz();

    }

    @When("user enters a number divisible by {int} and {int}")
    public void user_enters_a_number_divisible_by_and(Integer int1, Integer int2) {
    fizz_buzz_page.enterDivisibleNums35();
    }

    @Then("user should able to see FizzBuzz")
    public void user_should_able_to_see_fizz_buzz() {
    fizz_buzz_page.seeFizzBuzz();
    }
}
