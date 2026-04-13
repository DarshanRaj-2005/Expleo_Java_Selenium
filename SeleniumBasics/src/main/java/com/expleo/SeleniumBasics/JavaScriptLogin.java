package com.expleo.SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptLogin {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementsByTagName('input')[0].value='Darshan';");
		js.executeScript("document.getElementsByTagName('input')[1].value='Raj';");
		js.executeScript("document.getElementsByTagName('input')[2].value='dharsh@gmail.com';");
		js.executeScript("document.getElementsByTagName('input')[3].value='Darshan';");
		js.executeScript("document.getElementsByTagName('input')[4].value='Raj';");
		js.executeScript("document.getElementsByTagName('button')[0].click();");

		js.executeScript("window.scrollBy(0,600)");

	}

}
