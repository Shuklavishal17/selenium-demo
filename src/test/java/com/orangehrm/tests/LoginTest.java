package com.orangehrm.tests;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginAndMyInfoNavigation() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboard = new DashboardPage(driver);
        MyInfoPage myInfoPage = new MyInfoPage(driver);

        // ✅ Use config from BaseTest (already initialized)
        String username = config.getProperty("username");
        String password = config.getProperty("password");

        // Login
        loginPage.login(username, password);
        Thread.sleep(2000);

        // Click My Info
        dashboard.openMyInfo();
        Thread.sleep(2000);

        // Validate URL
        Assert.assertTrue(myInfoPage.getCurrentUrl().contains("viewPersonalDetails"),
                "❌ My Info page not opened!");
        System.out.println("✅ My Info Page Opened Successfully!");
    }
}
