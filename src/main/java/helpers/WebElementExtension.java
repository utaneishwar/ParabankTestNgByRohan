package helpers;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import dev.failsafe.internal.util.Assert;
import manager.DriverManager;

public class WebElementExtension   // reusable methods for element
{
	public static void ClickOnElement(WebElement element)throws Exception
	{
		if(!element.isDisplayed() || !element.isEnabled())
		{
			throw new Exception("element is not clickable");   // parent 
		}
		try
		{
			element.click();
		} 
		catch (Exception e) 
		{
			JavascriptExecutor js =(JavascriptExecutor)(DriverManager.getdriver());
			js.executeScript("arguments[0].click();", element);
		}
		
	}
	public static void EnterText(WebElement element, String text) throws Exception
	{
	if(element==null) throw new IllegalArgumentException();
		element.clear();
		element.sendKeys(text);
	}
	public static void ElementContainsText(WebElement element, String expectedText)
	{
		String actualText=element.getText();
		Assert.isTrue(actualText.contains(expectedText)," element does not contains " +expectedText+" it contains "+actualText);
	}
	public static void WaitUntilELementVisible(WebElement element, WebDriver driver, int TimoutinSeconds)
	{
	    WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(TimoutinSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	// reuse 
	static WebElement element;
	public void ClickOnButton()throws Exception
	{
		if(!element.isDisplayed() || !element.isEnabled())
		{
			throw new Exception("element is not clickable");   // parent 
		}
		try
		{
			element.click();
		} 
		catch (Exception e) 
		{
			JavascriptExecutor js =(JavascriptExecutor)(DriverManager.getdriver());
			js.executeScript("arguments[0].click();", element);
		}
		
	}
}
