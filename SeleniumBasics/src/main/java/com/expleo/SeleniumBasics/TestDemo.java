package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestDemo {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("selenium",Keys.ENTER);
		System.out.println("Page title is: " + driver.getTitle());
		driver.quit();
	}
}
