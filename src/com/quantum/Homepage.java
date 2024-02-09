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

public class Homepage {
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
	  //TEST CASE NO 28
	  public void VerifyTestimonialsSectionPresence() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll down by 500 pixels
        js.executeScript("window.scrollBy(0,2200)");
        
    	Thread.sleep(3000);
		
}
	@Test (priority= 2)
	  //TEST CASE NO 29
	  public void CheckTestimonialVisibility() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
      JavascriptExecutor js = (JavascriptExecutor) driver;

      // Scroll down by 500 pixels
      js.executeScript("window.scrollBy(0,2200)");
      
  	Thread.sleep(3000);
		
}
	@Test (priority= 3)
	  //TEST CASE NO 30
	  public void EnsureTestimonialImagesDisplay() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll down by 500 pixels
    js.executeScript("window.scrollBy(0,2200)");
    
	Thread.sleep(3000);
	WebElement bannerimg= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[4]/div/div/img"));
	bannerimg.isDisplayed();
	
	Thread.sleep(3000);
}
	@Test (priority= 4)
	  //TEST CASE NO 31
	  public void CheckTestimonialAuthorNames() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
  JavascriptExecutor js = (JavascriptExecutor) driver;

  // Scroll down by 500 pixels
  js.executeScript("window.scrollBy(0,2200)");
  
	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[4]/div/div/div/h4"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 5)
	  //TEST CASE NO 32
	  public void ValidateTestimonialContent() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;

// Scroll down by 500 pixels
js.executeScript("window.scrollBy(0,2200)");

	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[3]/div/div/div"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 6)
	  //TEST CASE NO 33
	  public void VerifyTestimonialCarousel() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
       JavascriptExecutor js = (JavascriptExecutor) driver;

       //Scroll down by 500 pixels
       js.executeScript("window.scrollBy(0,2200)");
 
	   Thread.sleep(6000);
	
	WebElement carousalbtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/button[2]"));
	carousalbtn.click();
	
	Thread.sleep(8000);
		
}
	@Test (priority= 7)
	  //TEST CASE NO 34
	  public void CheckTestimonialTransitionSpeed() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
     JavascriptExecutor js = (JavascriptExecutor) driver;

     //Scroll down by 500 pixels
     js.executeScript("window.scrollBy(0,2200)");

	   Thread.sleep(6000);
	
	WebElement carousalbtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/button[2]"));
	carousalbtn.click();
	
	Thread.sleep(8000);
		
}
	@Test (priority= 8)
	  //TEST CASE NO 35 
	  public void TestimonialsSectionNavigationTest() throws InterruptedException  {
			WebElement testimonialBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/ul/a[3]/li"));
			Thread.sleep(3000);
			testimonialBtn.click();
			Thread.sleep(3000);
			
}
	@Test (priority= 9)
	  //TEST CASE NO 36
	  public void NavigateThroughTestimonials() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
   JavascriptExecutor js = (JavascriptExecutor) driver;

   //Scroll down by 500 pixels
   js.executeScript("window.scrollBy(0,2200)");

	   Thread.sleep(6000);
		WebElement ViewmoreBtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/button/strong"));
		Thread.sleep(3000);
		ViewmoreBtn.click();
		Thread.sleep(3000);
	}   
	@Test (priority= 10)
	  //TEST CASE NO 37
	  public void VerifyTestimonialQuotes() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
    JavascriptExecutor js = (JavascriptExecutor) driver;

    //Scroll down by 500 pixels
     js.executeScript("window.scrollBy(0,2200)");

	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[3]/div/div/div"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 11)
	  //TEST CASE NO 38
	  public void EnsureTestimonialAttribution() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
  JavascriptExecutor js = (JavascriptExecutor) driver;

  //Scroll down by 500 pixels
   js.executeScript("window.scrollBy(0,2200)");

	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[3]/div/div/div"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 12)
	  //TEST CASE NO 39
	  public void CheckTestimonialFormatting() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;

//Scroll down by 500 pixels
 js.executeScript("window.scrollBy(0,2200)");

	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[3]/div/div/div"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 13)
	  //TEST CASE NO 45
	  public void EnsureTestimonialLanguage() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;

//Scroll down by 500 pixels
js.executeScript("window.scrollBy(0,2200)");

	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[3]/div/div/div"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 14)
	  //TEST CASE NO 46
	  public void TestTestimonialRemoval() throws InterruptedException  {
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
				
				WebElement testimonialpage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
				testimonialpage.click();
				Thread.sleep(3000);
				
				WebElement deletebtn= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[2]"));
				deletebtn.click();
				Thread.sleep(3000);
				
	}
	@Test (priority= 15)
	  //TEST CASE NO 47
	  public void CheckTestimonialAddition() throws InterruptedException  {
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
				
				WebElement testimonialpage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
				testimonialpage.click();
				Thread.sleep(3000);
				
				//add testimonial
				WebElement add= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[1]/div/div[1]/div[1]/button"));
				add.click();
				Thread.sleep(3000);
				
				//Add Testimonails details
				
				WebElement title= driver.findElement(By.xpath("//*[@id=\"title\"]"));
				WebElement description= driver.findElement(By.xpath("//*[@id=\"description\"]"));
				WebElement givenby= driver.findElement(By.xpath("//*[@id=\"given_by\"]"));
				WebElement image= driver.findElement(By.xpath("//*[@id=\"image\"]"));

				Thread.sleep(3000);
				title.sendKeys("Test");
				Thread.sleep(3000);
				description.sendKeys("Test description");
				Thread.sleep(3000);
				givenby.sendKeys("Test given");
				Thread.sleep(3000);
				image.sendKeys("C:\\\\Users\\\\SAURABH\\\\Desktop\\\\Profilee.jpg");
				
				// Create an instance of JavascriptExecutor
			     JavascriptExecutor js = (JavascriptExecutor) driver;

			     //Scroll down by 500 pixels
			     js.executeScript("window.scrollBy(0,2200)");

				   Thread.sleep(6000);
				
				WebElement save= driver.findElement(By.xpath("/html/body/div[6]/div/div/form/div[2]/button[2]"));
				save.click();
				Thread.sleep(3000);

				
	}
	@Test (priority= 16)
	  //TEST CASE NO 48
	  public void VerifyTestimonialSorting() throws InterruptedException  {
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
				
				WebElement testimonialpage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
				testimonialpage.click();
				Thread.sleep(3000);
				
	}
	@Test (priority= 17)
	  //TEST CASE NO 49
	  public void TestTestimonialEdit() throws InterruptedException  {
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
				
				WebElement testimonialpage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
				testimonialpage.click();
				Thread.sleep(3000);
				
				WebElement view= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div[2]/div/table/tbody/tr[1]/td[7]/button[1]"));
				view.click();
				Thread.sleep(3000);
				
	}
	@Test (priority= 18)
	  //TEST CASE NO 50
	  public void CheckTestimonialTruncation() throws InterruptedException  {
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
				
				WebElement testimonialpage= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/nav/ul/li[5]/a/p"));
				testimonialpage.click();
				Thread.sleep(3000);
}
	@Test (priority= 20)
	  //TEST CASE NO 52
	  public void LoadHomepage() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Scroll down by 500 pixels
    js.executeScript("window.scrollBy(0,2200)");
    
	Thread.sleep(3000);	
}
	@Test (priority= 21)
	  //TEST CASE NO 53
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
	@Test (priority= 22)
	  //TEST CASE NO 55
	  public void HomepageImages() throws InterruptedException  {
		// Create an instance of JavascriptExecutor
	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    // Scroll down by 500 pixels
	    js.executeScript("window.scrollBy(0,2200)");
	    
		Thread.sleep(3000);
		WebElement bannerimg= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[4]/div/div/img"));
		bannerimg.isDisplayed();
		
		Thread.sleep(3000);
	
	}

	@Test (priority= 23)
	  //TEST CASE NO 56
	  public void FeaturedContent() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;

// Scroll down by 500 pixels
js.executeScript("window.scrollBy(0,2200)");

	Thread.sleep(3000);
	
	WebElement name= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[5]/div[2]/div/div/div/div/div[3]/div/div/div"));
	name.isDisplayed();
	
	Thread.sleep(3000);
		
}
	@Test (priority= 24)
	  //TEST CASE NO 58
	  public void FooterNavigation() throws InterruptedException  {
		
		// Create an instance of JavascriptExecutor
JavascriptExecutor js = (JavascriptExecutor) driver;

//Scroll down by 500 pixels
js.executeScript("window.scrollBy(0,4200)");

	Thread.sleep(3000);
	
	WebElement aboutus= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[7]/div[1]/div/div[2]/div/ul/a[2]/li"));
	aboutus.click();
	
	Thread.sleep(3000);
	
	
	// Create an instance of JavascriptExecutor
JavascriptExecutor jss = (JavascriptExecutor) driver;

//Scroll down by 500 pixels
jss.executeScript("window.scrollBy(0,4200)");

	Thread.sleep(3000);
	
	WebElement testimonial= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div/div[2]/div/ul/a[3]/li"));
	testimonial.click();
	
	Thread.sleep(3000);
	// Create an instance of JavascriptExecutor
JavascriptExecutor jsss = (JavascriptExecutor) driver;

//Scroll down by 500 pixels
jsss.executeScript("window.scrollBy(0,4200)");

	Thread.sleep(3000);
	
	WebElement workshop= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[1]/div/div[2]/div/ul/a[4]/li"));
	workshop.click();
	
	Thread.sleep(3000);
	}
	@Test (priority= 25)
	  //TEST CASE NO 63
	  public void Bannerisdisplay() throws InterruptedException  {
  
	WebElement bannerimg= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]"));
	bannerimg.isDisplayed();
	
	Thread.sleep(3000);
}
}