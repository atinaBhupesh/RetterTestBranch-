package functions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class B_baseClass {
 
	WebDriver driver ; 
	
	public void lounchBrowser () throws Throwable 
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver.exe");
		
		
		ChromeOptions opt=new ChromeOptions();
		
		opt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(opt);
			
		
		
//		System.setProperty("webdriver.edge.driver", "D:\\software\\msedgedriver.exe");
//		driver = new EdgeDriver ();
			
		Thread.sleep(1000);	
		   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://testing.retteralarm.de/admin/users/login");
			Thread.sleep(1000);	
		
		
		
	}
}
