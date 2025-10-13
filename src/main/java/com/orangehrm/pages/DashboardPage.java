package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;

    private By myInfoTab = By.xpath("//span[text()='My Info']");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openMyInfo() {
        driver.findElement(myInfoTab).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
