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

public class Curriculum {
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
		  //TEST CASE NO 130
		public void AccessingtheCurriculumPage() throws InterruptedException  {
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll down by 700 pixels
		        js.executeScript("window.scrollBy(0,700)");
		        
		    	Thread.sleep(3000);
		    	
				WebElement grade3= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[8]/div/button"));
				Thread.sleep(3000);

				grade3.click();
				Thread.sleep(3000);
		}		   
		@Test (priority= 2)
		  //TEST CASE NO 131
		public void DisplayofCourses() throws InterruptedException  {
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
		@Test (priority= 3)
		  //TEST CASE NO 132
		public void CourseInformation() throws InterruptedException  {
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll down by 700 pixels
		        js.executeScript("window.scrollBy(0,700)");
		        
		    	Thread.sleep(3000);
		    	
				WebElement grade3= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[8]/div/button"));
				Thread.sleep(3000);

				grade3.click();
				Thread.sleep(3000);
		}	
		@Test (priority= 4)
		  //TEST CASE NO 133
		public void EnrollmentProcess() throws InterruptedException  {
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll down by 700 pixels
		        js.executeScript("window.scrollBy(0,700)");
		        
		    	Thread.sleep(3000);
		    	
				WebElement grade3= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[8]/div/button"));
				Thread.sleep(3000);

				grade3.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor jss = (JavascriptExecutor) driver;

		        // Scroll down by 700 pixels
		        jss.executeScript("window.scrollBy(0,500)");
		        
				WebElement Enroll= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/button"));
				Enroll.click();
				
				Thread.sleep(3000);

				WebElement Name= driver.findElement(By.xpath("//*[@id=\"Name\"]"));
				Name.sendKeys("TEst");
				
				Thread.sleep(3000);

				WebElement Email= driver.findElement(By.xpath("//*[@id=\"Email\"]"));
				Email.sendKeys("saurabhkumbhar187@gmail.com");
				
				Thread.sleep(3000);

				WebElement Mobile= driver.findElement(By.xpath("//*[@id=\"Mobile_Number\"]"));
				Mobile.sendKeys("7769889013");
				
				Thread.sleep(3000);

				WebElement Description= driver.findElement(By.xpath("//*[@id=\"Description\"]"));
				Description.sendKeys("TEstsssssssssssssssssssssssssssssssssssssssssssssssssssssss");
				Thread.sleep(3000);


				WebElement SubmitForm= driver.findElement(By.partialLinkText("Submit"));
				SubmitForm.click();
				
				Thread.sleep(3000);

		        
		}	
		@Test (priority= 5)
		  //TEST CASE NO 135
		public void CourseDescriptions() throws InterruptedException  {
				WebElement workshopBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[2]/li"));
				Thread.sleep(3000);
				workshopBtn.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Scroll down by 700 pixels
		        js.executeScript("window.scrollBy(0,700)");
		        
		    	Thread.sleep(3000);
		    	
				WebElement grade3= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div/div/div[8]/div/button"));
				Thread.sleep(3000);

				grade3.click();
				Thread.sleep(3000);
				
				// Create an instance of JavascriptExecutor
		        JavascriptExecutor jss = (JavascriptExecutor) driver;

		        // Scroll down by 700 pixels
		        jss.executeScript("window.scrollBy(0,500)");
		        
				WebElement Description= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div[2]/div/div/p/p"));
				Description.isDisplayed();
				
				Thread.sleep(3000);
		}
}
