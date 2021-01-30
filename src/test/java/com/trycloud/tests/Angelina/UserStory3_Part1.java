package com.trycloud.tests.Angelina;

import com.trycloud.Base.TestBase;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebOrderUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class UserStory3_Part1  extends TestBase {


    @Test
    public void verify_users_can_access_to_Files_module() {

        // 1.  Login as a user
        WebOrderUtil.loginToTryCloud(driver);

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
}
