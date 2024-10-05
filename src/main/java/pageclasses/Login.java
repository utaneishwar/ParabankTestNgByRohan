package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Pages;
import helpers.WebElementExtension;

public class Login extends Pages
{  
	WebDriver driver;
	public Login(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public WebElement username=driver.findElement(By.xpath("//*[@name='username']"));
	public WebElement password=driver.findElement(By.xpath("//*[@name='password']"));
	public WebElement login=driver.findElement(By.xpath("(//*[@class='button'])[1]"));
	public WebElement LoginValiidationMsg=driver.findElement(By.xpath("//*[@class='title']"));
	//*[@class='error']]
	public void LoginAction() throws Exception 
	{
		WebElementExtension.EnterText(username, "Ishwar@demo");
		Thread.sleep(2000);
		WebElementExtension.EnterText(password, "Ish@123");
		Thread.sleep(2000);
		WebElementExtension.ClickOnElement(login);
	}

}
