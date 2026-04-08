package com.expleo.SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StoringOptionsAsList {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");

		WebElement courseInput = driver.findElement(By.xpath("//*[@id=\"j_idt87:auto-complete_input\"]"));
		courseInput.sendKeys("Playwright");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		List<WebElement> options = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				By.xpath("//span[contains(@id,'j_idt87:auto-complete_panel')]/ul/li")));

		for (WebElement e : options) {
			System.out.println(e.getText());
			if (e.getText().equals("Playwright")) {
				e.click();
			}
		}
	}
}
