package com.testing;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PacteraTest {
	
	@Test
	public void testPacter(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.pactera.com");
		driver.quit();
		
	}
}
   
