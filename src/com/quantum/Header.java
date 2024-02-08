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

public class Header {
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
		@Test (priority= 2)
		  //TEST CASE NO 1 
		  public void LogoVisibilityTest() throws InterruptedException  {
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.isDisplayed();
				Thread.sleep(3000);
}
		@Test (priority= 3)
		  //TEST CASE NO 2 
		  public void LogoLinkTest() throws InterruptedException  {
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.click();
				Thread.sleep(3000);
}
		@Test (priority= 4)
		  //TEST CASE NO 4 
		  public void HomeLinkTest() throws InterruptedException  {
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.click();
				Thread.sleep(3000);
}

		@Test (priority= 5)
		  //TEST CASE NO 5 
		  public void BookWorkshopLinkTest() throws InterruptedException  {
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
}
		@Test (priority= 6)
		  //TEST CASE NO 7 
		  public void TestimonialsLinkTest() throws InterruptedException  {
				WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
				Thread.sleep(3000);
				testimonialBtn.click();
				Thread.sleep(3000);
}
		@Test (priority= 7)
		  //TEST CASE NO 8 
		  public void TestimonialsSectionNavigationTest() throws InterruptedException  {
				WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
				Thread.sleep(3000);
				testimonialBtn.click();
				Thread.sleep(3000);
				
				//Navigate to homepage
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.click();
				Thread.sleep(3000);
				
}
		@Test (priority= 8)
		  //TEST CASE NO 9 
		  public void AboutUsLinkTest() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
}
		@Test (priority= 9)
		  //TEST CASE NO 10
		  public void AboutUsPageContentTest() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);
				
				WebElement banner= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]"));
				Thread.sleep(3000);
				banner.isDisplayed();
}
		@Test (priority= 10)
		  //TEST CASE NO 11
		  public void NavigationCheckTest() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);

				//Navigate to testimonial
				WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
				Thread.sleep(3000);
				testimonialBtn.click();
				Thread.sleep(3000);
				
				//Navigate to homepage
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.click();
				Thread.sleep(3000);
		}

		@Test (priority= 11)
		  //TEST CASE NO 12
		  public void HeaderConsistencyTest() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);

				//Navigate to testimonial
				WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
				Thread.sleep(3000);
				testimonialBtn.click();
				Thread.sleep(3000);
				
				//Navigate to homepage
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.click();
				Thread.sleep(3000);
				
				//Navigate to workshop
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
		}
		@Test (priority= 12)
		  //TEST CASE NO 15
		  public void LogoBehavioronPageScrollTest() throws InterruptedException  {
				WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
				Thread.sleep(3000);
				aboutusBtn.click();
				Thread.sleep(3000);

				//Navigate to testimonial
				WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
				Thread.sleep(3000);
				testimonialBtn.click();
				Thread.sleep(3000);
				
				//Navigate to homepage
				WebElement logo= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[1]/div/a/img"));
				Thread.sleep(3000);
				logo.click();
				Thread.sleep(3000);
				
				//Navigate to workshop
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll down by 500 pixels
		        js.executeScript("window.scrollBy(0,1000)");
		        
		    	Thread.sleep(3000);
		}
		
}