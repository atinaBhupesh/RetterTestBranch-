package functions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class M_CreateChatGroup {
	

@FindBy(xpath="//span[text()=\"Conversation\"]")private WebElement Conversation;
@FindBy(xpath="//span[text()=\"Groups\"]")private WebElement group;
@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/GroupChat/groupList\"]")private WebElement groupList;
@FindBy(xpath="//button[@class=\"btn btn-success\"]")private WebElement createNew;
@FindBy(xpath="//span[text()=\"Select Department\"]")private WebElement selectDepartment;
@FindBy(xpath="//input[@placeholder=\"Please select firestation.\"]")private WebElement selectFireStation;
@FindBy(xpath="//input[@id=\"ConversationGroupName\"]")private WebElement groupName;
@FindBy(xpath="//input[@id=\"inlineRadio1\"]")private WebElement modeAttribute;
@FindBy(xpath="//button[@id=\"addSubmit\"]")private WebElement save;
@FindBy(xpath="//input[@id=\"selectCheckboxes\"]")private WebElement selectAll ;

@FindBy(xpath="//input[@id=\"inlineRadio2\"]")private WebElement modeResource;
@FindBy(xpath="//input[@id=\"inlineRadio4\" and @value=\"4\"]")private WebElement modeAlarmLoop;
@FindBy(xpath="//input[@id=\"inlineRadio3\"]")private WebElement modeFireFighter;

@FindBy(xpath="//a[@href=\"http://testing.retteralarm.de/admin/GroupChat/index\"]")private WebElement groupCon;
@FindBy(xpath="//input[@placeholder=\"Search Group..\"]")private WebElement searchChatGrpup;
@FindBy(xpath="//a[@class=\"actionShowGroup\"]")private WebElement conGroup;
@FindBy(xpath="//input[@placeholder=\"Write your message...\"]")private WebElement enterMassage;
@FindBy(xpath="//button[@id=\"actionSendMessage\"]")private WebElement sendMassage;

@FindBy(xpath="(//i[@class=\"fa fa-trash-o\"])[1]")private WebElement deleteAlarm;
@FindBy(xpath="//button[@id=\"delYes\"]")private WebElement deleteChatGroup;

//@FindBy(xpath="")private WebElement;
//@FindBy(xpath="")private WebElement ;
//@FindBy(xpath="")private WebElement;
//@FindBy(xpath="")private WebElement;
//@FindBy(xpath="")private WebElement ;
//@FindBy(xpath="")private WebElement;s
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




public M_CreateChatGroup (WebDriver driver)
{
PageFactory.initElements(driver, this);
}

public void createChatFGrouoByAttribute (String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupList.click();
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
	groupName.click();
	Thread.sleep(2000);
	act.sendKeys("Chat group-attribute-"+date).perform();
	Thread.sleep(2000);
	modeAttribute.click();
	Thread.sleep(2000);
	selectAll.click();
	Thread.sleep(2000);
	save.click();
	Thread.sleep(2000);
}
public void createChatFGrouoByResource (String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupList.click();
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
	groupName.click();
	Thread.sleep(2000);
	act.sendKeys("Chat group-resource-"+date).perform();
	Thread.sleep(2000);
	modeAlarmLoop.click();
	Thread.sleep(2000);
	selectAll.click();
	Thread.sleep(2000);
	save.click();
	Thread.sleep(2000);
}
	
public void createChatFGrouoByAlarmLoop (String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupList.click();
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
	groupName.click();
	Thread.sleep(2000);
	act.sendKeys("Chat group-alarm loop-"+date).perform();
	Thread.sleep(2000);
	modeAlarmLoop.click();
	Thread.sleep(2000);
	selectAll.click();
	Thread.sleep(2000);
	save.click();
	Thread.sleep(2000);
}
	
public void createChatFGrouoByFireFighter(String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupList.click();
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
	groupName.click();
	Thread.sleep(2000);
	act.sendKeys("Chat group-fire fighter-"+date).perform();
	Thread.sleep(2000);
	modeFireFighter.click();
	Thread.sleep(2000);
	selectAll.click();
	Thread.sleep(2000);
	save.click();
	Thread.sleep(2000);
}

public void sendMessageAttribute(String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupCon.click();
	Thread.sleep(2000);
	searchChatGrpup.click();
	Thread.sleep(2000);
	Actions act= new Actions (driver);
	act.sendKeys("attribute").perform();
	Thread.sleep(5000);
	act.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(5000);
	enterMassage.click();
	Thread.sleep(2000);
	act.sendKeys("chat message-attribute").perform();
	Thread.sleep(2000);
	sendMassage.click();
	Thread.sleep(2000);
	
	
}	
	

public void sendMessageResource(String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupCon.click();
	Thread.sleep(2000);
	searchChatGrpup.click();
	Thread.sleep(2000);
	Actions act= new Actions (driver);
	act.sendKeys("resource").perform();
	Thread.sleep(5000);
	act.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(5000);
	enterMassage.click();
	Thread.sleep(2000);
	act.sendKeys("chat message-resource").perform();
	Thread.sleep(2000);
	sendMassage.click();
	Thread.sleep(2000);
	
	
}	

public void sendMessageAlarmLoop(String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupCon.click();
	Thread.sleep(2000);
	searchChatGrpup.click();
	Thread.sleep(2000);
	Actions act= new Actions (driver);
	act.sendKeys("alarm loop").perform();
	Thread.sleep(5000);
	act.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(5000);
	enterMassage.click();
	Thread.sleep(2000);
	act.sendKeys("chat message-alarm loop").perform();
	Thread.sleep(2000);
	sendMassage.click();
	Thread.sleep(2000);
	
	
}	

public void sendMessageFireFighter(String date,String time,WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupCon.click();
	Thread.sleep(2000);
	searchChatGrpup.click();
	Thread.sleep(2000);
	Actions act= new Actions (driver);
	act.sendKeys("fire fighter").perform();
	Thread.sleep(5000);
	act.sendKeys(Keys.TAB).perform();
	Thread.sleep(2000);
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(5000);
	enterMassage.click();
	Thread.sleep(2000);
	act.sendKeys("chat message-fire fighter").perform();
	Thread.sleep(2000);
	sendMassage.click();
	Thread.sleep(2000);
	
	
}	


public void deleteChatFGrouoBy (WebDriver driver) throws Throwable
{
	Conversation.click();
	Thread.sleep(2000);
	group.click();
	Thread.sleep(2000);
	groupList.click();
	Thread.sleep(2000);
	for	(int i=1;i<=7;i++)
	{
	deleteAlarm.click();
	Thread.sleep(2000);
	deleteChatGroup.click();
	Thread.sleep(5000);
	Reporter.log( "Alarm number-"+i+ " deleted sucessfully from list" , true );
	driver.navigate().refresh();
	Thread.sleep(2000);
	
	
	}
	
	
}

}
