package com.quantum;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BookWorkshop {
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
	  //TEST CASE NO 72
	public void Presenceofthebanner() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			WebElement Banner=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]"));
			Banner.isDisplayed();
}
	@Test (priority= 3)
	  //TEST CASE NO 73
	public void Bannercontainsinformation() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			WebElement Banner=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]"));
			Banner.isDisplayed();
}
	@Test (priority= 4)
	  //TEST CASE NO 74
	public void Verifytheresponsivenessofthebanner() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			Dimension d = new Dimension(500,900);
			driver.manage().window().setSize(d);
			
			Thread.sleep(3000);
			
}
	@Test (priority= 5)
	  //TEST CASE NO 75
	public void Gradesfrom1to7arelisted() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 700 pixels
	        js.executeScript("window.scrollBy(0,700)");
	        
	    	Thread.sleep(3000);
	    	
	    	
	    WebElement Carosal= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/button[2]"));
	    Carosal.click();
		Thread.sleep(3000);
	    Carosal.click();
		Thread.sleep(3000);
	    Carosal.click();
		Thread.sleep(3000);

}
	@Test (priority= 6)
	  //TEST CASE NO 76
	public void Validatdefaulgrade() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 700 pixels
	        js.executeScript("window.scrollBy(0,700)");
	        
	    	Thread.sleep(3000);

}
	@Test (priority= 7)
	  //TEST CASE NO 77
	public void Confirmonegradeselected() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 700 pixels
	        js.executeScript("window.scrollBy(0,700)");
	        
	    	Thread.sleep(3000);
		    WebElement Carosal1= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[5]/div/button"));
		    WebElement Carosal2= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[6]/div/button"));
		    Carosal1.click();
		    Carosal2.click();
			Thread.sleep(3000);

}
	@Test (priority= 8)
	  //TEST CASE NO 78
	public void Verifydisplayofworkshopfees() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	       
			Thread.sleep(3000);
		    WebElement fees= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div/div[1]/div[1]/div[1]"));
		    fees.isDisplayed();
			Thread.sleep(3000);
}
	@Test (priority= 9)
	  //TEST CASE NO 79
	public void Checkfeebasedongrade() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Scroll down by 1000 pixels
	        js.executeScript("window.scrollBy(0,1000)");
	       
			Thread.sleep(3000);
		    WebElement fees= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div/div[1]/div[1]/div[2]/p"));
		    fees.isDisplayed();
			Thread.sleep(3000);
}
	@Test (priority= 10)
//TEST CASE NO 80
public void Ensureformatoffee() throws InterruptedException  {
		WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
		Thread.sleep(3000);
		workshopBtn.click();
		Thread.sleep(3000);
		
		// Create an instance of JavascriptExecutor
      JavascriptExecutor js = (JavascriptExecutor) driver;

      // Scroll down by 1000 pixels
      js.executeScript("window.scrollBy(0,1000)");
     
		Thread.sleep(3000);
	    WebElement fees= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div/div[1]/div[1]/div[2]/p"));
	    fees.isDisplayed();
		Thread.sleep(3000);
}
	@Test (priority= 11)
	//TEST CASE NO 81
	public void Presenceofworkshopform() throws InterruptedException  {
			WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
			Thread.sleep(3000);
			workshopBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
	      JavascriptExecutor js = (JavascriptExecutor) driver;

	      // Scroll down by 2000 pixels
	      js.executeScript("window.scrollBy(0,2000)");
	     
			Thread.sleep(3000);
		    WebElement form= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[7]/div[1]/form/div[1]/div[1]/h1"));
		    form.isDisplayed();
			Thread.sleep(3000);
	}
}
