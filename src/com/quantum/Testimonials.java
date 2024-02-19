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

public class Testimonials {
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
	  //TEST CASE NO 92
	  public void TestimonialsLinkTest() throws InterruptedException  {
			WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
			Thread.sleep(3000);
			testimonialBtn.click();
			Thread.sleep(3000);
}
	@Test (priority= 2)
	  //TEST CASE NO 93
	  public void  TestimonialsVisibility() throws InterruptedException  {
			WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
			Thread.sleep(3000);
			testimonialBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
		      JavascriptExecutor jss = (JavascriptExecutor) driver;

		      // Scroll down by 200 pixels
		      jss.executeScript("window.scrollBy(0,500)");
		      
		      WebElement testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]"));
				Thread.sleep(3000);
				testimonial.isDisplayed();
				Thread.sleep(3000);
}
	@Test (priority= 3)
//TEST CASE NO 94
public void  PresenceTestimonials() throws InterruptedException  {
		WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
		Thread.sleep(3000);
		testimonialBtn.click();
		Thread.sleep(3000);
		
		// Create an instance of JavascriptExecutor
	      JavascriptExecutor jss = (JavascriptExecutor) driver;

	      // Scroll down by 200 pixels
	      jss.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);

	   // Create an instance of JavascriptExecutor
	      JavascriptExecutor js = (JavascriptExecutor) driver;

	      // Scroll down by 200 pixels
	      js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(3000);

}
	@Test (priority= 4)
	  //TEST CASE NO 95
	  public void  EnsureTestimonialContent() throws InterruptedException  {
			WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
			Thread.sleep(3000);
			testimonialBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
		      JavascriptExecutor jss = (JavascriptExecutor) driver;

		      // Scroll down by 200 pixels
		      jss.executeScript("window.scrollBy(0,500)");
		      
		      WebElement testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]"));
				Thread.sleep(3000);
				testimonial.isDisplayed();
				Thread.sleep(3000);
}
	@Test (priority= 5)
	  //TEST CASE NO 96
	  public void  ValidateTestimonialImages() throws InterruptedException  {
			WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
			Thread.sleep(3000);
			testimonialBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
		      JavascriptExecutor jss = (JavascriptExecutor) driver;

		      // Scroll down by 200 pixels
		      jss.executeScript("window.scrollBy(0,500)");
		      
		      WebElement testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div[1]/img"));
				Thread.sleep(3000);
				testimonial.isDisplayed();
				Thread.sleep(3000);
}
	@Test (priority= 6)
	//TEST CASE NO 97
	public void  ConfirmProperPagination() throws InterruptedException  {
			WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
			Thread.sleep(3000);
			testimonialBtn.click();
			Thread.sleep(3000);
			
			// Create an instance of JavascriptExecutor
		      JavascriptExecutor jss = (JavascriptExecutor) driver;

		      // Scroll down by 200 pixels
		      jss.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);

		   // Create an instance of JavascriptExecutor
		      JavascriptExecutor js = (JavascriptExecutor) driver;

		      // Scroll down by 200 pixels
		      js.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);

	}
	@Test (priority= 7)
	//TEST CASE NO 99
	public void   TestimonialSubmissionForm() throws InterruptedException  {
		 driver.get("https://fiscal-kids-admin.vercel.app/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		 
			WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			Thread.sleep(3000);
			email.sendKeys("admin@admin.com");
			password.sendKeys("password");
			Thread.sleep(3000);
			
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/form/div[3]/div[2]/button"));
			submit.click();
			Thread.sleep(3000);
			
			WebElement Testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
			Testimonial.click();
			Thread.sleep(3000);
			
			WebElement Add= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[1]/button"));
			Add.click();
			Thread.sleep(3000);
			
			//Form
			
			WebElement Title= driver.findElement(By.xpath("//*[@id=\"title\"]"));
			Title.sendKeys("Testing");
			Thread.sleep(3000);
			
			WebElement Description= driver.findElement(By.xpath("//*[@id=\"description\"]"));
			Description.sendKeys("Testing");
			Thread.sleep(3000);
			
			WebElement Given= driver.findElement(By.xpath("//*[@id=\"given_by\"]"));
			Given.sendKeys("Testing");
			Thread.sleep(3000);
			
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[6]/div/div/form/div[2]/button[2]"));
			Submit.click();
			Thread.sleep(3000);
	}
	@Test (priority= 8)
	//TEST CASE NO 101
	public void   VerifyTestimonialDetails() throws InterruptedException  {
		 driver.get("https://fiscal-kids-admin.vercel.app/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		 
			WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			Thread.sleep(3000);
			email.sendKeys("admin@admin.com");
			password.sendKeys("password");
			Thread.sleep(3000);
			
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/form/div[3]/div[2]/button"));
			submit.click();
			Thread.sleep(3000);
			
			WebElement Testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
			Testimonial.click();
			Thread.sleep(3000);
			WebElement Details= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[1]"));
			Details.click();
			Thread.sleep(3000);
			
	}
	@Test (priority= 9)
	//TEST CASE NO 102
	public void   TestimonialEditingFunctionality() throws InterruptedException  {
		 driver.get("https://fiscal-kids-admin.vercel.app/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		 
			WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			Thread.sleep(3000);
			email.sendKeys("admin@admin.com");
			password.sendKeys("password");
			Thread.sleep(3000);
			
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/form/div[3]/div[2]/button"));
			submit.click();
			Thread.sleep(3000);
			
			WebElement Testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
			Testimonial.click();
			Thread.sleep(3000);
			WebElement Details= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[1]"));
			Details.click();
			Thread.sleep(3000);
			
			WebElement Edit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[1]/div[2]"));
			Edit.click();
			Thread.sleep(3000);
			
			WebElement Title= driver.findElement(By.xpath("//*[@id=\"title\"]"));
			Title.clear();
			Title.sendKeys("Absolute game-changer!");
			Thread.sleep(3000);
			
			WebElement Submit= driver.findElement(By.xpath("/html/body/div[3]/div/div/form/div[2]/button[2]"));
			Submit.click();
			Thread.sleep(3000);
	}
	
	@Test (priority= 10)
	//TEST CASE NO 103
	public void VerifyTestimonialSearch() throws InterruptedException  {
		 driver.get("https://fiscal-kids-admin.vercel.app/");
		  driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);	
		 
			WebElement email= driver.findElement(By.xpath("//*[@id=\"text\"]"));
			WebElement password= driver.findElement(By.xpath("//*[@id=\"password\"]"));
			Thread.sleep(3000);
			email.sendKeys("admin@admin.com");
			password.sendKeys("password");
			Thread.sleep(3000);
			
			WebElement submit= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div/form/div[3]/div[2]/button"));
			submit.click();
			Thread.sleep(3000);
			
			WebElement Testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
			Testimonial.click();
			Thread.sleep(3000);
			
			WebElement Search= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/input"));
			Search.sendKeys("Invaluable");
			Thread.sleep(3000);
			
			WebElement SearchBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[1]/div/div/span"));
			SearchBtn.click();
			Thread.sleep(3000);
	}
			
}
