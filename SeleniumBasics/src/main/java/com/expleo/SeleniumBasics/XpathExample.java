package com.expleo.SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html#google_vignette");
		
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),\"Sign in into account\")]"));
		
		driver.close();
	}

}
