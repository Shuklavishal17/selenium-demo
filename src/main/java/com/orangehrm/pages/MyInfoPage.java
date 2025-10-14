package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyInfoPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By profileImage = By.xpath("//img[contains(@class,'employee-image')]");
    private By uploadButton = By.xpath("//button[contains(@class,'employee-image-action')]"); // (+) button
    private By fileInput = By.xpath("//input[@type='file']"); // hidden file input
    private By saveButton = By.xpath("//button[contains(@class,'oxd-button--secondary')]"); // Save button

    public MyInfoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Click profile image to open photograph page
    public void clickProfileImage() {
        wait.until(ExpectedConditions.elementToBeClickable(profileImage)).click();
    }

    // Verify photograph page opened
    public boolean isPhotographPageOpened() {
        return driver.getCurrentUrl().contains("viewPhotograph") &&
               wait.until(ExpectedConditions.visibilityOfElementLocated(uploadButton)).isDisplayed();
    }

    // Upload image and click Save
    public void uploadProfileImage(String imagePath) {
        // 1️⃣ Click (+) button
        wait.until(ExpectedConditions.elementToBeClickable(uploadButton)).click();

        // 2️⃣ Send file path to hidden input
        driver.findElement(fileInput).sendKeys(imagePath);

        // 3️⃣ Click Save button
        wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
    }
}
