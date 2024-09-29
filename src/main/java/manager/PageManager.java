package manager;

import org.openqa.selenium.WebDriver;

import pageclasses.Login;
import pageclasses.Register;

public class PageManager       // object creation needed
{
	static WebDriver driver = DriverManager.getdriver();
	public static Login login =new Login(driver);
	public static Register register=new Register(driver);
//	public static Login login =new Login(driver);
//	public static Login login =new Login(driver);
	
}