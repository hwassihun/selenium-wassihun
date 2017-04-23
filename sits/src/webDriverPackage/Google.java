package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1 Launch web browser
		
		WebDriver browser = new FirefoxDriver();
		
		//step 2 Enter http://www.google.com and click on on Enter Button
		
		browser.get("http://www.google.com");
		
		WebElement element = browser.findElement(By.name ("q")); element. sendKeys("Herndon Va");
		
		//step 3 Enter "Herndon, Va" click button
		
		//browser. findElement(BY.name ("q")).sendKeys ("Herndon VA");
		//click on search button   search results should be displayed
		
		browser.findElement(By.name("q")). sendKeys("Herndon, Va");
		
		browser.findElement(By.name("btnG")).click();
		
		
		
		
		

	}

}
