package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class G_testAlarm {
	
	
	
		@FindBy(xpath="//span[text()=\"Test Alarm\"]")private WebElement testAlarm;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Alarms/test_list\"]")private WebElement list;
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
		@FindBy(xpath="//span[text()=\"Select Department\"]")private WebElement selectDepartment;
		@FindBy(xpath="//input[@placeholder=\"Select Firestation\"]")private WebElement selectFireStation;
		@FindBy(xpath="//textarea[@placeholder=\"Enter title\"]")private WebElement enterTitle;
		@FindBy(xpath="//textarea[@placeholder=\"Enter description\"]")private WebElement enterDescription;

		@FindBy(xpath="//input[@id=\"TestAlarmAlarmType\" and  @value=\"3\"]")private WebElement alarmTypePush;
		@FindBy(xpath="//input[@id=\"TestAlarmReminderStatus\"]")private WebElement setRemindar;
		@FindBy(xpath="//select[@id=\"TestAlarmReminderType\"]")private WebElement remindar;
		@FindBy(xpath="//input[@id=\"startDate\"]")private WebElement remindarDate;
		@FindBy(xpath="//input[@name=\"data[TestAlarm][reminder_time]\" ]")private WebElement remindarTime ;
		@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement modeAttribute;
		@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll ;
		@FindBy(xpath="//textarea[@placeholder=\"Enter address\"]")private WebElement enterAlarmAdress ;
		@FindBy(xpath="//input[@id=\"locationDrag\"]")private WebElement dragMarker;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
		
		@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement modeResource;
		
		@FindBy(xpath="//input[@id=\"inlineRadio2\" and @value=\"4\"]")private WebElement modeAlarmLoop;
		@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement modeFireFighter;
		
		

		@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteAlarm;
		@FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteYes;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/Alarms/testAlarmOverviews\"]")private WebElement  testAlarmDashboard;
		@FindBy(xpath="//button[@id=\"delRec\"]")private WebElement deleteYes1;
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
		//@FindBy(

			
				




			public G_testAlarm (WebDriver driver)
			{
			PageFactory.initElements(driver, this);
			}
			
			public void commonForTestAlarm (WebDriver driver) throws Throwable
			{
				
				testAlarm.click();
				Thread.sleep(2000);
				list.click();
				Thread.sleep(2000);
			}
			
			
			public void testAlarmByAttribute (String date,String time,WebDriver driver) throws Throwable
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
				act.sendKeys("Test alarm by attribute-"+date).perform();
				Thread.sleep(2000);
				enterDescription.click();
				Thread.sleep(2000);
				act.sendKeys("Test alarm by attribute-checking-"+date).perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.PAGE_DOWN).perform();
				Thread.sleep(2000);
				alarmTypePush.click();
				Thread.sleep(2000);
				setRemindar.click();
				Thread.sleep(2000);
				Select se= new Select(remindar);
				se.selectByVisibleText("One time");
				Thread.sleep(1000);
				remindarDate.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(date).build().perform();
				Thread.sleep(2000);
				remindarTime.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(time).build().perform();
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
				save.click();
				Thread.sleep(2000);

				
			}
			
			
			public void testAlarmByResource (String date,String time,WebDriver driver) throws Throwable
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
				act.sendKeys("Test alarm by resource-"+date).perform();
				Thread.sleep(2000);
				enterDescription.click();
				Thread.sleep(2000);
				act.sendKeys("Test alarm by resource-checking-"+date).perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.PAGE_DOWN).perform();
				Thread.sleep(2000);
				alarmTypePush.click();
				Thread.sleep(2000);
				setRemindar.click();
				Thread.sleep(2000);
				Select se= new Select(remindar);
				se.selectByVisibleText("One time");
				Thread.sleep(1000);
				remindarDate.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(date).build().perform();
				Thread.sleep(2000);
				remindarTime.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(time).build().perform();
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
				save.click();
				Thread.sleep(2000);

				
			}
			
			public void testAlarmByAlarmLoop (String date,String time,WebDriver driver) throws Throwable
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
				act.sendKeys("Test alarm by alarm loop -"+date).perform();
				Thread.sleep(2000);
				enterDescription.click();
				Thread.sleep(2000);
				act.sendKeys("Test alarm by alarm loop -checking-"+date).perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.PAGE_DOWN).perform();
				Thread.sleep(2000);
				alarmTypePush.click();
				Thread.sleep(2000);
				setRemindar.click();
				Thread.sleep(2000);
				Select se= new Select(remindar);
				se.selectByVisibleText("One time");
				Thread.sleep(1000);
				remindarDate.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(date).build().perform();
				Thread.sleep(2000);
				remindarTime.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(time).build().perform();
				Thread.sleep(2000);
				modeAlarmLoop.click();
				Thread.sleep(2000);
				selectAll.click();
				Thread.sleep(2000);
				enterAlarmAdress.click();
				Thread.sleep(2000);
				act.sendKeys("Mohan Nagar, Nagpur, Sampriti Nagar, Maharashtra 440014").perform();
				Thread.sleep(2000);
				dragMarker.click();
				Thread.sleep(2000);
				act.sendKeys(Keys.PAGE_DOWN).perform();
				Thread.sleep(2000);
				save.click();
				Thread.sleep(2000);

				
			}
			
			
			public void testAlarmByFirefighter (String date,String time,WebDriver driver) throws Throwable
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
				act.sendKeys("Test alarm by fire fighter-"+date).perform();
				Thread.sleep(2000);
				enterDescription.click();
				Thread.sleep(2000);
				act.sendKeys("Test alarm by fire fighter-checking-"+date).perform();
				Thread.sleep(2000);
				act.sendKeys(Keys.PAGE_DOWN).perform();
				Thread.sleep(2000);
				alarmTypePush.click();
				Thread.sleep(2000);
				setRemindar.click();
				Thread.sleep(2000);
				Select se= new Select(remindar);
				se.selectByVisibleText("One time");
				Thread.sleep(1000);
				remindarDate.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(date).build().perform();
				Thread.sleep(2000);
				remindarTime.click();
				Thread.sleep(2000);
				act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
				Thread.sleep(1000);
				act.sendKeys(time).build().perform();
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
				save.click();
				Thread.sleep(2000);

				
			}

			
			
			public void deleteTestAlarmFromList (WebDriver driver) throws Throwable
			{
			
				testAlarm.click();
				Thread.sleep(2000);
				list.click();
				Thread.sleep(3000);
				
				for	(int i=1;i<=7;i++)
				{
				deleteAlarm.click();
				Thread.sleep(2000);
				deleteYes.click();
				Thread.sleep(5000);
				Reporter.log( "Test alarm number-"+i+ " deleted sucessfully from list" , true );
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				
				}
				
				
				}
				
			
			
			
			
			
			

			public void deleteTestAlarmFromDashboard (WebDriver driver) throws Throwable
			{
			
				testAlarm.click();
				Thread.sleep(2000);
				testAlarmDashboard.click();
				Thread.sleep(3000);
				
				for	(int i=1;i<=7;i++)
				{
				deleteAlarm.click();
				Thread.sleep(2000);
				deleteYes1.click();
				Thread.sleep(5000);
				Reporter.log( "Test alarm number-"+i+ " deleted sucessfully from dashboard." , true );
				driver.navigate().refresh();
				Thread.sleep(2000);
				
				
				}
				
				
				}
				

}
