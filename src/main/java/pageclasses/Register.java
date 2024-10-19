package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Pages;


public class Register extends Pages
{
	WebDriver driver;
	public Register(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 public WebElement registerlink() throws Exception {
	        return findElement(By.xpath("//*[text()='Register']")); ////*[@id='Email']
	    }

	    public  WebElement firstname() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.firstName']"));////*[@id='Password']
	    }

	    public  WebElement lastname() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.lastName']"));//(//*[text()='Log in'])[2]
	    }

	    public WebElement adress() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.address.street']")); ////*[@class='message-error validation-summary-errors']
	    }

	    public WebElement city() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.address.city']"));//(//*[text()='Log in'])[2]
	    }

	    public WebElement state() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.address.state']")); ////*[@class='message-error validation-summary-errors']
	    }
	    public WebElement zipcode ()throws Exception {
	        return findElement(By.xpath("//*[@id='customer.address.zipCode']"));//(//*[text()='Log in'])[2]
	    }
	    public WebElement phone ()throws Exception {
	        return findElement(By.xpath("//*[@id='customer.phoneNumber']"));//(//*[text()='Log in'])[2]
	    }
	    public WebElement ssn() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.ssn']")); ////*[@class='message-error validation-summary-errors']
	    }
	    public WebElement un() throws Exception {
	        return findElement(By.xpath("//*[@id='customer.username']")); ////*[@class='message-error validation-summary-errors']
	    }
	    public WebElement pw ()throws Exception {
	        return findElement(By.xpath("//*[@id='customer.password']"));//(//*[text()='Log in'])[2]
	    }

	    public WebElement confirm() throws Exception {
	        return findElement(By.xpath("//*[@id='repeatedPassword']")); ////*[@class='message-error validation-summary-errors']
	    }
//	//public WebElement registerlink=findElement(By.xpath("//*[text()='Register']"));
//	public WebElement registerlink=findElement(By.xpath("//*[@href='register.htm;jsessionid=ABA5C78984ECAF72B8A724DACF186276']"));
//
//  public WebElement firstName=findElement(By.xpath("//*[@id='customer.firstName']"));
//	public	WebElement lastName=findElement(By.xpath("//*[@id='customer.lastName']"));
//	public	WebElement address=findElement(By.xpath("//*[@id='customer.address.street']"));
//	public  WebElement city=findElement(By.xpath("//*[@id='customer.address.city']"));
//	public  WebElement state=findElement(By.xpath("//*[@id='customer.address.state']"));
//	public  WebElement zipcode=findElement(By.xpath("//*[@id='customer.phoneNumber']"));
//	public  WebElement ssn=findElement(By.xpath("//*[@id='customer.ssn']"));
// 	public  WebElement username=findElement(By.xpath("//*[@id='customer.username']"));
//	public	WebElement password=findElement(By.xpath("//*[@id='customer.password']"));
//  public	WebElement confirm=driver.findElement(By.xpath("//*[@id='repeatedPassword']"));
	    public WebElement register() throws Exception 
	    {
	        return findElement(By.xpath("//*[@value='Register']")); ////*[@class='message-error validation-summary-errors']
	    }
	    public WebElement validationoftext() throws Exception 
	    {
	        return findElement(By.xpath("//*[@id='rightPanel']/h1")); ////*[@class='message-error validation-summary-errors']
	    }
	    public WebElement validationofActualtext() throws Exception 
	    {
	        return findElement(By.xpath("//*[@id='rightPanel']/child::h1/following-sibling::p")); ////*[@class='message-error validation-summary-errors']
	    }

	  
	    
	    //public	WebElement register=findElement(By.xpath("(//*[@class='button'])[3]"));
}
