package com.expleo.SeleniumBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");		
		
		String parent = driver.getWindowHandle();
		System.out.println("Unique code of parent: "+parent);
		Set<String> allwindowhandle = driver.getWindowHandles();
		System.out.println(allwindowhandle.size());
		
		Actions act = new Actions(driver);
		WebElement anchorTag = driver.findElement(By.xpath("//*[@id=\"LinkList1\"]/div/ul/li[1]/a"));
		act.keyDown(Keys.CONTROL).moveToElement(anchorTag).click().keyUp(Keys.CONTROL).build().perform();
		
		
		Set<String> newallwindowhandle = driver.getWindowHandles();
		System.out.println(newallwindowhandle.size());
		
		Iterator<String> iterator = newallwindowhandle.iterator();
		iterator.next();
		String child = iterator.next();
		
		driver.switchTo().window(child);
	}

}
