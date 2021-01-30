package com.trycloud.tests.Saltanat;

import com.trycloud.Base.TestBase;
import org.testng.annotations.Test;
import com.trycloud.utilities.WebOrderUtil;

public class UserStory6_TestCase1 extends TestBase {
   @Test
   public void verify_users_can_access_to_Talks_module(){
      // 1.Login as a user
       WebOrderUtil.loginToTryCloud(driver);

       // 2.Click “Notes” module

       // 3.Verify the page tile/URL is Notes module’s tile
   }

}
