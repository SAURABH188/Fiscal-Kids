package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AboutUs {
	 WebDriver driver = null;
		@BeforeSuite
		 @Test (priority= 1)
		  //TEST CASE NO 1
		  		public void setUp() {
		  			  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  			  driver=new ChromeDriver(); 
		  			  driver.get("https://karmill-ui.vercel.app/");
		  			  driver.manage().window().maximize();
		  			 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	  			
		  }
		@AfterSuite
		public void teardown() {
			  driver.close();
		}
		
		@Test (priority= 1)
		  //TEST CASE NO 110
		  public void ContentAccuracy() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
}
		@Test (priority= 2)
		  //TEST CASE NO 111
		  public void PageNavigation() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
}
		@Test (priority= 3)
		  //TEST CASE NO 112
		  public void PageLayoutandDesign() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,500)");
}
		@Test (priority= 4)
		  //TEST CASE NO 114
		  public void TeamMembers() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,2000)");
			  	Thread.sleep(3000);
}
		@Test (priority= 5)
		  //TEST CASE NO 115
		  public void CompanyHistory() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,500)");
			  	Thread.sleep(3000);
}
		@Test (priority= 6)
		  //TEST CASE NO 116
		  public void MissionandVision() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,500)");
			  	Thread.sleep(3000);
}
		@Test (priority= 7)
		  //TEST CASE NO 118
		  public void MultimediaElements() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,500)");
			  	Thread.sleep(3000);
}
		@Test (priority= 8)
		  //TEST CASE NO 121
		  public void LanguageandTone() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,500)");
			  	Thread.sleep(3000);
}
		@Test (priority= 9)
		  //TEST CASE NO 122
		  public void ConsistencywithBranding() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
			      JavascriptExecutor jss = (JavascriptExecutor) driver;

			      // Scroll down by 200 pixels
			      jss.executeScript("window.scrollBy(0,500)");
			  	Thread.sleep(3000);
}
}
