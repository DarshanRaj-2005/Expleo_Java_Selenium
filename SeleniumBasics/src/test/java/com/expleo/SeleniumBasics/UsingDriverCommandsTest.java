package com.expleo.SeleniumBasics;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UsingDriverCommandsTest {

    @Test
    void runTest() {

        // Headless setup
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");   // modern headless
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(options);

        String url = "https://antigravityai.io/";
        driver.get(url);

        String title = driver.getTitle();
        System.out.println("Title: " + title);
        System.out.println("Title length: " + title.length());

        System.out.println("Current Url: " + driver.getCurrentUrl());

        String pageSource = driver.getPageSource();
        System.out.println("PageSource Length: " + pageSource.length());

        driver.quit();
    }
}