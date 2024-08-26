package module_5_Assignments;
/*
 * Assignment-1
1.	Automate Facebook Registration Page  using Relative X-path  in 2 different  Browsers
     https://www.facebook.com/ */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Assignment1_RelXpath_Ffx {

	public static void main(String[] args) throws InterruptedException {

//TC1 Launch Firefox Browser
				System.setProperty("webdriver.geckodriver.driver","C:\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
//TC2 Go to the URL 	
				driver.get("https://www.facebook.com/");
//Maximize the window
				driver.manage().window().maximize();
				//Wait time 5sec
				Thread.sleep(5000);
//Go to Facebook registration page
				driver.findElement(By.linkText("Create new account")).click();
				//Wait time 3sec
				Thread.sleep(3000);
//TC-3 Enter Firstname				
				WebElement fName = driver.findElement(By.xpath("//*[@name='firstname']"));
				fName.sendKeys("Ayana");
				//Wait time 3sec
				Thread.sleep(3000);
//TC-4 Enter Lastname	
				WebElement lName = driver.findElement(By.xpath("//*[@name='lastname']"));
				lName.sendKeys("Ajay");
				//Wait time 3sec
				Thread.sleep(3000);
//TC-5 Enter mobile or email
				WebElement email = driver.findElement(By.xpath("//*[@name='reg_email__']"));
				email.sendKeys("ayana@gmail.com");
				
				//Wait time 3sec
				Thread.sleep(3000);
				
				By email2 = RelativeLocator.with(By.tagName("input")).below(By.name("reg_email__"));
				driver.findElement(email2).sendKeys("ayana@gmail.com");
				
				//WebElement mobNmbr = driver.findElement(By.xpath("//*[@name='reg_email__']"));
				//mobNmbr.sendKeys("5522551577");
				//Wait time 3sec
				Thread.sleep(3000);
//TC-6 Enter new password
				WebElement nPwd = driver.findElement(By.xpath("//*[@name='reg_passwd__']"));
				nPwd.sendKeys("Password@123");
				//Wait time 3sec
				Thread.sleep(3000);
//TC-7 Select month from dropdown
				WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
				Select mdrp = new Select(month);
				mdrp.selectByVisibleText("Apr");
				//mdrp.selectByIndex(3);
				//mdrp.selectByValue("4");
				//Wait time 3sec
				Thread.sleep(3000);
				
//TC-7 Select month from dropdown
				WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
				Select daydrp = new Select(day);
				//daydrp.selectByIndex(22);
				daydrp.selectByValue("23");
				
				//Wait time 3sec
				Thread.sleep(3000);
//TC-7 Select month from dropdown
				WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
				Select ydrp = new Select(year);
				ydrp.selectByValue("2006");
				
				//Wait time 3sec
				Thread.sleep(3000);
				
		
//TC-8 Select Gender radio button
				By fRdb = RelativeLocator.with(By.tagName("input")).below(By.id("month"));
				driver.findElement(fRdb).click();
				
				//By mRdb = RelativeLocator.with(By.tagName("input")).below(By.id("day"));
				//driver.findElement(mRdb).click();
				
				//By cusRdb = RelativeLocator.with(By.tagName("input")).below(By.id("year"));
				//driver.findElement(cusRdb).click();
				
				//Wait time 3sec
				Thread.sleep(3000);
//TC-9 Click on Sign Up button				
		WebElement SignUp = driver.findElement(By.xpath("//*[@name='websubmit']"));
		SignUp.click();
		
		//Wait time 3sec
		Thread.sleep(3000);
//Sign Up success
		System.out.println("Facebook SignUp Successfully Completed");
		
		
//TC-10 Close the browser
		//driver.close();
		driver.quit();
		
	}

}
