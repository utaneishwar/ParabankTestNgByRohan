package testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoRegisterClass 
{
	
	@Test
	public void verifyRegister()
	{
		//driver =new ChromeDriver();
		
		WebDriver driver= null;
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register");
		driver.findElement(By.xpath("//*[text()='Register']")).click();
		driver.findElement(By.xpath("//*[@id='customer.firstName']")).sendKeys("ishwar");
		driver.findElement(By.xpath("//*[@id='customer.lastName']")).sendKeys("utane");
		System.out.println(driver.getTitle());	
				
	}
}
