package basePack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass2 {
	public static WebDriver driver;
	
	@BeforeMethod
	public void initilize() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANAWA\\eclipse-workspace\\Maven1\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	//@AfterMethod
	public void TearDown() {
		driver.close();
	}
}
