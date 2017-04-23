
package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Creditcardregistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//open BOA web page
		driver.get("https://www.creditkarma.com/");
		//click on get your free score
		driver.findElement(By.linkText("Get your free scores")).click();
		//Enter email address
		driver.findElement(By.id("email")).sendKeys("hwer@hotmail.com");
		//confirm email address
		driver.findElement(By.id("retypeemail")).sendKeys("hwer@hotmail.com");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("12365");
		//Confirm password
		driver.findElement(By.id("retypepw")).sendKeys("12365");
		//Enter security question
		driver.findElement(By.id("secqcode")).click();
		//
		driver.findElement(By.id("secqcode")).sendKeys("What high school did you go to?");
		driver.findElement(By.id("secqcode")).sendKeys("bk");
		driver.findElement(By.id("secqans")).sendKeys("orange");
		driver.findElement(By.id("submitImage")).click();
		
		
		
		
		
		
		
		
	}

}
