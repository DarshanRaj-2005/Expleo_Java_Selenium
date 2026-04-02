package com.expleo.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingDriverCommand2 {

	public static void main(String args[]) {

		WebDriver driver = new EdgeDriver();

		String url = "https://antigravityai.io/";
		driver.get(url);

		String title = driver.getTitle();
		System.out.println("Title: " + title);
		System.out.println("Title length: " + title.length());

		System.out.println("Current Url: " + driver.getCurrentUrl());

		String pageSource = driver.getPageSource();
		System.out.println("PageSource Length: " + pageSource.length());

		driver.quit();
	}

}
