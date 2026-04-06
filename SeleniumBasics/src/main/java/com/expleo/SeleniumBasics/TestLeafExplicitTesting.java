package com.expleo.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestLeafExplicitTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0ytpmso6nmojkp2icqlotefv114506739.node0");
		
		WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span"));
		clickButton.click();
		
		WebElement iAmHere = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt89")));
	}

}
