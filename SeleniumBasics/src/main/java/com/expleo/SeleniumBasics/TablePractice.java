package com.expleo.SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		List<WebElement> table = driver.findElements(By.xpath("//*[@id=\"table1\"]/thead/tr/th"));
		for (WebElement t : table) {
			System.out.println("Table Headings: " + t.getText());
		}

		List<WebElement> table1 = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr/td"));
		for (WebElement t : table1) {
			System.out.println("Table values: " + t.getText());
		}

		List<WebElement> table2 = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td"));
		for (WebElement t : table2) {
			System.out.println("First Row values: " + t.getText());
		}

		List<WebElement> table3 = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr/td[1]"));
		for (WebElement t : table3) {
			System.out.println("First column values: " + t.getText());
		}

		List<WebElement> table4 = driver.findElements(By.xpath("//*[@id=\"table1\"]/tbody/tr"));
		System.out.println("No of Rows: " + table4.size());
		System.out.println("No of Columns: " + table.size());

		System.out.println("--Full Table--");
		for (WebElement t : table) {
			System.out.print(t.getText() + " ");
		}
		System.out.println();

		for (WebElement row : table4) {
			List<WebElement> col = row.findElements(By.tagName("td"));

			for (WebElement c : col) {
				System.out.print(c.getText() + " ");
			}
			System.out.println();

		}
	}
}
