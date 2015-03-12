package com.testing;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PacterSearchTest{

	
	@Test
	public void testPacterSearchBar(){
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.pactera.com");
		WebElement search = driver.findElement(By.xpath("//*[@id='s']"));
		search.sendKeys("test automation");
		WebElement searchclick = driver.findElement(By.xpath("//*[@id='searchsubmit']"));
		
		searchclick.click();
		
		//driver.quit();
		
	}

}
