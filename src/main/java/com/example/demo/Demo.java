package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();


        driver.get("https://www.google.com");


        System.out.println("Page Title: " + driver.getTitle());

       // driver.quit();
    }
}
