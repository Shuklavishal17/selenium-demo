package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;

public class MyInfoPage {
    private WebDriver driver;

    public MyInfoPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
}
