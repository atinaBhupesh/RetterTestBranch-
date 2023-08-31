package functions;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A_testClassDelete extends B_baseClass  {
	
	
	
	
	
	
	
	
	
		String date="28.08.2023";
		String time= "10.00";// please add +15 min of current time og german time 
		
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
		@Test(priority=1,enabled=true)
		public void deleteManualAmarm  ( ) throws Throwable 
		{
			Reporter.log("starting the process of deleting manual alarm.-"+date, true );
			MA.deleteManaulAlarm( driver);
			Reporter.log("the process of deleting manual alarm is completed-"+date, true );
			Reporter.log("__________________________________________________________________________________________________________________", true );
		
					
		}
		
		@Test(priority=2,enabled=true)
		public void deleteTestAlarmFromList  ( ) throws Throwable 
		{
			Reporter.log("starting the process of deleting test alarm from list -"+date, true );
			TA.deleteTestAlarmFromList(driver);
			Reporter.log("the process of deleting test alarm from list is completed-"+date, true );
			Reporter.log("__________________________________________________________________________________________________________________", true );

		}
		
		
		@Test(priority=3,enabled=true)
		public void deleteTestAlarmFromDashboard  ( ) throws Throwable 
		{
			Reporter.log("starting the process of deleting test alarm from dashboard -"+date, true );
			TA.deleteTestAlarmFromDashboard(driver);
			Reporter.log("the process of deleting test alarm from list is dashboard-"+date, true );
			Reporter.log("__________________________________________________________________________________________________________________", true );

		}
		
		
		@Test(priority=4,enabled=true)
		public void deleteInfoAndEvent ( ) throws Throwable 
		{
			Reporter.log("starting the process of deleting information and event-"+date, true );
			info.deleteInfoAndEvent( driver);
			Reporter.log("the process of deleting information and event is dashboard-"+date, true );
			Reporter.log("__________________________________________________________________________________________________________________", true );

		}
		
		@Test(priority=5,enabled=true)
		public void deleteAvailabilityFromList ( ) throws Throwable 
		{
			Reporter.log("starting the process of deleting availability request from list-"+date, true );
			req.deleteAvailabilityRequestFromList( driver);
			Reporter.log("the process of deleting availability request from list is dashboard-"+date, true );
			Reporter.log("__________________________________________________________________________________________________________________", true );

		}
			@Test(priority=6,enabled=true)
			public void deleteAvailabilityFromHistory ( ) throws Throwable 
			{
			Reporter.log("starting the process of deleting availability request from history-"+date, true );
			req.deleteAvailabilityRequestFromHistory(driver);
			Reporter.log("the process of deleting availability request from history is dashboard-"+date, true );
			Reporter.log("__________________________________________________________________________________________________________________", true );

			
		}
		
		
		@Test(priority=7,enabled=true)
		public void deleteChatGroup ( ) throws Throwable 
		{
			Reporter.log("starting the process of deleting chat group-"+date, true );
			chatG.deleteChatFGrouoBy(driver);
			
			Reporter.log("the process of deleting chat group is dashboard-"+date, true );
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




