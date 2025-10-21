package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio1 {

	public static void main(String[] args) {
		
        //---------- LinkTest --------------
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ajio.com");
		
		//<span aria-label="MEN">MEN</span>
		//LinkText = MEN
		WebElement men = wd.findElement(By.linkText("MEN"));
		men.click();


	}

}
