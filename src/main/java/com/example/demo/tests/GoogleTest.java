package com.example.demo.tests;

import com.example.demo.base.BaseTest;
import com.example.demo.pages.GoogleHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {
	 private WebDriver driver;
	 private GoogleHomePage homePage;

	 @BeforeClass
	    public void setUp() {
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        homePage = new GoogleHomePage(driver);
	    }
	 @Test
	    public void testVisitEnterpriseHub() {
	        homePage.open();  
	        homePage.clickVisitEnterpriseHub();  
	        String title = homePage.getPageTitle();  
	        System.out.println("Page Title after clicking: " + title);
	    }
}
