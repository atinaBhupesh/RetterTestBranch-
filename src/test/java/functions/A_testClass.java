package functions;


import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_testClass extends B_baseClass {
	String date="29.08.2023";
	String time= "18.25";// please add +50 min of current time og german time 
	
	E_loginClass BC; 
	D_homePage HP;
	F_manualAlarm MA; 
	G_testAlarm TA;
	H_stormAlam SA; 
	I_escalation esc;
	J_information info;
	K_event eve;
	L_availbilityRequest req;
	M_CreateChatGroup chatG;
	
	
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
		chatG = new M_CreateChatGroup (driver);
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
	}
	@BeforeMethod 
	public void backToHomePage () throws Throwable
	{
		HP.backTodashboard(driver);
		Reporter.log("At Dashboard.", true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
	
	}
	@Test(priority=1,enabled=true )
	public void createManualAmarm1  ( ) throws Throwable 
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
	
	@Test(priority=2,enabled=true)
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
	
	
	
	@Test(priority=3,enabled=true)
	public void createStormAmarm  ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating storm alarm by resource-"+date, true );
		SA.createrStormAlarm(date, driver);
		Reporter.log("the process of creating test alarm by resource  is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

	}
	@Test(priority=4,enabled=true)
	public void createAmarmWithEscalation1  ( ) throws Throwable 
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
	
	@Test(priority=5,enabled=true)
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
	
	@Test(priority=6,enabled=true)
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
	
	@Test(priority=7,enabled=true)
	public void createAvailabilityRequest ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating availability request-one time-send immediate-"+date, true );
		req.createAvailabilityRequestOneTimeImmediate(date, time, driver);
		Reporter.log("the process of creating creating availability request-one time- send immediate is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		Reporter.log("starting the process of creating availability request-one time-Schedule-"+date, true );
		req.createAvailabilityRequestOneTimeScedule(date, time, driver);
		Reporter.log("the process of creating creating availability request-one time-Schedule is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		Reporter.log("starting the process of creating availability request-Recursive-"+date, true );
		req.createAvailabilityRequestRecursive(date, time, driver);
		Reporter.log("the process of creating creating availability request-Recursive is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		Reporter.log("starting the process of creating availability request-multiple days-"+date, true );
		req.createAvailabilityRequestMultipleDay(date, time, driver);
		Reporter.log("the process of creating creating availability request-multiple days is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );

		
	}
	
	@Test(priority=8,enabled=true)
	public void createChatGroup ( ) throws Throwable 
	{
		Reporter.log("starting the process of creating chat group by attribute-"+date, true );
		chatG.createChatFGrouoByAttribute(date, time, driver);
		Reporter.log("the process of creating chat group by attribute is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of creating chat group by resource-"+date, true );
		chatG.createChatFGrouoByResource(date, time, driver);
		Reporter.log("the process of creating chat group by resource is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of creating chat group by alarm loop-"+date, true );
		chatG.createChatFGrouoByAlarmLoop(date, time, driver);
		Reporter.log("the process of creating chat group by alarm loop is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of creating chat group by fire fighter-"+date, true );
		chatG.createChatFGrouoByFireFighter(date, time, driver);
		Reporter.log("the process of creating chat group by fire fighter is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		
		
		
		
		Reporter.log("starting the process of send message for attribute chat group-"+date, true );
		chatG.sendMessageAttribute(date, time, driver);
		Reporter.log("the process of creating send message for attribute chat group is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		
		Reporter.log("starting the process of send message for resource chat group-"+date, true );
		chatG.sendMessageResource(date, time, driver);
		Reporter.log("the process of creating send message for resource chat group is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of send message for alarm loop chat group-"+date, true );
		chatG.sendMessageAlarmLoop(date, time, driver);
		Reporter.log("the process of creating send message for alarm loop chat group is completed-"+date, true );
		Reporter.log("__________________________________________________________________________________________________________________", true );
		
		Reporter.log("starting the process of send message for fire fighter chat group-"+date, true );
		chatG.sendMessageFireFighter(date, time, driver);
		Reporter.log("the process of creating send message for fire fighter chat group is completed-"+date, true );
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

