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

	public WebElement username=findElement(By.xpath("//*[@name='username']"));
	public	WebElement password=findElement(By.xpath("//*[@name='password']"));
	public	WebElement login=findElement(By.xpath("(//*[@class='button'])[1]"));
	public  WebElement LoginValiidationMsg=findElement(By.xpath("//*[@class='title']"));
	
	public void LoginAction() throws Exception 
	{
		WebElementExtension.EnterText(username, "Ishwar@demo");
		Thread.sleep(2000);
		WebElementExtension.EnterText(password, "Ish@123");
		Thread.sleep(2000);
		WebElementExtension.ClickOnElement(login);
	}

}
