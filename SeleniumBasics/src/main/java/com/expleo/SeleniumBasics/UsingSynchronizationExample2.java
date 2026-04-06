package com.expleo.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSynchronizationExample2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://omayo.blogspot.com/");

		WebElement dropdown = driver.findElement(By.cssSelector("button.dropbtn"));
		dropdown.click();
		
		WebElement choice = driver.findElement(By.xpath("//div[contains(@id,'myDropdown')]/child::a[1]"));
		choice.click();
		
		String url = "https://facebook.com/";
		
		if(driver.getCurrentUrl().equals(url)) {
			System.out.println("Facebook Loaded Successfully");
		}
		else {
			System.out.println("Facebook didn't Loaded");
		}

		driver.close();
	}

}
