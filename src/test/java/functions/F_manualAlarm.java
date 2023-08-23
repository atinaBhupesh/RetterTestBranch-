package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_manualAlarm {
	
	@FindBy(xpath="//span[text()=\"Alarm\"]")private WebElement Alarm;
	@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Alarms/index\"]")private WebElement manageAlarm;
	@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
	@FindBy(xpath="//span[text()=\"Select Department\"]")private WebElement selectDepartment;
	@FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement selectFireStation;
	@FindBy(xpath="//textarea[@placeholder=\"Enter title\"]")private WebElement enterTitle;
	@FindBy(xpath="//textarea[@placeholder=\"Enter description\"]")private WebElement enterDescription;
	@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement modeAttribute;
	@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll ;
	@FindBy(xpath="//textarea[@placeholder=\"Enter address\"]")private WebElement enterAlarmAdress ;
	@FindBy(xpath="//input[@id=\"locationDrag\"]")private WebElement dragMarker;
	@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement generateAlarm;
	@FindBy(xpath="//button[@id=\"addSubForm\"]")private WebElement addAlarm;
	
	@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement modeResource;
	@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement modeFireFighter;
	
	//chat
	@FindBy(xpath="(//a[text()=\"Chat\"])[3]")private WebElement chat1;
	@FindBy(xpath="//input[@placeholder=\"Write your message...\"]")private WebElement enterMassage;
	@FindBy(xpath="//i[@class=\"fa fa-paper-plane\"]")private WebElement sendMassage;
	
	@FindBy(xpath="(//a[text()=\"Chat\"])[2]")private WebElement chat2;
	@FindBy(xpath="(//a[text()=\"Chat\"])[1]")private WebElement chat3;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;
	
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;



		
			




		public F_manualAlarm (WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		
		public void commonForManualAlarm (WebDriver driver) throws Throwable
		{
			
			Alarm.click();
			Thread.sleep(2000);
			manageAlarm.click();
			Thread.sleep(2000);
		}
		
		
		public void manualAlarmByAttribute (String date,WebDriver driver) throws Throwable
		{
			
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
			act.sendKeys("manual alarm by attribute-"+date).perform();
			Thread.sleep(2000);
			enterDescription.click();
			Thread.sleep(2000);
			act.sendKeys("manual alarm by attribute-checking-"+date).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			modeAttribute.click();
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

		public void manualAlarmByResourece(String date,WebDriver driver) throws Throwable
		{
			
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
			act.sendKeys("manual alarm by resource-"+date).perform();
			Thread.sleep(2000);
			enterDescription.click();
			Thread.sleep(2000);
			act.sendKeys("manual alarm by resource-checking-"+date).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			modeResource.click();
			Thread.sleep(2000);
			selectAll.click();
			Thread.sleep(2000);
			enterAlarmAdress.click();
			Thread.sleep(2000);
			act.sendKeys("AH46, Variety Square, Sitabuldi, Nagpur, Maharashtra 440010").perform();
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

		public void manualAlarmByFireFighter(String date,WebDriver driver) throws Throwable
		{
			
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
			act.sendKeys("manual alarm by fire fighter-"+date).perform();
			Thread.sleep(2000);
			enterDescription.click();
			Thread.sleep(2000);
			act.sendKeys("manual alarm by fire fighter-checking-"+date).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			modeFireFighter.click();
			Thread.sleep(2000);
			selectAll.click();
			Thread.sleep(2000);
			enterAlarmAdress.click();
			Thread.sleep(2000);
			act.sendKeys("Medisearch Lifesciences Pvt. Ltd, 44, SPANV, Kingsway Rd, near Kasturchand Park, Nagpur, Maharashtra 440001").perform();
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
		
		public void sendMassageAttribute(String date, WebDriver driver) throws Throwable
		{
			chat1.click();
			Thread.sleep(2000);
			enterMassage.click();
			Thread.sleep(2000);
			Actions act= new Actions (driver);
			act.sendKeys("chat-attribute").perform();
			Thread.sleep(2000);
			sendMassage.click();
			Thread.sleep(2000);
			
		}
		
		public void sendMassageResource (String date, WebDriver driver) throws Throwable
		{
			chat2.click();
			Thread.sleep(2000);
			enterMassage.click();
			Thread.sleep(2000);
			Actions act= new Actions (driver);
			act.sendKeys("chat-Resource").perform();
			Thread.sleep(2000);
			sendMassage.click();
			Thread.sleep(2000);
			
		}
		
		public void sendMassageFireFighter (String date, WebDriver driver) throws Throwable
		{
			chat3.click();
			Thread.sleep(2000);
			enterMassage.click();
			Thread.sleep(2000);
			Actions act= new Actions (driver);
			act.sendKeys("chat-FireFighter").perform();
			Thread.sleep(2000);
			sendMassage.click();
			Thread.sleep(2000);
			
		}
		
		
		


}
			
		
		
		


