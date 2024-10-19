package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import manager.DriverManager;

public class Demopage
{
	static WebDriver driver ;
	public static Demo getUsernameField() throws Exception 
	{
//		driver= DriverManager.getdriver();
//	    WebElement element = driver.findElement(By.xpath("(//*[@class='button'])[2]"));
//	    return new Demo(element); // Wrap it in CustomWebElement
	    return new Demo(DriverManager.getdriver().findElement(By.xpath("(//*[@class='button'])[2]")));

	}
}
