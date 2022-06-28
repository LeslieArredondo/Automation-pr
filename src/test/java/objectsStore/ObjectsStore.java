package objectsStore;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectsStore {

	WebDriver driver;
	public ObjectsStore(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@id='email']")
	public WebElement emailInput;
	
	@FindBy(xpath= "//input[@id='passwd']")
	public WebElement passwordInput;
	
	@FindBy(xpath= "//button[@id='SubmitLogin']")
	public WebElement signinButton;
	
	@FindBy(xpath= "//button[@name='Submit']")
	public WebElement addToCartButton;
	
	
	public WebElement loginbutton;
	
	
	public WebElement skipbutton;
	
	
	public WebElement articlesection;
	
	
}
