package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home
{
	WebDriver driver;
	public Home(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement username=driver.findElement(By.xpath("//*[@name='username']"));
	public WebElement password=driver.findElement(By.xpath("//*[@name='password']"));
	public WebElement login=driver.findElement(By.xpath("(//*[@class='button'])[1]"));
	public WebElement LoginValiidationMsg=driver.findElement(By.xpath("//*[@class='title']"));

	public void LoginAction() throws Exception 
	{
	}
}
