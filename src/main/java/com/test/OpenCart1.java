package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart1 {

	public static void main(String[] args) {
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.opencart.com/index.php?route=cms/demo");
		
		WebElement login = wd.findElement(By.partialLinkText("Log"));
		login.click();

	}

}
