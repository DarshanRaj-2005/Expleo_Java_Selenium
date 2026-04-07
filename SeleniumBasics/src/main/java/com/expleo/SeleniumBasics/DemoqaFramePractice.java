package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaFramePractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		
		WebElement heading = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(0);
		WebElement heading1 = driver.findElement(By.id("sampleHeading"));
		System.out.println(heading1.getText());
	}

}
