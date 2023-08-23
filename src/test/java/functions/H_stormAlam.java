package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class H_stormAlam {
	
	
	        @FindBy(xpath="//span[text()=\"Storm\"]")private WebElement storm;
			@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Emergencies/index\"]")private WebElement manageEmergency;
			@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
			@FindBy(xpath="//span[text()=\"Select Department\"]")private WebElement selectDepartment;
			@FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement selectFireStation;
			@FindBy(xpath="//textarea[@placeholder=\"Enter title\"]")private WebElement enterTitle;
			@FindBy(xpath="//textarea[@placeholder=\"Enter description\"]")private WebElement enterDescription;
			@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement modeResource;
			@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll ;
			@FindBy(xpath="//textarea[@placeholder=\"Enter address\"]")private WebElement enterAlarmAdress ;
			@FindBy(xpath="//input[@id=\"locationDrag\"]")private WebElement dragMarker;
			@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement generateAlarm;
			@FindBy(xpath="//button[@id=\"addSubForm\"]")private WebElement addAlarm;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement ;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement ;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement ;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement ;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement ;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement;
			//@FindBy(xpath="")private WebElement ;
			//@FindBy(xpath="")private WebElement;
			
	
	
	public H_stormAlam (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void createrStormAlarm (String date,WebDriver driver) throws Throwable
	{
		storm.click();
		Thread.sleep(2000);
		manageEmergency.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		selectDepartment.click();
		Thread.sleep(2000);
		Actions act= new Actions (driver);
		act.sendKeys("ngp").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		selectFireStation.click();
		Thread.sleep(2000);
		act.sendKeys("sai").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		act.sendKeys("tekdi").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		enterTitle.click();
		Thread.sleep(2000);
		act.sendKeys("Storm alarm by attribute-"+date).perform();
		Thread.sleep(2000);
		enterDescription.click();
		Thread.sleep(2000);
		act.sendKeys("Storm alarm by attribute-checking-"+date).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		modeResource.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		enterAlarmAdress.click();
		Thread.sleep(2000);
		act.sendKeys("Empress Mill's Chawl, Road, Cotton Market, Empress City, Nagpur, Maharashtra 440018").perform();
		Thread.sleep(2000);
		dragMarker.click();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		generateAlarm.click();
		Thread.sleep(2000);
		addAlarm.click();
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
	}

}
