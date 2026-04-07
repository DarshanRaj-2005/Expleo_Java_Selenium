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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0ytpmso6nmojkp2icqlotefv114506739.node0");

		WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/span"));
		clickButton.click();
		
		WebElement iAmHereButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("j_idt87:j_idt89")));
		
		String bgcolor = iAmHereButton.getCssValue("background-color");
		System.out.println("The BackGround Color: "+bgcolor);
		
		WebElement clickButton2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt98\"]"));
		WebElement changingButton = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt99\"]"));
		System.out.println("Before the Button Changing: "+changingButton.getText());
		clickButton2.click();
		wait.until(ExpectedConditions.textToBePresentInElementValue(changingButton,"Did you notice?"));
		System.out.println("After the Button Changing: "+changingButton.getText());
	}

}
