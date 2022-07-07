package BaseLog;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParabankLogIN {
	
	@Test
	public static void bankLogin() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id='mainPanel']")).sendKeys("champa");
	driver.findElement(By.xpath("//*[@class='login']")).sendKeys("champa12");	
	driver.findElement(By.xpath("//*[@type='submit']")).submit();
	}

//	public static void main(String[] args) {
//		ParabankLogIN .bankLogin();	
//	}
}
