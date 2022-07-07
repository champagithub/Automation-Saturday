package BaseLog;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogINNg {
	@Test
	public  void login() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println("This is my first step 1");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("neshal1234");
		System.out.println("This is my first step 2");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("eshal@1975");
		System.out.println("This is my first step 3");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		System.out.println("This is my first step 4");
		driver.quit();
		System.out.println("This is my first step 5");
	}
	
	}
	



