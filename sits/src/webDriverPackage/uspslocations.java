package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uspslocations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//step 1 open web browser
		//web browser is opened
		
		WebDriver browser = new FirefoxDriver();
		
		//step 2 Enter https://www.usps.com/and click on on Enter Button
		//usps page should be displayed
		
		browser.get("http://www.usps.com");
		
		//step 3 Click on Quick Tools
		//Quick Tools page should be displayed
		
		browser.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span")).click();
		
		//Step 4 click on find locations 
		
		browser.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")).click();
		
		//step 5 enter zip code then click on search button
		
		
		browser.findElement(By.xpath(".//*[@id='tCityStateZip']")).sendKeys ("20136");
		
		//wait for 5 sec for search button to enable
	    
		Thread.sleep(5000);
	
		browser.findElement(By.xpath(".//*[@id='bSearch']")).click();
		
		
		//close browser
		
		browser.close();
		
		
		
		
		
		
		
		
		

	}

	
		
	}


