package helpers;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import manager.DriverManager;

public class Pages 
{
	static WebDriver driver = DriverManager.getdriver();
	public static  WebElement findElement(By by)
	{
		try {
			return driver.findElement(by);
		}
		catch (Exception e) 
		{
			throw new NoSuchElementException(""+driver.findElement(by));
		}
	}
}