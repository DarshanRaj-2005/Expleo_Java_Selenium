package com.expleo.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingDriverCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String url = "https://antigravityai.io/";
		driver.get(url);
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		System.out.println("TItle length: "+title.length());
		
		System.out.println("Current Url: "+driver.getCurrentUrl());
		String pageSource = driver.getPageSource();
//		System.out.println("PageSource: "+pageSource);
		System.out.println("PageSource Length: "+pageSource.length());
		
		driver.quit();
	}

}
