package com.expleo.SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class HYRPracticeUsingJavaScript {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement firstName = (WebElement) jse.executeScript("return document.querySelector(\"input[type='text']\");");

		firstName.sendKeys("Darshan", Keys.ENTER);

		WebElement lastName = (WebElement) jse
				.executeScript("return document.querySelector(\"input[maxlength='15']\");");

		lastName.sendKeys("Raj", Keys.ENTER);

		WebElement email = (WebElement) jse
				.executeScript("return document.querySelector[\"input[fdproceesedid='kuc2yo']\";");

		email.sendKeys("dharshan@gmail.com", Keys.ENTER);

		WebElement password = (WebElement) jse
				.executeScript("retrun document.querySelector[\"input[type='password']\";");

		password.sendKeys("dharshan123");

		WebElement rpassword = (WebElement) jse
				.executeScript("retrun document.querySelector[\"input[fdproceesedid='8z85eh']\";");

		rpassword.sendKeys("dharshan123");
		
		WebElement submit = (WebElement) jse
				.executeScript("retrun document.querySelector[\"button[type='submit']\";");
		
		submit.click();
	}

}
