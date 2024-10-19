package pageclasses;

import org.openqa.selenium.WebElement;

public class Demo 
{
	private WebElement element;

	// Constructor to initialize with WebElement
	public Demo(WebElement element) {
		this.element = element;
	}

	// Click method, which allows method chaining
	public Demo  ClickOnElement() throws Exception {
		element.click();
		return this; // Return the same object for chaining
	}
	
	
	
	
}

