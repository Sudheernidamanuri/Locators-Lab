package com.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio3 {

	public static void main(String[] args) {
		
		//------------ className locator ------------
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.ajio.com");
		//<div class="regular-store">
		List<WebElement> elements = wd.findElements(By.className("regular-store"));
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
