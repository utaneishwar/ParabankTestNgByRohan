package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import manager.DriverManager;
import utillity.ReadProperty;



public class BaseTest 
{
	// hooks class
	public static WebDriver driver;
	@BeforeTest
	public static void Initialize() throws IOException
	{
		DriverManager.launchBrowser(ReadProperty.getproperrty("BrowserType"),ReadProperty.getproperrty("TestEnvUrl"));
	}

	@AfterTest
	public static void cleanup()
	{
	//	DriverManager.Closedriver();
	}
}
