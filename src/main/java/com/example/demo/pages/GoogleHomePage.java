package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage {
	
	private By visitEnterpriseHub = By.linkText("Visit Enterprise Hub");
    private WebDriver driver;

    public GoogleHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://www.incuspaze.com/");
    }

    public void clickVisitEnterpriseHub() {
        driver.findElement(visitEnterpriseHub).click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
