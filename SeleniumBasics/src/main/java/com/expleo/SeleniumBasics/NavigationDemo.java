package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().minimize();
		driver.navigate().to("https://www.amazon.com");
		
		WebElement element = driver.findElement(By.name("q"));		
		Thread.sleep(5000);
		driver.navigate().to("https://www.smartcliff.in");
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(5000);
		driver.navigate().forward();
		
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		driver.quit();
	}
}
