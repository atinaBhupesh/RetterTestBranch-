package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class E_loginClass {

	
	String dun="1015-IN-Pritam-G-5";
	String pw="123456";
		
	
	
	@FindBy(xpath="//input[@id=\"u\"]")private  WebElement userName;
	@FindBy(xpath="//input[@name=\"data[User][password]\"]")private WebElement password;
	@FindBy (xpath="//button[text()=\"Login\"]")private WebElement login;
	@FindBy (xpath="//select[@name=\"data[app_type]\"]")private WebElement lang;
	
	@FindBy(xpath="//a[@class=\"logout\"]")private  WebElement logOut;

	public E_loginClass (WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, this);
		Thread.sleep(2000);
	}


	public void departmentLogin(WebDriver driver) throws Throwable
	{
		userName.sendKeys(dun);
		Thread.sleep(1000);
	
	
		password.sendKeys(pw);
		Thread.sleep(1000);
	
	
	
		login.click();
		Thread.sleep(2000);
		
		
		
		Select se= new Select(lang);
		
		se.selectByVisibleText("English");
		Thread.sleep(1000);
		
	}
	
	
	public void logOut(WebDriver driver) throws Throwable
	{
		logOut.click();
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	
	
}
