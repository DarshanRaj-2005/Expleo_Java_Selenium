package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class DemoBlazePractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.get("https://demoblaze.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login2\"]"));
		loginButton.click();
		
		WebElement userName = driver.findElement(By.id("loginusername"));
		userName.sendKeys("DarshanRaj",Keys.ENTER);
		
		WebElement password = driver.findElement(By.id("loginpassword"));
		password.sendKeys("dharshan123",Keys.ENTER);
		
		WebElement Button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
		Button.click();
		
	}

}
