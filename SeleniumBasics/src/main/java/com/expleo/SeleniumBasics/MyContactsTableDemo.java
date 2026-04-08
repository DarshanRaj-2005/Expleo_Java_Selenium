package com.expleo.SeleniumBasics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyContactsTableDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("dharshan@gmail.com",Keys.ENTER);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("darshan@12",Keys.ENTER);
		
		WebElement submit = driver.findElement(By.id("signup"));
		submit.click();
		
		List<WebElement> thead = driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr"));
		
		for(WebElement h: thead) {
			System.out.print(h.getText()+" ");
		}
	}

}
