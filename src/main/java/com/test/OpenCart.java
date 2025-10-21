package com.test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCart {

	public static void main(String[] args) {
        
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.opencart.com/index.php?route=cms/demo");
		
		WebElement demo = wd.findElement(By.linkText("Demo"));
		demo.click();


	}

}
