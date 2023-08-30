package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class J_information {

	
	
	
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
	@FindBy(xpath="//input[@id=\"InfoStartDate\"]")private WebElement moniInfoStartDate;
	@FindBy(xpath="//input[@id=\"InfoEndDate\"]")private WebElement moniInfoEndDate;
	@FindBy(xpath="//input[@id=\"InfoStartTime\"]")private WebElement moniInfoStartTime ;
	@FindBy(xpath="//input[@id=\"InfoEndTime\"]")private WebElement moniInfoEndTime;

	@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteAlarm;
	@FindBy(xpath="//button[@id=\"call_delete_ajax\"]")private WebElement deleteInfoYes;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(xpath="")private WebElement ;
	//@FindBy(xpath="")private WebElement;
	//@FindBy(

		
			




		public J_information (WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		}
		

		public void commonForInfo (String date,String time,WebDriver driver) throws Throwable
		{
			
			calendar.click();
			Thread.sleep(2000);
			manageInfo.click();
			Thread.sleep(2000);
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
			se.selectByVisibleText("Information");
			Thread.sleep(2000);
			enterInfoTitle.click();
			Thread.sleep(2000);
			act.sendKeys("Adding information by attribute-"+date).perform();
			Thread.sleep(2000);
			location.click();
			act.sendKeys("nagpur").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys("Adding information by attribute-checking-"+date).perform();
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
		
		
	
		


		public void createInfoByResource(String date, String time, WebDriver driver) throws Throwable 
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
			se.selectByVisibleText("Information");
			Thread.sleep(2000);
			enterInfoTitle.click();
			Thread.sleep(2000);
			act.sendKeys("Adding information by resource-"+date).perform();
			Thread.sleep(2000);
			location.click();
			act.sendKeys("nagpur").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys("Adding information by by resource-checking-"+date).perform();
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


		public void createInfoByFireFighter(String date, String time, WebDriver driver) throws Throwable 
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
			se.selectByVisibleText("Information");
			Thread.sleep(2000);
			enterInfoTitle.click();
			Thread.sleep(2000);
			act.sendKeys("Adding information by fire fighter-"+date).perform();
			Thread.sleep(2000);
			location.click();
			act.sendKeys("nagpur").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys("Adding information by fire fighter-checking-"+date).perform();
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
	
	
		public void createMonitorInfoFullDay(String date, String time, WebDriver driver) throws Throwable 
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
			se.selectByVisibleText("Information");
			Thread.sleep(2000);
			enterInfoTitle.click();
			Thread.sleep(2000);
			act.sendKeys("Adding monitor information - full day-"+date).perform();
			Thread.sleep(2000);
			location.click();
			act.sendKeys("nagpur").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys("Adding monitor information - full day - checking-"+date).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			modeMonitorInfo.click();
			Thread.sleep(2000);
			selectAll.click();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			moniInfoStartDate.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(date).build().perform();
			Thread.sleep(2000);
			moniInfoEndDate.click();
			act.sendKeys(date).perform();
			Thread.sleep(2000);
			moniInfoStartTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys("00.05").build().perform();
			Thread.sleep(2000);
			moniInfoEndTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys("23.59").build().perform();
			Thread.sleep(2000);
			save.click();
			Thread.sleep(2000);
		}
		
		public void createMonitorInfoFuture(String date, String time, WebDriver driver) throws Throwable 
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
			se.selectByVisibleText("Information");
			Thread.sleep(2000);
			enterInfoTitle.click();
			Thread.sleep(2000);
			act.sendKeys("Adding monitor information - future -"+date).perform();
			Thread.sleep(2000);
			location.click();
			act.sendKeys("nagpur").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys("Adding monitor information - future - checking-"+date).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			modeMonitorInfo.click();
			Thread.sleep(2000);
			selectAll.click();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			moniInfoStartDate.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(date).build().perform();
			Thread.sleep(2000);
			moniInfoEndDate.click();
			act.sendKeys(date).perform();
			Thread.sleep(2000);
			moniInfoStartTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(time).build().perform();
			Thread.sleep(2000);
			moniInfoEndTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys("23.59").build().perform();
			Thread.sleep(2000);
			save.click();
			Thread.sleep(2000);
		}
		
		public void createMonitorInfoAboutToComplate(String date, String time, WebDriver driver) throws Throwable 
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
			se.selectByVisibleText("Information");
			Thread.sleep(2000);
			enterInfoTitle.click();
			Thread.sleep(2000);
			act.sendKeys("Adding monitor information - going to end -"+date).perform();
			Thread.sleep(2000);
			location.click();
			act.sendKeys("nagpur").perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.TAB).perform();
			Thread.sleep(2000);
			act.sendKeys("Adding monitor information -going to end - checking-"+date).perform();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			modeMonitorInfo.click();
			Thread.sleep(2000);
			selectAll.click();
			Thread.sleep(2000);
			act.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			moniInfoStartDate.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(date).build().perform();
			Thread.sleep(2000);
			moniInfoEndDate.click();
			act.sendKeys(date).perform();
			Thread.sleep(2000);
			moniInfoStartTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys("00.05").build().perform();
			Thread.sleep(2000);
			moniInfoEndTime.click();
			Thread.sleep(2000);
			act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(1000);
			act.sendKeys(time).build().perform();
			Thread.sleep(2000);
			save.click();
			Thread.sleep(2000);
		}
		
		
		public void deleteInfoAndEvent (WebDriver driver) throws Throwable
		{
			
			calendar.click();
			Thread.sleep(2000);
			manageInfo.click();
			Thread.sleep(2000);
			
			for	(int i=1;i<=10;i++)
			{
			deleteAlarm.click();
			Thread.sleep(2000);
			deleteInfoYes.click();
			Thread.sleep(5000);
			Reporter.log( "Information number-"+i+ " deleted sucessfully" , true );
			driver.navigate().refresh();
			Thread.sleep(2000);
			
			
			}
			
			
			
		}
		
		
	
	
	
}
