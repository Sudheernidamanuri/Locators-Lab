package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) {
		
		//-------- Using CSS Selector ----------
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com");
		
		
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(25));
		WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".Pke_EE")));
		search.sendKeys("iphone 16");
		
		

	}

}
