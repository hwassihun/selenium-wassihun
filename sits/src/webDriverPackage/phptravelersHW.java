package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class phptravelersHW {

	public static void main(String[] args) throws InterruptedException {
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
			
			
			
			
			
			int x=1;
			if (x==10){
					driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys ("hanwnhomework1@yahoo.com");
			}
			else{
				driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys ("hanwnhomework2@yahoo.com");
			}
			
					
					driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[7]/input")).sendKeys ("23ki03");
			driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[8]/input")).sendKeys ("23ki03");
			
			//click on sign up button
			driver.findElement(By.xpath("html/body/section/div/div/div/div/div[2]/div/form/div[9]/button")).click();
			
			Thread.sleep(5000);
			
			//click on sign out 
			
			driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a")).click();
			driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();

			
			
		
		
		
		
		

	}

}
