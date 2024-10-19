package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.WebElementExtension;

public class SampleWebelement 
{
	WebDriver driver;
	public SampleWebelement (WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElementExtension getUsernameField() throws Exception {
		WebElementExtension samplemethod = (WebElementExtension) driver.findElement(By.xpath("//*[@name='username']")); ////*[@id='Email']
	return (WebElementExtension)samplemethod;
	}
	
}
