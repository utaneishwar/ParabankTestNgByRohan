package testclasses;

import org.testng.annotations.Test;

import helpers.WebElementExtension;
import manager.DriverManager;
import manager.PageManager;

public class TestLogin extends BaseTest  //chrome ||  https://demo.nopcommerce.com/login  
{
	@Test
	public void VerifyLoginPage() throws Exception 
	{
		PageManager.login.LoginAction(); 
		//WebElementExtension.WaitUntilELementVisible(PageManager.login.getLoginValidationMsg(), DriverManager.getdriver(), 10);
		Thread.sleep(2000);
		WebElementExtension.ElementContainsText(PageManager.login.getLoginValidationMsg(), "Accounts Overview");
		Thread.sleep(3000);
		WebElementExtension.ClickOnElement(PageManager.login.logout()); //, "An internal error has occurred and has been logged.");
//		//WebElementExtension.ElementContainsText(PageManager.login.errortext(), "bjabgan");

		System.out.println("get message successfully");
	}
}
