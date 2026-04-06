package com.expleo.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

		WebElement button = driver.findElement(By.id("reveal"));
		button.click();

		WebElement inputBox = driver.findElement(By.id("revealed"));
		wait.until(ExpectedConditions.visibilityOf(inputBox));
		inputBox.sendKeys("Hello");
	}

}
