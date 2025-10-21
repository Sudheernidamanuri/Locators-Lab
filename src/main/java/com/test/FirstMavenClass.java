package com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstMavenClass {

	public static void main(String[] args) {
		
		//---------- Passing wrong userName and wrong password -----------
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().fullscreen();
		wd.get("https://www.saucedemo.com/");
		String title = wd.getTitle();
		String url = wd.getCurrentUrl();
		System.out.println("Before login Title : "+title);
		System.out.println("Before login URL : "+url);
		System.out.println("=============================");
		
		// passing the userName using locators
		WebElement username = wd.findElement(By.id("user-name"));
		username.sendKeys("Sudheer1409");
		
		//passing the Password using locators
		WebElement password = wd.findElement(By.id("password"));
		password.sendKeys("190524");
		
		//clicking the login button
		WebElement loginButton = wd.findElement(By.id("login-button"));
		loginButton.click();
		
		System.out.println("After login Title : "+title);
		System.out.println("After login URL : "+url);
		
		
		


	}

}
