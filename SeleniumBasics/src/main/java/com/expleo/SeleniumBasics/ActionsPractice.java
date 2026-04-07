package com.expleo.SeleniumBasics;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionsPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement blogspotMenu = driver.findElement(By.id("blogsmenu"));
		
		Actions act = new Actions(driver);
		act.moveToElement(blogspotMenu).perform();
		
		WebElement option2 = driver.findElement(By.xpath("//*[@id=\"cssmenu\"]/ul/li[2]/ul/li[2]/a"));
		act.moveToElement(option2).click().build().perform();

	}

}
