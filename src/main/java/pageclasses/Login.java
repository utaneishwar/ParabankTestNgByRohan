package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Pages;
import helpers.WebElementExtension;
import manager.DriverManager;

public class Login extends Pages
{  
	private WebDriver driver;

	// Constructor accepting WebDriver instance
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}

	// Lazy initialization using getter methods
	public WebElement getUsernameField() throws Exception {
		return findElement(By.xpath("//*[@name='username']")); ////*[@id='Email']
	}

	public WebElement getPasswordField() throws Exception {
		return findElement(By.xpath("//*[@name='password']"));////*[@id='Password']
	}
	public WebElement getLoginButton() throws Exception {
		return findElement(By.xpath("(//*[@class='button'])[2]")) ;//(//*[text()='Log in'])[2]
	}

	public WebElement getLoginValidationMsg() throws Exception {
		return findElement(By.xpath("//*[@id='rightPanel']/h1")); ////*[@class='message-error validation-summary-errors']
	}
	public WebElement errortext() throws Exception {
		return findElement(By.xpath("//*[@id='rightPanel']/child::h1/following-sibling::p")); ////*[@class='message-error validation-summary-errors']
	}
	//*[text()='Error!']
	// Perform login action
	public void LoginAction() throws Exception 
	{
		try
		{
			Thread.sleep(3000);
			WebElementExtension.EnterText(getUsernameField(), "niteshbothale@123gmail.com");
			Thread.sleep(2000);
			WebElementExtension.EnterText(getPasswordField(), "nitesh@123");
			Thread.sleep(2000);
			WebElementExtension.ClickOnElement(getLoginButton());
			Thread.sleep(2000);

		}
		catch (Exception e)
		{
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}