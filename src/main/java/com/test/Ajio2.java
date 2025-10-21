package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio2 {

	public static void main(String[] args) {
		
		 //---------- PartialLinkTest --------------
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ajio.com");
		
		//<a href="/selfcare" aria-label="Customer Care">Customer Care</a>

		//LinkText = Customer
		//partialLinkText = Cust
		//partialLinkText = Omer

        WebElement customer = wd.findElement(By.partialLinkText("Cust"));
		customer.click();

	}

}
