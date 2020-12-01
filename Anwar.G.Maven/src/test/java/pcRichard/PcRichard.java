package pcRichard;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basePack2.BaseClass2;

public class PcRichard extends BaseClass2{
	@Test
	public void PcRichardSignUp() {
		driver.get("https://www.pcrichard.com/account/register.jsp");
		driver.findElement(By.id("firstName")).sendKeys("Anwar");
		driver.findElement(By.id("lastName")).sendKeys("Islam");
		driver.findElement(By.id("address1")).sendKeys("8835 164th street");
		driver.findElement(By.id("address2")).sendKeys("Same As Abobe");
		driver.findElement(By.id("city")).sendKeys("Jamaica");
		driver.findElement(By.id("state")).sendKeys("NY");
		driver.findElement(By.id("postalCode")).sendKeys("11432");
		driver.findElement(By.id("phoneNumber")).sendKeys("3214567892");
		
		Select month= new Select(driver.findElement(By.xpath("//div[@id='birthDay']")));
		month.selectByValue("May");
		
		Select day= new Select(driver.findElement(By.xpath("//span[@id='birthMonthSel']")));
		day.selectByVisibleText("15");
		driver.findElement(By.id("email")).sendKeys("Anwar@yahoo.com");
		driver.findElement(By.id("confirmEmail")).sendKeys("Anwar@yahoo.com");
		driver.findElement(By.id("password")).sendKeys("A123456");
		driver.findElement(By.id("confirmPassword")).sendKeys("A123456");
	}

}
