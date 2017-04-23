package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pncbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver browser = new FirefoxDriver();
		
		
		browser.get("http://www.pnc.com");
		
		//click on search button
		
		browser.findElement(By.xpath("html/body/div[2]/header/div/div/div[1]/div/div[2]/form/fieldset/input[1]")).sendKeys("appication for credit card");
		
		
		//enter "application for credit cards and click
		browser.findElement(By.xpath("html/body/div[2]/header/div/div/div[1]/div/div[2]/form/fieldset/input[2]")).click();
		
		//click on PNC Credit cards
		
		//browser.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[3]/div[1]/div[3]/div")).click();
		
		//browser.findElement(By.xpath(".//*[@id='container']/div[2]/div[2]/div/div/div/div[1]/div/div/div/div[3]/div[1]/div[3]/div")).click();
		
		

		
		

	}

}
