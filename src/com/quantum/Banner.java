package com.quantum;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Banner {
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
		  //TEST CASE NO 16 
		  public void BannerVisibility() throws InterruptedException  {
			WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
			Thread.sleep(3000);
			aboutusBtn.click();
			Thread.sleep(3000);
			
			WebElement banner= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]"));
			Thread.sleep(3000);
			banner.isDisplayed();
}
		@Test (priority= 3)
		  //TEST CASE NO 17 
		  public void BannerContent() throws InterruptedException  {
			WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
			Thread.sleep(3000);
			aboutusBtn.click();
			Thread.sleep(3000);
			
			WebElement banner= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]"));
			Thread.sleep(3000);
			banner.isDisplayed();
}
		@Test (priority= 4)
		  //TEST CASE NO 18 
		  public void  BannerImage() throws InterruptedException  {
			WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
			Thread.sleep(3000);
			aboutusBtn.click();
			Thread.sleep(3000);
			
			WebElement banner= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]"));
			Thread.sleep(3000);
			banner.isDisplayed();
}
		@Test (priority= 5)
		  //TEST CASE NO 20 
		 public void BannerNavigationLink() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			WebElement booknowBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/button"));
			booknowBtn.click();
			Thread.sleep(3000);
		}
		@Test (priority= 6)
		  //TEST CASE NO 21 
		 public void BannerResponsiveness() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
		}
		@Test (priority= 7)
		  //TEST CASE NO 22 
		 public void BannerLoadingTime() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
		}
		@Test (priority= 8)
		  //TEST CASE NO 23 
		  public void  BannerContentUpdate() throws InterruptedException  {
			WebElement aboutusBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[4]/li"));
			Thread.sleep(3000);
			aboutusBtn.click();
			Thread.sleep(3000);
			
			WebElement banner= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div[1]"));
			Thread.sleep(3000);
			banner.isDisplayed();
}
}