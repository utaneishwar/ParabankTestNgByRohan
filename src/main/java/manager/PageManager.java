package manager;

import org.openqa.selenium.WebDriver;

import pageclasses.Login;
import pageclasses.Register;
import pageclasses.SampleWebelement;

public class PageManager        // object creation needed
{
	public static WebDriver driver=DriverManager.getdriver();
	public static Login login=new Login(driver);
	public static SampleWebelement sample=new SampleWebelement(driver);
//	public static WebDriver driver = DriverManager.getdriver();
//	public static Login login =new Login(driver);
	public static Register register=new Register(driver);
	//	public static Login login =new Login(driver);
	//	public static Login login =new Login(driver);
	

}