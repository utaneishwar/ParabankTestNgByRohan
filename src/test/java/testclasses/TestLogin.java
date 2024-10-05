package testclasses;

import org.testng.annotations.Test;

import helpers.WebElementExtension;
import manager.DriverManager;
import manager.PageManager;

public class TestLogin extends BaseTest
{
	@Test
	public void VerifyLoginPage() throws Exception 
	{
		PageManager.login.LoginAction();
	   WebElementExtension.WaitUntilELementVisible(PageManager.login.LoginValiidationMsg, DriverManager.getdriver(), 10);
		Thread.sleep(2000);
		//WebElementExtension.ElementContainsText(PageManager.login.LoginValiidationMsg, "ParaBank is a demo site used for demonstration of Parasoft software solutions");
	}
}
