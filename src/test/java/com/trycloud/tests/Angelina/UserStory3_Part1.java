package com.trycloud.tests.Angelina;


import com.trycloud.Base.US_1_TestCase_1.LoginToTryCloud;
import com.trycloud.utilities.BrowserUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserStory3_Part1  extends LoginToTryCloud {


    @Test
    public void verify_users_can_access_to_Files_module() {

        // 1.  Login as a user


        //  2. Verify the page tile is Files module’s tile

        WebElement fileModule = driver.findElement(By.xpath("//li[@data-id='files']"));
        if (fileModule.isDisplayed()) {
            System.out.println("Passed!!!!!");
        } else {
            System.out.println("Failed!!!!!");
        }
        fileModule.click();
        BrowserUtils.sleep(1);
        // done with Test case#1

        // create on new branch

    }
    @Test
    public void verify_users_can_select_all_the_uploaded_files_from_the_page(){
        // 1. Login as a user


        WebElement fileModule = driver.findElement(By.xpath("//li[@data-id='files']"));
        fileModule.click();
        BrowserUtils.sleep(3);

        // 2. Click the top left checkbox of the table
        WebElement checkbox = driver.findElement(By.xpath("select_all_files"));
        checkbox.click();
        BrowserUtils.sleep(3);

        // 3. Assert all the files are selected
        Assert.assertTrue(driver.findElement(By.xpath("select_all_files")).isSelected());

    }



          //  (Pre-condition: there should be at least 2 files are uploaded the page)
}
