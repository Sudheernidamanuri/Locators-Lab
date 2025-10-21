package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) {
		
		//---------- Using XPath locator -----------
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in");
		
		//<a href="/b/32702023031?node=32702023031&amp;ld=AZINSOANavDesktop_T3&amp;ref_=nav_cs_sell_T3" class="nav-a  " 
		//tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav_cs_2" data-csa-c-content-id="nav_cs_sell_T3" 
		//data-csa-c-id="jqivsr-9cjfmb-8e3w5-lw1h5s">Sell</a>
		
		//XPath = //tagname[@attribute='value']----> //a[@class='nav-a  ']
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(25));
		WebElement fresh = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-a  ']")));
		fresh.click();

	}

}
