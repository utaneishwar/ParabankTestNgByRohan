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
		
		WebElementExtension.ClickOnElement(PageManager.register.registerlink());
		WebElementExtension.EnterText(PageManager.register.firstname(),"ABC");
		WebElementExtension.EnterText(PageManager.register.lastname(),"def");
		WebElementExtension.EnterText(PageManager.register.adress(),"Hyderabad");
		WebElementExtension.EnterText(PageManager.register.city(),"guntur");
		WebElementExtension.EnterText(PageManager.register.state(),"AP");
		WebElementExtension.EnterText(PageManager.register.zipcode(),"442307");
		WebElementExtension.EnterText(PageManager.register.phone(),"8975780260");
		WebElementExtension.EnterText(PageManager.register.ssn(),"1405");
		WebElementExtension.EnterText(PageManager.register.un(),"Mona");
		WebElementExtension.WaitUntilELementVisible(PageManager.register.un(), DriverManager.getdriver(), 10);
		WebElementExtension.EnterText(PageManager.register.pw(),"Mona@123");
		WebElementExtension.WaitUntilELementVisible(PageManager.register.pw(), DriverManager.getdriver(), 10);
		WebElementExtension.EnterText(PageManager.register.confirm(),"Mona@123");
		Thread.sleep(2000);
		WebElementExtension.ClickOnElement(PageManager.register.register());
		Thread.sleep(2000);
		WebElementExtension.ElementContainsText(PageManager.register.validationofActualtext(), "Your account was created successfully. You are now logged in.");
		System.out.println("succcess get we have");
	}
}
