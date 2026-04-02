package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"post-body-299858861183690484\"]/div/form/div[1]/input[1]"));
		firstName.sendKeys("selenium",Keys.ENTER);
		
		WebElement belowfirstName = driver.findElement(with(By.tagName("input")).below(firstName));
		
		driver.close();
	}
}
