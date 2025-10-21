package com.test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Ajio {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ajio.com");
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(20));
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("searchVal")));
		search.sendKeys("Shirts for men");

	}

}
