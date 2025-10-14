package com.orangehrm.tests;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileImageClickTest extends BaseTest {

    @Test
    public void testProfileImageClick() {

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(config.getProperty("username"), config.getProperty("password"));

        // Navigate to My Info
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.openMyInfo();

        // Click Profile Image
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.clickProfileImage();

        // Verify Photograph Upload page
        Assert.assertTrue(myInfoPage.isPhotographPageOpened(),
                "❌ Photograph Upload page did not open!");

        System.out.println("✅ Profile Image click test passed!");
    }
}
