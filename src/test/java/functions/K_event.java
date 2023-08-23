package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class K_event {
	
	@FindBy(xpath="//span[text()=\"Calendar\"]")private WebElement calendar;
	@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Informations/index\"]")private WebElement manageInfo;
	@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
	@FindBy(xpath="//span[text()=\"Select Department\"]")private WebElement selectDepartment;
	@FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement selectFireStation;
	
	@FindBy(xpath="//select[@id=\"selectType\"]")private WebElement selectType;
	@FindBy(xpath="//input[@placeholder=\"Enter german title\"]")private WebElement enterInfoTitle;
	@FindBy(xpath="//input[@placeholder=\"Enter location\"]")private WebElement location;
	@FindBy(xpath="//textarea[@placeholder=\"Enter description\"]")private WebElement enterDescription;
	@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement modeAttribute;
	@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll ;
	@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
	@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement modeResource;
	@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement modeFireFighter;
	
	@FindBy(xpath="//input[@id=\"inlineRadio4\"]")private WebElement modeMonitorInfo;
	@FindBy(xpath="//input[@id=\"startDate\"]")private WebElement eventStartDate;
	@FindBy(xpath="//input[@id=\"endDate\"]")private WebElement eventEndDate;
	@FindBy(xpath="//input[@id=\"startTime\"]")private WebElement eventStartTime ;
	@FindBy(xpath="//input[@id=\"endTime\"]")private WebElement EventEndTime;
	@FindBy(xpath="//label[text()=\"Set Reminder\"]")private WebElement setRemindar;
	@FindBy(xpath="//select[@id=\"InformationReminderType\"]")private WebElement selecrRemindarType;
	@FindBy(xpath="//select[@id=\"InformationReminderMin\"]")private WebElement selectMin;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement;
	
	
	public K_event (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void createInfoByAttri (String date,String time,WebDriver driver) throws Throwable
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
		Select se= new Select(selectType);
		se.selectByVisibleText("Event");
		Thread.sleep(2000);
		eventStartDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		eventEndDate.click();
		act.sendKeys(date).perform();
		Thread.sleep(2000);
		eventStartTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(time).build().perform();
		Thread.sleep(2000);
		EventEndTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys("23.59").build().perform();
		Thread.sleep(2000);
		setRemindar.click();
		Thread.sleep(2000);
		Select se2= new Select(selecrRemindarType);
		se2.selectByVisibleText("One time");
		Thread.sleep(2000);
		Select se3= new Select(selectMin);
		se3.selectByVisibleText("3");
		Thread.sleep(2000);
		enterInfoTitle.click();
		Thread.sleep(2000);
		act.sendKeys("Adding event by attribute-"+date).perform();
		Thread.sleep(2000);
		location.click();
		act.sendKeys("pune").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("Adding event by attribute-checking-"+date).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		modeAttribute.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	public void createInfoByResource (String date,String time,WebDriver driver) throws Throwable
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
		Select se= new Select(selectType);
		se.selectByVisibleText("Event");
		Thread.sleep(2000);
		eventStartDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		eventEndDate.click();
		act.sendKeys(date).perform();
		Thread.sleep(2000);
		eventStartTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(time).build().perform();
		Thread.sleep(2000);
		EventEndTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys("23.59").build().perform();
		Thread.sleep(2000);
		setRemindar.click();
		Thread.sleep(2000);
		Select se2= new Select(selecrRemindarType);
		se2.selectByVisibleText("One time");
		Thread.sleep(2000);
		Select se3= new Select(selectMin);
		se3.selectByVisibleText("3");
		Thread.sleep(2000);
		enterInfoTitle.click();
		Thread.sleep(2000);
		act.sendKeys("Adding event by resource-"+date).perform();
		Thread.sleep(2000);
		location.click();
		act.sendKeys("pune").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("Adding event by resource-checking-"+date).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		modeResource.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
		
	}
	
	
	public void createInfoByFireFighte (String date,String time,WebDriver driver) throws Throwable
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
		Select se= new Select(selectType);
		se.selectByVisibleText("Event");
		Thread.sleep(2000);
		eventStartDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		eventEndDate.click();
		act.sendKeys(date).perform();
		Thread.sleep(2000);
		eventStartTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys(time).build().perform();
		Thread.sleep(2000);
		EventEndTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		act.sendKeys("23.59").build().perform();
		Thread.sleep(2000);
		setRemindar.click();
		Thread.sleep(2000);
		Select se2= new Select(selecrRemindarType);
		se2.selectByVisibleText("One time");
		Thread.sleep(2000);
		Select se3= new Select(selectMin);
		se3.selectByVisibleText("3");
		Thread.sleep(2000);
		enterInfoTitle.click();
		Thread.sleep(2000);
		act.sendKeys("Adding event by fire fighter-"+date).perform();
		Thread.sleep(2000);
		location.click();
		act.sendKeys("pune").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("Adding event by fire fighter-checking-"+date).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		modeFireFighter.click();
		Thread.sleep(2000);
		selectAll.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
