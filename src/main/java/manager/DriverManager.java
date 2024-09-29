package manager;

import org.openqa.selenium.WebDriver;

public  class DriverManager
{
	public static WebDriver driver;

	public static void launchBrowser(String BrowserType,String BaseUrl)
	{
		if(driver!=null)
		{
			throw new IllegalArgumentException();
		}
		driver=WebDriverFactory.CreateWebDriver(BrowserType);  // firefox  // edge 
		driver.get(BaseUrl); 
	}

	public static WebDriver getdriver()
	{
		return driver;
	}

	public static void Closedriver()
	{
		 driver.quit();
	}
}
