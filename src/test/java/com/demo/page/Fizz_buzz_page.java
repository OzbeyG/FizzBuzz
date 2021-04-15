package com.demo.page;

import com.demo.utils.Driver;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Fizz_buzz_page {

WebDriverWait wait = new WebDriverWait(Driver.getDriver(),15);
Faker faker = new Faker();



    @FindBy(id = "input")
    private WebElement boxInput;

    @FindBy(xpath = "//span[.='Enter']")
    private WebElement enterBtn;

    @FindBy(xpath = "//span[.='Clear']")
      private WebElement clearBtn;

     @FindBy(id = "result")
    private WebElement resultInput;

     public Fizz_buzz_page(){PageFactory.initElements(Driver.getDriver(),this);}


      public void enterDivisibleNum3(){
         long l = 0;
         long i =  faker.number().randomNumber();
         for (int j = 0; j <= i; j ++){
             if ( j % 3 == 0)
                 l = j;
         }





          boxInput.sendKeys(String.valueOf(l));
          System.out.println("Entered number: "+ l);

      }

      public void seeFizz(){

           enterBtn.click();
          wait.until(ExpectedConditions.visibilityOf(resultInput));
           String fizzExpected = resultInput.getText();
          System.out.println("Fizz result: "+fizzExpected);

      }


      public void enterDivisibleNum5(){

         long i2 = 0;
        long l2 = faker.number().randomNumber();
        for (int j = 0; j <= l2; j ++){
            if(j % 5 == 0)
                i2 = j;
        }



          clearBtn.click();
          boxInput.sendKeys(String.valueOf(i2));
          System.out.println("Entered number: "+ i2);
      }



        public void seeBuzz (){

          enterBtn.click();
            wait.until(ExpectedConditions.visibilityOf(resultInput));
          String buzzExpected = resultInput.getText();
            System.out.println("Buzz result: " + buzzExpected);


        }


        public  void  enterDivisibleNums35(){

          long i3 = 0;
         long l3 = faker.number().randomNumber();
         for (int j = 0; j <= l3; j ++){
             if (j % 5 == 0 && j % 3 == 0)
                 i3 = j;
         }


            clearBtn.click();
               boxInput.sendKeys(String.valueOf(i3));
            System.out.println("Entered number: "+ i3);
        }

        public void seeFizzBuzz(){

            enterBtn.click();
            wait.until(ExpectedConditions.visibilityOf(resultInput));
            String fizzBuzzExpected = resultInput.getText();
            System.out.println("FizzBuzz result: "+fizzBuzzExpected);

        }



}
