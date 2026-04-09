package com.expleo.SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		String domain = jse.executeScript("return document.domain").toString();
		System.out.println("Domain: "+ domain);
		
		String url = jse.executeScript("return document.URL").toString();
		System.out.println("URL: "+url);
	}

}
