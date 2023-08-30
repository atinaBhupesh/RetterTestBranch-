package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class L_availbilityRequest 
{
	
		@FindBy(xpath="//span[text()=\"Availability Request\"]")private WebElement availabityRequest;
		@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/WeekendPlannings/list\"]")private WebElement availabityRequest2;
		@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
		@FindBy(xpath="//input[@id=\"title\"]")private WebElement availabilitytitle;
		@FindBy(xpath="//select[@id=\"PlanningResourcesIsRecursive\"]")private WebElement requestType;
		@FindBy(xpath="//input[@id=\"actionImmediateRequest1\"]")private WebElement sendImmediate;
		@FindBy(xpath="//span[text()=\"Select Department\"]")private WebElement selectDepartment;
		@FindBy(xpath="//input[@onchange=\"checkFirestation(this);\" and @value=\"1019\"]")private WebElement stationSaiMandir;
		@FindBy(xpath="//input[@onchange=\"checkFirestation(this);\" and @value=\"1020\"]")private WebElement stationTekdiMandir ;
		
		
		
		
		
		@FindBy(xpath="(//span[@class=\"slider round\"])[2]")private WebElement splitDayRequest;
		@FindBy(xpath="(//span[@class=\"slider round\"])[3]")private WebElement siftManagement;
		@FindBy(xpath="//input[@id=\"inputShift\"]")private WebElement enterShiftName;
		@FindBy(xpath="//button[@id=\"actionAddShift\"]")private WebElement addShift;
		@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
		@FindBy(xpath="//input[@id=\"from_date\"]")private WebElement startDate ;
		@FindBy(xpath="//input[@id=\"from_time\"]")private WebElement startTime;
		@FindBy(xpath="//input[@id=\"to_date\"]")private WebElement endDate;
		@FindBy(xpath="//input[@id=\"to_time\"]")private WebElement endTime;
		
		@FindBy(xpath="//input[@id=\"requested_datetime\"]")private WebElement requestStartDate ;
		@FindBy(xpath="//select[@id=\"requested_day_id\"]")private WebElement selectStardDay;
		@FindBy(xpath="//input[@id=\"timePicker1\"]")private WebElement requestTime;
		@FindBy(xpath="//select[@id=\"from_day_id\"]")private WebElement fromDay;
		@FindBy(xpath="//select[@id=\"to_day_id\"]")private WebElement toDay;
		@FindBy(xpath="//button[text()=\"Add More\"]")private WebElement  addDays;
		@FindBy(xpath="//input[@id=\"requested_datetime_multi2\"]")private WebElement date2;
		@FindBy(xpath="//input[@id=\"requested_datetime_multi1\"]")private WebElement multiRequestdate;
		@FindBy(xpath="//select[@id=\"multiple_from_day\"]")private WebElement multiStartDay;
		@FindBy(xpath="//input[@id=\"multiple_from_time\"]")private WebElement multiStartTime ;
		@FindBy(xpath="//select[@id=\"multiple_to_day\"]")private WebElement multiEndDay;
				@FindBy(xpath="//input[@id=\"multiple_to_time\"]")private WebElement multiEndTime;

				@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteAlarm;
				@FindBy(xpath="//button[@id=\"delYes1\"]")private WebElement deleteInfoYes;
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
		

	public L_availbilityRequest (WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	
	public void createAvailabilityRequestOneTimeImmediate (String date,String time,WebDriver driver) throws Throwable
	{
		Actions act= new Actions (driver);
		availabityRequest.click();
		Thread.sleep(2000);
		availabityRequest2.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		availabilitytitle.click();
		Thread.sleep(2000);
		act.sendKeys("AR-one time-send Immediate-"+date).perform();
		Thread.sleep(2000);
        Select se= new Select(requestType);
		se.selectByVisibleText("One time");
		Thread.sleep(2000);
		sendImmediate.click();
		Thread.sleep(2000);
		selectDepartment.click();
		Thread.sleep(2000);
		act.sendKeys("ngp").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		stationSaiMandir.click();
		Thread.sleep(2000);
		stationTekdiMandir.click();
		Thread.sleep(2000);
		startDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		startTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys("07.00").build().perform();
		Thread.sleep(2000);
		endDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		endTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys("23.59").build().perform();
		Thread.sleep(2000);
		
		splitDayRequest.click();
		Thread.sleep(2000);
		siftManagement.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("1St").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("2nd").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
	}
	
	public void createAvailabilityRequestOneTimeScedule (String date,String time,WebDriver driver) throws Throwable
	{
		Actions act= new Actions (driver);
		availabityRequest.click();
		Thread.sleep(2000);
		availabityRequest2.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		availabilitytitle.click();
		Thread.sleep(2000);
		act.sendKeys("AR-one time-schedule-"+date).perform();
		Thread.sleep(2000);
        Select se= new Select(requestType);
		se.selectByVisibleText("One time");
		Thread.sleep(2000);
		requestStartDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date +time).perform();
		Thread.sleep(2000);
		selectDepartment.click();
		Thread.sleep(2000);
		act.sendKeys("ngp").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		stationSaiMandir.click();
		Thread.sleep(2000);
		stationTekdiMandir.click();
		Thread.sleep(2000);
		startDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		startTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys("07.00").build().perform();
		Thread.sleep(2000);
		endDate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date).build().perform();
		Thread.sleep(2000);
		endTime.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys("23.59").build().perform();
		Thread.sleep(2000);
		
		splitDayRequest.click();
		Thread.sleep(2000);
		siftManagement.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("1St").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("2nd").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
	}
	
	public void createAvailabilityRequestRecursive (String date,String time,WebDriver driver) throws Throwable
	{
		Actions act= new Actions (driver);
		availabityRequest.click();
		Thread.sleep(2000);
		availabityRequest2.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		availabilitytitle.click();
		Thread.sleep(2000);
		act.sendKeys("AR-Recursive-"+date).perform();
		Thread.sleep(2000);
        Select se= new Select(requestType);
		se.selectByVisibleText("Recursive");
		Thread.sleep(2000);
		Select se2= new Select(selectStardDay);
		se2.selectByVisibleText("Sunday");
		Thread.sleep(2000);
		requestTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(time).perform();
		Thread.sleep(2000);
		selectDepartment.click();
		Thread.sleep(2000);
		act.sendKeys("ngp").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		stationSaiMandir.click();
		Thread.sleep(2000);
		stationTekdiMandir.click();
		Thread.sleep(2000);
		Select se3= new Select(fromDay);
		se3.selectByVisibleText("Monday");
		Thread.sleep(2000);
		Select se4= new Select(toDay);
		se4.selectByVisibleText("Saturday");
		Thread.sleep(2000);
						
		splitDayRequest.click();
		Thread.sleep(2000);
		siftManagement.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("1St").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("2nd").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
	}
	
	
	public void createAvailabilityRequestMultipleDay (String date,String time,WebDriver driver) throws Throwable
	{
		Actions act= new Actions (driver);
		availabityRequest.click();
		Thread.sleep(2000);
		availabityRequest2.click();
		Thread.sleep(2000);
		createNew.click();
		Thread.sleep(2000);
		availabilitytitle.click();
		Thread.sleep(2000);
		act.sendKeys("AR-Multiple days-"+date).perform();
		Thread.sleep(2000);
        Select se= new Select(requestType);
		se.selectByVisibleText("Multiple days");
		Thread.sleep(2000);
		multiRequestdate.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date +" 10.00" ).perform();
		Thread.sleep(2000);
		addDays.click();
		Thread.sleep(2000);
		date2.click();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys(date +" 10.01").perform();
		Thread.sleep(2000);
		selectDepartment.click();
		Thread.sleep(2000);
		act.sendKeys("ngp").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		stationSaiMandir.click();
		Thread.sleep(2000);
		stationTekdiMandir.click();
		Thread.sleep(2000);
		Select se2= new Select(multiStartDay);
		se2.selectByVisibleText("Monday");
		Thread.sleep(2000);
		multiStartTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys("10.01").perform();
		Thread.sleep(2000);
		Select se3= new Select(multiEndDay);
		se3.selectByVisibleText("Saturday");
		Thread.sleep(2000);
		multiEndTime.click();
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.sendKeys("05.00").perform();
		Thread.sleep(2000);
		splitDayRequest.click();
		Thread.sleep(2000);
		siftManagement.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("1St").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		enterShiftName.click();
		Thread.sleep(2000);
		act.sendKeys("2nd").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		addShift.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
		
		
	}
	
	
	
		
		
	

	public void deleteAvailabilityRequestOneTimeImmediate( WebDriver driver) throws Throwable {
		Actions act= new Actions (driver);
		availabityRequest.click();
		Thread.sleep(2000);
		availabityRequest2.click();
		Thread.sleep(2000);
		for	(int i=1;i<=10;i++)
		{
		deleteAlarm.click();
		Thread.sleep(2000);
		deleteInfoYes.click();
		Thread.sleep(5000);
		Reporter.log( "Availability request number-"+i+ " deleted sucessfully" , true );
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		
	}
		
	}
}
