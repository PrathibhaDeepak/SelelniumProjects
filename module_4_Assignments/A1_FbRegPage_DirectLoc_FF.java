package module_4_Assignments;
import org.openqa.selenium.By;
/* 	Automate dropdowns part of Facebook Registration Page  
 * using Direct Locator's in firefox Browser 
    https://www.facebook.com/
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_FbRegPage_DirectLoc_FF {

	public static void main(String[] args) throws InterruptedException {
		
//Launch Firefox browser
		
		System.setProperty("webdriver.geckodriver.driver","C:\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
//Go to URL https://www.facebook.com/	
		driver.get("https://www.facebook.com/");
//Maximize the window		
		driver.manage().window().maximize();
//Wait time 5sec
		Thread.sleep(5000);
//Click on 	Create new account
		driver.findElement(By.linkText("Create new account")).click();
//Wait time 5sec
		Thread.sleep(5000);		
//Wait time 3sec
		Thread.sleep(3000);
		
//Fill the Firstname, lastname,mob number & new password field
		driver.findElement(By.name("firstname")).sendKeys("Deepa");
		driver.findElement(By.name("lastname")).sendKeys("Deepak");
//Wait time 5sec
		Thread.sleep(5000);		
		driver.findElement(By.name("reg_email__")).sendKeys("123456555");
		driver.findElement(By.name("reg_passwd__")).sendKeys("awesome");		
//Wait time 5sec
		Thread.sleep(5000);
		
//Select month from dropdown
		WebElement monthList = driver.findElement(By.id("month"));
		Select mndrp = new Select(monthList);
		//mndrp.selectByIndex(7);
		mndrp.selectByValue("8");
		//mnlist.selectByVisibleText("Jan");
//Wait time 5sec
		Thread.sleep(5000);		

//Select date from dropdown
		WebElement dateList = driver.findElement(By.id("day"));
		Select dtdrp = new Select(dateList);
		//dtdrp.selectByIndex(5);
		//dtdrp.selectByValue("23");
		dtdrp.selectByVisibleText("24");
//Wait time 3sec
		Thread.sleep(3000);	
//Select year from dropdown
		WebElement yearList = driver.findElement(By.id("year"));
		Select yrdrp = new Select(yearList);
		//yrdrp.selectByIndex(5);
		//yrdrp.selectByValue("2001");
		yrdrp.selectByVisibleText("2006");
//Wait time 3sec
		Thread.sleep(3000);		
//Close the Browser
	driver.close();
	
	
	
	}
}
