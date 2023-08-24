package functions;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_testClass extends B_baseClass {
	String date="22.08.2023";
	String time= "16.00";// please add +15 min of current time og german time 
	
	E_loginClass BC; 
	D_homePage HP;
	F_manualAlarm MA; 
	G_testAlarm TA;
	H_stormAlam SA; 
	I_escalation esc;
	J_information info;
	K_event eve;
	L_availbilityRequest req;
	
	
	@BeforeClass
	public void LoginDeprrmentUser () throws Throwable
	{
		
		lounchBrowser();
		BC = new E_loginClass (driver); 
		BC.departmentLogin(driver);
		Reporter.log("Department User login completed successfully", true );
		HP= new D_homePage(driver);
		MA = new F_manualAlarm (driver);
		TA= new G_testAlarm (driver);
		SA = new H_stormAlam (driver); 
		esc= new I_escalation (driver) ;
		info = new J_information (driver) ;
		eve=new K_event (driver);
		req= new L_availbilityRequest (driver);
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
	}
	@BeforeMethod 
	public void backToHomePage () throws Throwable
	{
		HP.backTodashboard(driver);
		Reporter.log("At Dashboard.", true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
	}
	@Test(priority=1,enabled=false)
	public void createManualAmarm  ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating manual alarm by attribute-"+date, true );
		MA.commonForManualAlarm(driver);
		MA.manualAlarmByAttribute(date,driver);
		Reporter.log("the process of creating manual alarm by attriute is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
		Reporter.log("starting the process of creating manual alarm by resource-"+date, true );
		MA.commonForManualAlarm(driver);
		MA.manualAlarmByResourece(date, driver);
		Reporter.log("the process of creating manual alarm by resource is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of creating manual alarm by fire fighter-"+date, true );
		MA.commonForManualAlarm(driver);
		MA.manualAlarmByFireFighter(date,driver);
		Reporter.log("the process of creating manual alarm by fire fighter is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of send massage (attribute)-"+date, true );
		MA.commonForManualAlarm(driver);
		MA.sendMassageAttribute(date, driver);
		Reporter.log("the process of send massage (attribute) is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
		Reporter.log("starting the process of send massage (resource)-"+date, true );
		MA.commonForManualAlarm(driver);
		MA.sendMassageResource(date, driver);
		Reporter.log("the process of send massage (resource) is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of send massage (fire fighter)-"+date, true );
		MA.commonForManualAlarm(driver);
		MA.sendMassageFireFighter(date, driver);
		Reporter.log("the process of send massage (fire fighter) is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
	}
	
	@Test(priority=1,enabled=false)
	public void createTestAmarm  ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating test alarm by attribute-"+date, true );
		TA.commonForTestAlarm(driver);
		TA.testAlarmByAttribute(date,time, driver);
		Reporter.log("the process of creating test alarm by attriute is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
		Reporter.log("starting the process of creating test alarm by resource-"+date, true );
		TA.commonForTestAlarm(driver);
		TA.testAlarmByResource(date, time, driver);
		Reporter.log("the process of creating test alarm by resource is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
		Reporter.log("starting the process of creating test alarm by alarm loop -"+date, true );
		TA.commonForTestAlarm(driver);
		TA.testAlarmByAlarmLoop(date, time, driver);
		Reporter.log("the process of creating test alarm by alarm loop is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
		Reporter.log("starting the process of creating test alarm by fire fighter-"+date, true );
		TA.commonForTestAlarm(driver);
		TA.testAlarmByFirefighter(date, time, driver);
		Reporter.log("the process of creating test alarm by fire fighter is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	}
	
	
	
	@Test(priority=3,enabled=false)
	public void createStormAmarm  ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating storm alarm by resource-"+date, true );
		SA.createrStormAlarm(date, driver);
		Reporter.log("the process of creating test alarm by resource  is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

	}
	@Test(priority=3,enabled=false)
	public void createAmarmWithEscalation  ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating manual alarm with escalation-"+date, true );
		MA.commonForManualAlarm(driver);
		esc.manualAlarmWithEscalation(date, driver);
		Reporter.log("the process of creating creating manual alarm with escalation is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		Reporter.log("starting the process of creating storm alarm with escalation-"+date, true );
     	esc.stormAlarmWithEscalation(date, driver);
		Reporter.log("the process of creating test alarm with escalation is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
	}
	
	@Test(priority=3,enabled=false)
	public void createInformation ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating information by attribute-"+date, true );
		info.commonForInfo(date, time, driver);
		info.createInfoByAttri(date, time, driver);
		Reporter.log("the process of creating creating information by attribute is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		Reporter.log("starting the process of creating information by resource-"+date, true );
		info.commonForInfo(date, time, driver);
		info.createInfoByResource(date, time, driver);
		Reporter.log("the process of creating creating information by resource is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of creating information by fire fighter-"+date, true );
		info.commonForInfo(date, time, driver);
		info.createInfoByFireFighter(date, time, driver);
		Reporter.log("the process of creating creating information by fire fighter is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		
		
		Reporter.log("starting the process of creating monitor information-fullday-"+date, true );
		info.commonForInfo(date, time, driver);
		info.createMonitorInfoFullDay(date, time, driver);
		Reporter.log("the process of creating creating monitor information-fullday is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		
		Reporter.log("starting the process of creating monitor information-future -"+date, true );
		info.commonForInfo(date, time, driver);
		info.createMonitorInfoFuture(date, time, driver);
		Reporter.log("the process of creating creating monitor information- future is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of creating monitor information-going to end -"+date, true );
		info.commonForInfo(date, time, driver);
		info.createMonitorInfoAboutToComplate(date, time, driver);
		Reporter.log("the process of creating creating monitor information- going to end is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		
	}
	
	@Test(priority=3,enabled=false)
	public void createEvent ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating event by attribute-"+date, true );
		info.commonForInfo(date, time, driver);
		eve.createInfoByAttri(date, time, driver);
		Reporter.log("the process of creating creating event by attribute is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		Reporter.log("starting the process of creating event by resource-"+date, true );
		info.commonForInfo(date, time, driver);
		eve.createInfoByResource(date, time, driver);
		Reporter.log("the process of creating creating event by resource is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		
		Reporter.log("starting the process of creating event by fire fighter-"+date, true );
		info.commonForInfo(date, time, driver);
		eve.createInfoByFireFighte(date, time, driver);
		Reporter.log("the process of creating creating event by fire fighter is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		
		
		
	}
	
	@Test(priority=3,enabled=true)
	public void createAvailabilityRequest ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating availability request- send immediate-"+date, true );
		req.createAvailabilityRequestOneTimeImmediate(date, time, driver);
		Reporter.log("the process of creating creating availability request- send immediate is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

	}
	
	
    @AfterMethod 
    public void backToHomePage2 () throws Throwable
    {
    	HP.backTodashboard(driver);
    	Reporter.log("Back to dashboard.", true );
    	Reporter.log("__________________________________________________________________________________________________________________", true );
    } 
	
    @AfterClass
	public void logout () throws Throwable
	{
    
	    driver.quit();
	   	Reporter.log("Department User logout completed successfully.", true );
	   	Reporter.log("__________________________________________________________________________________________________________________", true );
		
	}

}

