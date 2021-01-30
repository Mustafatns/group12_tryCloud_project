package com.trycloud.Base.US_1_TestCase_1;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class LoginToTryCloud {

    public WebDriver driver;

    @BeforeMethod
    public void loginToTryCloud() throws InterruptedException {

        //Test case #1 - verify user login successfully
        //1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
        //2. Enter valid username
        //3. Enter valid password
        //4. Click login button
        //5. Verify the URL is chawed to homepage’s url
        //(Put this test case in testBase class with an annotation so it runs for all the test case)

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(ConfigurationReader.getProperty("trycloudurl"));

        Thread.sleep(1000);

        // Entering username = "User12"
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='user']"));
        inputUsername.sendKeys(ConfigurationReader.getProperty("username1"));

        Thread.sleep(1000);
        // Enter password = "Userpass123"
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        Thread.sleep(1000);
        //Clicking the login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        String actualHomePageUrl = driver.getCurrentUrl();
        String expectedHomePageUrl = "http://qa.trycloud.net/index.php/apps/files/";

        Assert.assertEquals(actualHomePageUrl,expectedHomePageUrl,"HomePage Url Doesn't Match. FAILED");


    }

    @AfterMethod
    public void tearDownMethod() {
        driver.close();
    }


}
