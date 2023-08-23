package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_homePage {
	@FindBy(xpath="//span[text()=\"Dashboard\"]")private  WebElement dashboard;
	@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/dashboard/index\"]")private  WebElement dashboard2;
	@FindBy(xpath="//img[@src=\"/img/logoicon.png\"]")private  WebElement retter ;
	//@FindBy(xpath="")private  WebElement ;
	//@FindBy(xpath="")private  WebElement ;
	//@FindBy(xpath="")private  WebElement ;
	
	
	public D_homePage (WebDriver driver) throws Throwable {
		PageFactory.initElements(driver, this);
		Thread.sleep(2000);
	}


	public void backTodashboard(WebDriver driver) throws Throwable
	{	
		driver.navigate().refresh();
		Thread.sleep(2000);
//		dashboard.click();
//		Thread.sleep(2000);
//		dashboard2.click();
//		Thread.sleep(2000);
		retter.click();
		Thread.sleep(4000);
	}

	
}
