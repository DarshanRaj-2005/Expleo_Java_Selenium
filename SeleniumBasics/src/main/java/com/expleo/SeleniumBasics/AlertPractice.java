package com.expleo.SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		
		WebElement simple = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		simple.click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		WebElement prompt = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]"));
		prompt.click();
		alert.sendKeys("I am Tester");
		Thread.sleep(3000);
		System.out.println(alert.getText());
		alert.accept();
		
		Thread.sleep(2000);
		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		confirm.click();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
	}

}
