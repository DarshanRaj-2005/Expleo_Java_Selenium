package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsingSynchronizationExample1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdown = driver.findElement(By.cssSelector("button.dropbtn"));
		dropdown.click();
		
		WebElement choice = driver.findElement(By.xpath("//div[contains(@id,'myDropdown')]/child::a[1]"));
		choice.click();
		
		driver.close();
	}

}
