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
		
		List<WebElement> values = driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr/td[2]"));
		
		for(WebElement h: values) {
			System.out.println(h.getText()+" ");
		}
		
		String expected = "Jagadeep KC";
		
		int i = 1;
		for(WebElement h :values) {
			if(h.getText().equals(expected)) {
				List<WebElement> match = driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr["+i+"]"));
				for(WebElement m :match) {
					System.out.println(m.getText());
				}
			}
			i++;
		}
	}

}
