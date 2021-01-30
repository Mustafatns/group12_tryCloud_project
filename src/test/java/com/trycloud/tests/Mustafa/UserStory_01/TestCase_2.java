package com.trycloud.tests.Mustafa.UserStory_01;

import com.trycloud.Base.US_1_TestCase_1.LoginToTryCloud;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase_2 {

    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfigurationReader.getProperty("trycloudurl"));
    }

    @Test
    public void verify_user_cannot_login_with_invalid_credentials() throws InterruptedException {

        //Test case #2 - verify user cannot login with invalid credentials
        //1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
        //2. Enter valid username invalid password
        //3. Click login button
        //4. Message “Invalid user name or password.” should be displayed
        //5. Page title and url should be same

        Thread.sleep(1000);
        // Entering username = "User12"
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='user']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));

        Thread.sleep(1000);
        // Enter password = "Userpass123"
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("InvalidPassword");

        Thread.sleep(1000);
        //Clicking the login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        WebElement invalidMessage = driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']"));

        invalidMessage.isDisplayed();


        String pageTitle = driver.getTitle();
        String expectedTitle = "Trycloud - QA";

        if (pageTitle.contains(expectedTitle)){
            System.out.println("Page Title PASSED");
        }else{
            System.err.println("Page Title FAILED");
        }


        String pageUrl = driver.getCurrentUrl();
        String expectedPageUrl ="http://qa.trycloud.net/index.php/login";

        if (pageUrl.contains(expectedPageUrl)){
            System.out.println("Page Url Matched. PASSED");
        }else{
            System.err.println("Page Url DOESN'T Matched. FAILED");
        }

    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }




}
