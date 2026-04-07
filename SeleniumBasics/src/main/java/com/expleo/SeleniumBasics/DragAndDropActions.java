package com.expleo.SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		
		Actions act = new Actions(driver);
		WebElement dragButton = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]"));
		WebElement dropDiv = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]"));
		act.dragAndDrop(dragButton,dropDiv).perform();
		
		WebElement para = driver.findElement(By.xpath("//*[@id=\"form:drop_content\"]/p"));
		String paraText = para.getText();
		
		if(paraText.equals("Dropped!")) {
			System.out.println("Drop Success");
		}
		else {
			System.out.println("Not Success");
		}
	}

}
