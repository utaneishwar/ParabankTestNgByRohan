package testclasses;

import org.testng.annotations.Test;

import helpers.WebElementExtension;
import manager.DriverManager;
import manager.PageManager;

public class TestRegister extends BaseTest
{
	@Test
	public void verifyRegister() throws Exception
	{
		
		WebElementExtension.ClickOnElement(PageManager.register.registerlink);
		WebElementExtension.EnterText(PageManager.register.firstName,"ABC");
		WebElementExtension.EnterText(PageManager.register.lastName,"def");
		WebElementExtension.EnterText(PageManager.register.address,"Hyderabad");
		WebElementExtension.EnterText(PageManager.register.city,"guntur");
		WebElementExtension.EnterText(PageManager.register.state,"AP");
		WebElementExtension.EnterText(PageManager.register.zipcode,"442307");
		WebElementExtension.EnterText(PageManager.register.ssn,"1405");
		WebElementExtension.EnterText(PageManager.register.username,"ABC");
		WebElementExtension.EnterText(PageManager.register.password,"xyz@123");
		WebElementExtension.EnterText(PageManager.register.confirm,"xyz@123");
		WebElementExtension.WaitUntilELementVisible(PageManager.register.register, DriverManager.getdriver(), 10);
		WebElementExtension.ClickOnElement(PageManager.register.register);
	}
}
