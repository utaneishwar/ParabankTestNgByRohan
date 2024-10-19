package testclasses;

import org.testng.annotations.Test;

import pageclasses.Demopage;

public class DemoTest extends BaseTest
{
	@Test
	public void testLogin() throws Exception {
		
		Demopage.getUsernameField().ClickOnElement();
		System.out.println("click on log in button");
	}
}
