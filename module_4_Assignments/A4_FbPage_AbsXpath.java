package module_4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment-3
1.	Automate Facebook Registration Page  using Absolute X-path in Chrome Browser
     https://www.facebook.com/ */

public class A4_FbPage_AbsXpath {

	public static void main(String[] args) throws InterruptedException {
		
//TC1 Launch Chrome Browser		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC2 Go to the Url 
		driver.get("https://www.facebook.com/");
//TC3 Maximize the window
		driver.manage().window().maximize();
		
		//Wait time 5sec
		Thread.sleep(5000);
		
				
//TC4 Click on Create new account button
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]")).click();
		driver.findElement(By.linkText("Create new account")).click();	
		//Wait time 5sec
		Thread.sleep(5000);
//TC5 Enter first name
		//driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("Richie");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Cindy");
		//Wait time 3 sec
				Thread.sleep(3000);
//TC6 Enter last name
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mark");
		//Wait time 3sec
		Thread.sleep(3000);
//TC7 Enter mobile number or email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("5599555");
		
//Close the Browser
		driver.quit();

	}

}
