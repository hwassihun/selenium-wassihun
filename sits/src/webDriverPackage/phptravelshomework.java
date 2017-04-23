package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class phptravelshomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver ();
		
		//launch phptravel web page
		
		driver. get("http://www.phptravels.net/");
		
		//Click on My Account (By Xpath)
		
		driver.findElement (By.xpath ("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")). click ();
		
		// Signup link (By Xpath)
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
		
	// Enter First name,Last name, Mobile number, Email, Password and Confirm password
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys ("Iyassu");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[4]/input")).sendKeys ("Elias");
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[5]/input")).sendKeys ("7037721329");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys ("I23mmpppp@yahoo.com");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[7]/input")).sendKeys ("23ki03");
		driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[8]/input")).sendKeys ("23ki03");
		
		
		//Click on Signout Button
		
		//driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click ();
		
		//driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")

		
		
	
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
		
		
		
		
	
		
		
		
		
		
		
		
		
	
		
		

	}

}
