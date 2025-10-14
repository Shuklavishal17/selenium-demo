package com.orangehrm.tests;

import com.orangehrm.base.BaseTest;
import com.orangehrm.pages.DashboardPage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.pages.MyInfoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileImageUploadTest extends BaseTest {

    @Test
    public void testProfileImageUpload() {

        // 1️⃣ Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(config.getProperty("username"), config.getProperty("password"));

        // 2️⃣ Navigate to My Info
        DashboardPage dashboard = new DashboardPage(driver);
        dashboard.openMyInfo();

        // 3️⃣ Verify Personal Details page
        Assert.assertTrue(driver.getCurrentUrl().contains("viewPersonalDetails"),
                "❌ Personal Details page did not open!");

        // 4️⃣ Click Profile Image
        MyInfoPage myInfoPage = new MyInfoPage(driver);
        myInfoPage.clickProfileImage();

        // 5️⃣ Verify Photograph Upload page
        Assert.assertTrue(myInfoPage.isPhotographPageOpened(),
                "❌ Photograph Upload page did not open!");

        // 6️⃣ Upload local image
        String imagePath = "C:\\Users\\visha\\eclipse-workspace\\photo.jpg"; // <-- your local path here
        myInfoPage.uploadProfileImage(imagePath);

        System.out.println("✅ Profile image uploaded successfully!");
    }
}
