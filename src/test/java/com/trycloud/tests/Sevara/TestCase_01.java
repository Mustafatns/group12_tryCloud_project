package com.trycloud.tests.Sevara;

import com.trycloud.Base.US_1_TestCase_1.LoginToTryCloud;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase_01 extends LoginToTryCloud {
   // public static void main(String[] args) {


        @Test
        public void verify_users_access_to_the_main_modules() throws RuntimeException, InterruptedException {

   // WebDriverManager.chromedriver().setup();
  //  WebDriver driver = new ChromeDriver();
  //  driver.get("http://qa.trycloud.net/index.php/login?clear=1");
   // driver.manage().window().maximize();
      //  WebElement emailInputBox = driver.findElement(By.cssSelector("input[type='password']"));
      //  driver.findElement(By.linkText("input")).click();

      //  WebElement checkbox1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
       // checkbox1.click();


       // Select select = new Select("password");
        //WebElement currentlySelectedOption = select.getFirstSelectedOption();

        WebElement resultText = driver.findElement(By.id("result"));

        String actualText = resultText.getText();
        String expectedText = "You successfuly clicked an alert";

        Assert.assertTrue(resultText.isDisplayed());
        Assert.assertEquals(actualText, expectedText);
    }}
//5.Story: As a user, I should be able to access to Contacts module

//Test case #1 - verify users can access to Talks module
//1.Login as a use
//2.Click “Contacts” module
//3.Verify the page tile is Contents module’s tile
