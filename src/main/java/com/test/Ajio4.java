package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio4 {

	public static void main(String[] args) {
		
		//----------- tagName locator ---------
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ajio.com");
		
		List<WebElement> elements = wd.findElements(By.tagName("span"));
		int n=elements.size();
		System.out.println("No.of features : "+n);
		
		for(WebElement list:elements) {
			String text=list.getText().trim();
			
			if(!text.isEmpty()) {
				System.out.println(text);
			}
		}
		

	}

}
