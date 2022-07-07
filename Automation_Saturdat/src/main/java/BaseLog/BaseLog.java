package BaseLog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public  class BaseLog {
	WebDriver driver;
	public static void getLog() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe.");
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
	
	}
public static void main(String[] args) {
	
	getLog();
}
}
