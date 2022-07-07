package BaseLog;

import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class PracticeTestNg {
	public WebDriver driver;

	@Test
	public void logNG() {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		System.out.println("This is my 1 Step");
	}
	/*
	 * @Test public void enterID() {
	 * driver.findElement(By.xpath("//*[@name='username']")).sendKeys("champa");
	 * System.out.println("This is my 2nd Step"); }
	 * 
	 * @Test public void enTerPassword() {
	 * driver.findElement(By.xpath("//*[@name='password']")).sendKeys("champa12");
	 * System.out.println("This is my 3rd Step"); }
	 * 
	 * @Test public void click() {
	 * driver.findElement(By.xpath("//*[@type='submit']")).click();
	 * 
	 * System.out.println("This is my 4th Step"); }
	 */

	/*
	 * @AfterTest public void tearDown() { driver.quit();
	 * System.out.println("This is my 5"); }
	 */
}
