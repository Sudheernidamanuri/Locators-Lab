package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenCart2 {

	public static void main(String[] args) {
		

		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.opencart.com/index.php?route=cms/demo");
		
	    List<WebElement> elements = wd.findElements(By.className("container"));
	    System.out.println(elements.size());
	    
	    for(WebElement tags:elements) {
	    	String text=tags.getText().trim();
	    	if(!text.isEmpty()) {
	    		System.out.println(text);
	    	}
	    }

	}

}
