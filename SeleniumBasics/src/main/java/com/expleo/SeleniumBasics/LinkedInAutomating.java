package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedInAutomating {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.linkedin.com/feed/");
		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.cssSelector("input#username"));
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		WebElement signinButton = driver.findElement(By.cssSelector("button[type='submit']"));
		password.sendKeys("kiot12345", Keys.ENTER);
		email.sendKeys("2k22cse021@kiot.ac.in", Keys.ENTER);
		signinButton.click();
	}

}
