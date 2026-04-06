package com.expleo.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		WebElement addbox = driver.findElement(By.cssSelector("input#adder"));
		addbox.click();

		WebElement redbox = driver.findElement(By.cssSelector("div.redbox"));
		
		String css = redbox.getCssValue("width");
		System.out.println("Width of the Box: "+css);
		
		driver.close();
		
	}

}
