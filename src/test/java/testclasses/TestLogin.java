package testclasses;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
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
		WebElementExtension.ElementContainsText(PageManager.login.LoginValiidationMsg, "ParaBank is a demo site used for demonstration");
		
	}
}
