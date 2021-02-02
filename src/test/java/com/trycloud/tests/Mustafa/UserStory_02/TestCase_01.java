package com.trycloud.tests.Mustafa.UserStory_02;

import com.trycloud.Base.US_1_TestCase_1.LoginToTryCloud;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import javax.swing.*;
import java.util.*;

public class TestCase_01 extends LoginToTryCloud {

    @Test
    public void verify_users_access_to_the_main_modules() throws RuntimeException, InterruptedException {

        WebElement Files = driver.findElement(By.xpath("//ul[@id='appmenu']/li[1]"));
        WebElement Photos = driver.findElement(By.xpath("//ul[@id='appmenu']/li[2]"));
        WebElement Activity = driver.findElement(By.xpath("//ul[@id='appmenu']/li[3]"));
        WebElement Talk = driver.findElement(By.xpath("//ul[@id='appmenu']/li[4]"));
        WebElement Contacts = driver.findElement(By.xpath("//ul[@id='appmenu']/li[5]"));
        WebElement Calendar = driver.findElement(By.xpath("//ul[@id='appmenu']/li[6]"));
        WebElement Notes = driver.findElement(By.xpath("//ul[@id='appmenu']/li[7]"));

        Actions action = new Actions(driver);
        SoftAssert softAssert = new SoftAssert();

        //Files
        action.moveToElement(Files).build().perform();
        Thread.sleep(2000);
        String actualModule_1 = Files.getText();
        String expectedModule_1 = "Files";
        Assert.assertEquals(actualModule_1, expectedModule_1, "Module 1 DIDN'T MATCHED, FAILED ! ! !");

        //Galleries
        action.moveToElement(Photos).build().perform();
        Thread.sleep(2000);
        String actualModule_2 = Photos.getText();
        String expectedModule_2 = "Galleries";
        Assert.assertEquals((actualModule_2),expectedModule_2,"Module 2 DIDN'T MATCHED, FAILED ! ! !");
        

        //Activity
        action.moveToElement(Activity).build().perform();
        Thread.sleep(2000);
        String actualModule_3 = Activity.getText();
        String expectedModule_3 = "Activity";
        Assert.assertEquals(actualModule_3,expectedModule_3,"Module 3 DIDN'T MATCHED, FAILED ! ! !");

        //Talk
        action.moveToElement(Talk).build().perform();
        Thread.sleep(2000);
        String actualModule_4 = Talk.getText();
        String expectedModule_4 = "Talk";
        Assert.assertEquals(actualModule_4,expectedModule_4,"Module 4 DIDN'T MATCHED, FAILED ! ! !");

        //Contacts
        action.moveToElement(Contacts).build().perform();
        Thread.sleep(2000);
        String actualModule_5 = Contacts.getText();
        String expectedModule_5 = "Contacts";
        Assert.assertEquals(actualModule_5,expectedModule_5,"Module 5 DIDN'T MATCHED, FAILED ! ! !");

        //Calendar
        action.moveToElement(Calendar).build().perform();
        Thread.sleep(2000);
        String actualModule_6 = Calendar.getText();
        String expectedModule_6 = "Calendar";
        Assert.assertEquals(actualModule_6,expectedModule_6,"Module 6 DIDN'T MATCHED, FAILED ! ! !");

        //Notes
        action.moveToElement(Notes).build().perform();
        Thread.sleep(2000);
        String actualModule_7 = Notes.getText();
        String expectedModule_7 = "Note";
        Assert.assertEquals(actualModule_7,expectedModule_7,"Module 7 DIDN'T MATCHED, FAILED ! ! !");

        softAssert.assertAll();

    }


}
