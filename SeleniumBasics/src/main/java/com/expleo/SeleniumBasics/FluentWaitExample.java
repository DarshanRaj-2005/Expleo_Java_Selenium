package com.expleo.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


public class FluentWaitExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		driver.manage().window().maximize();

		WebElement button = driver.findElement(By.id("reveal"));
		button.click();
		
		WebElement inputBox = driver.findElement(By.id("revealed"));
		

		Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofMillis(300)).ignoring(ElementNotInteractableException.class);

		wait.until(d -> {
			inputBox.sendKeys("Displayed");
			return true;
		});
	}

}
