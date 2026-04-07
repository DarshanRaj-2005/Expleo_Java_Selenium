package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragByActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		Actions act = new Actions(driver);
		WebElement dragButton = driver.findElement(By.xpath("//*[@id=\"form:conpnl\"]"));
		act.dragAndDropBy(dragButton,300,0).perform();
	}

}
