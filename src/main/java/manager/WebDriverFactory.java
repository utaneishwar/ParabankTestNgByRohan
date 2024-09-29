package manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class WebDriverFactory {
	static WebDriver driver;
	public static WebDriver CreateWebDriver(String BrowserType)
	{
		switch (BrowserType) 
		{
		case "Chrome":
			driver=CreateChromeDriver();
			break;
		default:
			throw new IllegalArgumentException();
		}
		return driver;
	}
	// maximized the browser
	public static WebDriver CreateChromeDriver()
	{
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--start-maximized");
		driver =new ChromeDriver(Options);
		return driver;
	}
//	public static WebDriver CreateEdgeDriver()
//	{
//		EdgeOptions Options = new EdgeOptions();
//		Options.addArguments("--start-maximized");
//		driver =new EdgeDriver(Options);
//		return driver;
//	}
//	public static WebDriver CreateFirefoxDriver()
//	{
//		FirefoxOptions Options = new FirefoxOptions();
//		Options.addArguments("--start-maximized");
//		driver =new FirefoxDriver(Options);
//		return driver;
//	}
//case "Edge":
//	driver=CreateEdgeDriver();
//	break;
//	
//case "Firefox":
//	driver=CreateFirefoxDriver();
//	break;
//	
}
