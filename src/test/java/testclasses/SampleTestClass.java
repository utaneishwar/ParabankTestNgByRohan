package testclasses;

import org.testng.annotations.Test;

import manager.PageManager;

public class SampleTestClass extends BaseTest 
{
	@Test
	public void username() throws Exception
	{
		PageManager.sample.getUsernameField().ClickOnButton();
		System.out.println("our gode get execute successfully");
	}
}
