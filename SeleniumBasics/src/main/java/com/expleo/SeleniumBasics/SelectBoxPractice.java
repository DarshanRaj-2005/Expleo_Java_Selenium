package com.expleo.SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectBoxPractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Select selectbox = new Select(driver.findElement(By.id("drop1")));
		selectbox.selectByIndex(1); //select the first index value
		selectbox.selectByValue("ghi"); //select the option using value
		selectbox.selectByVisibleText("doc 3"); //select the option by the visible text in option
		
		selectbox.selectByContainsVisibleText("4"); //select the option which contain 4
		
		List<WebElement> options = selectbox.getOptions();//get all options available in select
		
		System.out.println("Available Options: ");
		for(WebElement web : options) {   //print all the options one by one
			System.out.println(web.getText());
		}	
		
		boolean multiple = selectbox.isMultiple();
		System.out.println("Is multiple available"+multiple);
		
		selectbox.deselectByIndex(1);
	}
}
