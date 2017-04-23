package webDriverPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mercurytour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=1;
		while (x<20)
		{
			
		
		
		
		WebDriver driver = new FirefoxDriver ();
		// Launch Mercury Website 
		driver.get("http://newtours.demoaut.com/");
		// print the title of the page
		driver.getTitle();
		//print 
		System.out.println(driver.getTitle());
// click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		//Enter first name
		driver.findElement(By.name("firstName")).sendKeys("Hanna");
		//Enter last name
		driver.findElement(By.name("lastName")).sendKeys("Wassihun");
		driver.findElement(By.name("phone")).sendKeys("7031256359");
		driver.findElement(By.name("userName")).sendKeys("Tester000+x+@gmail.com");
		
/*
		int x=1;
		if (x==10){
				driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys ("hanwnhomework1@yahoo.com");
		}
		else{
			driver.findElement(By.xpath("/html/body/section/div/div/div/div/div[2]/div/form/div[6]/input")).sendKeys ("hanwnhomework2@yahoo.com");
		}
*/		
		
		driver.findElement(By.name("userName")).sendKeys("heass@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("15 name st");
		driver.findElement(By.name("city")).sendKeys("Herndon");
		driver.findElement(By.name("state")).sendKeys("VA");
		driver.findElement(By.name("postalCode")).sendKeys("20369");
		driver.findElement(By.name("email")).sendKeys("hease@gmail.com");
		driver.findElement(By.name("password")).sendKeys("pass");
		driver.findElement(By.name("confirmPassword")).sendKeys("pass");
		driver.findElement(By.name("register")).click();
		driver.close();
		x=x+1;
		}
	}
	
}

