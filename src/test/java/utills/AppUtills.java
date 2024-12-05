package utills;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class AppUtills {

	
	public static WebDriver driver;
	public static String url="http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login";
	
	@BeforeSuite
	public static void LaunchAPP() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");		
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(url);	
	
	}
	
	@AfterSuite
	public static void closeapp() {
		driver.close();
	}
	
}
