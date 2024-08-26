package module_4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

/*  Assignment-2
1.	Automate  Oracle  Registration Page in Chrome Browser   
    https://profile.oracle.com/myprofile/account/create-account.jspx
*/

public class A2_OracleReg_FF {

	public static void main(String[] args) throws InterruptedException {
//TC1 Launch Chrome Browser
		System.setProperty("webdriver.geckodriver.driver","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
//TC2 Go to the URL 	
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
//Maximize the window
		driver.manage().window().maximize();
//Wait time 5sec
		Thread.sleep(5000);
//TC3 Enter email
		
		driver.findElement(By.xpath("//input[@id='sView1:r1:0:email::content']")).sendKeys("one@gmail.com");
		//driver.findElement(By.xpath("//td/label[contains(text(),'Email Address')]]")).sendKeys("One@gmai.com");
//Wait time 5sec
		Thread.sleep(5000);		
		
//TC4 Enter Password
		
		By pwd = RelativeLocator.with(By.tagName("input")).below(By.xpath("//input[@id='sView1:r1:0:email::content']"));
		driver.findElement(pwd).sendKeys("Password@12");
		
//Wait time 5sec
			Thread.sleep(5000);	
			
//TC5 Retype Password
		By rtpwd = RelativeLocator.with(By.tagName("input")).below(pwd);
		driver.findElement(rtpwd).sendKeys("Password@12");
//Wait time 5sec
		Thread.sleep(5000);	
//TC6 Select Country  Canada from dropdown
		WebElement country = driver.findElement(By.name("sView1:r1:0:country"));
		Select cdrp = new Select(country);
		//cdrp.selectByIndex(38);
		cdrp.selectByValue("CA");
		//cdrp.selectByVisibleText("Canada");
		
//Wait time 3sec
		Thread.sleep(3000);	
//TC7 Enter First or GivenName
		WebElement fName = driver.findElement(By.name("sView1:r1:0:firstName"));
		fName.sendKeys("Ryan");
//Wait time 3sec
		Thread.sleep(3000);			
//TC8 Enter Lastname	
		By lName = RelativeLocator.with(By.tagName("input")).toRightOf(fName);
		driver.findElement(lName).sendKeys("Mark");
		
 //Wait time 3sec 
		Thread.sleep(3000);
		//page down
		  driver.findElement(lName).sendKeys(Keys.PAGE_DOWN); 
		  //Wait time 3sec
		  Thread.sleep(3000);
//TC8 Enter Job title
		  WebElement jobTitle = driver.findElement(By.name("sView1:r1:0:jobTitle"));
		 jobTitle .sendKeys("Manager");	
		//Wait time 3sec
		  Thread.sleep(3000);
//TC9 Enter WorkPhone
		  By wrkPhone = RelativeLocator.with(By.tagName("input")).below(jobTitle);	
		  driver.findElement(wrkPhone).sendKeys("55588555");
		//Wait time 3sec
		  Thread.sleep(3000); 
		  
//TC9 Enter Company Name
		  By cmpName = RelativeLocator.with(By.tagName("input")).below(wrkPhone);
		  driver.findElement(cmpName).sendKeys("Oracle");
	
//Wait time 3sec
		  Thread.sleep(3000); 
//TC10 Enter Address
		  By address1 = RelativeLocator.with(By.tagName("input")).below(cmpName);
		  driver.findElement(address1).sendKeys("Main St., Walnut county");
		  
		//Wait time 3sec
		  Thread.sleep(3000);  
		  By address2 = RelativeLocator.with(By.tagName("input")).below(address1);
		  driver.findElement(address2).sendKeys("North central way");
		  
		  
//TC11 Enter City
		  WebElement city = driver.findElement(By.name("sView1:r1:0:city"));
		  city.sendKeys("Danville");

		  //Wait time
		   Thread.sleep(3000);
//TC12 Select State/Province		   
		   WebElement state = driver.findElement(By.name("sView1:r1:0:state"));
		   Select stateDrp = new Select(state);
		   stateDrp.selectByVisibleText("Ontario");
		   //Wait time
		   Thread.sleep(3000);

//TC13 Enter zip code	
		   WebElement zCode = driver.findElement(By.name("sView1:r1:0:postalCode"));
		   zCode.sendKeys("61555");
		 //Wait time
		   Thread.sleep(3000);
		   
//TC14 Click on the checkbox
		   driver.findElement(By.name("sView1:r1:0:subscription1")).click();
		   //Wait time
		   Thread.sleep(3000);
		   
//TC15 Click on Create Account button
		   driver.findElement(By.linkText("Create Account")).click();
		 //Wait time
		   Thread.sleep(3000);
//Close Chrome browser
		//driver.quit();
		 
		 System.out.println("Test cases Successfully Executed!");
	

}
}
