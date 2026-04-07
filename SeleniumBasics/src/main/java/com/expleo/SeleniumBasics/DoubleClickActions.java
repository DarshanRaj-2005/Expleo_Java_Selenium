package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions act = new Actions(driver);
		WebElement doubleclickButton = driver.findElement(By.xpath("//*[@id=\"HTML46\"]/div[1]/button"));
		act.doubleClick(doubleclickButton).perform();

	}

}
