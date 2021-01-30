package com.trycloud.utilities;

import com.trycloud.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebOrderUtil extends TestBase {

    public static void loginToTryCloud(WebDriver driver){

        driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        // Entering username = "User12"
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='user']"));
        inputUsername.sendKeys("User12");

        // Enter password = "Userpass123"
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='password']"));
        inputPassword.sendKeys("Userpass123");

        //Clicking the login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();



    }


}
