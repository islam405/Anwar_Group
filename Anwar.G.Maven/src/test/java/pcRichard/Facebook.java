package pcRichard;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


import basePack2.BaseClass2;

public class Facebook {

	public static void main(String[] args)  {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANAWA\\eclipse-workspace\\Maven1\\src\\main\\resources\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
//		System.out.println("Title: = "+ driver.getTitle());
//		System.out.println( "Url: = "+driver.getCurrentUrl());
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.facebook.com/";
		//Assert.assertEquals(actualURL, expectedURL);
		
		if(actualURL.equalsIgnoreCase(expectedURL)) {
			System.out.println("You got the corret Url");
		}
		else {
			System.out.println("Url Test Failed");
		}
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook - Log In or Sign Up";
		//Assert.assertEquals(actualTitle, expectedTitle);
		

		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("You got the corret Title");
		}
		else {
			System.out.println("Title Test Failed");
		}
		
		
		
		
//		driver.findElement(By.name("firstname")).sendKeys("Anwar");
//		driver.findElement(By.name("lastname")).sendKeys("Islam");
//		driver.findElement(By.name("reg_email__")).sendKeys("Islam@gmail.com");
//		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Islam@gmail.com");
//		driver.findElement(By.name("reg_passwd__")).sendKeys("Islam1234");
//		
//		Select month=new Select(driver.findElement(By.name("birthday_month")));
//		month.selectByVisibleText("Oct");
//		
//		Select day=new Select(driver.findElement(By.name("birthday_day")));
//		day.selectByVisibleText("10");
//		
//		Select year=new Select(driver.findElement(By.name("birthday_year")));
//		year.selectByVisibleText("2000");
	}

}
