package module_4_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Assignment-5
1. Write a TestScript for  following

  TC-1 Launch Chrome Browser 
  TC-2 Goto Facebook Registration Page -      https://www.facebook.com/	
  TC-3 Fill FirstName TextBox with Input
  TC-4 Clear the input from  FirstName TextBox
  TC-5 Again Fill the  FirstName TextBox with Input
  TC-6 Get the Input from TextBox  and display it in Console 
  TC-6 Close Browser 
   */
public class A5_TextConsole {

	public static void main(String[] args) throws InterruptedException {
	
//TC-1 Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//TC-2 Goto Facebook Registration Page
		driver.get(" https://www.facebook.com/");
		//Wait time 3sec
		Thread.sleep(3000);
//Maximize the window
		driver.manage().window().maximize();
		//Wait time 3sec
		Thread.sleep(3000);
//Go to Facebook registration page
		driver.findElement(By.linkText("Create new account")).click();
		//Wait time 3sec
		Thread.sleep(3000);

//TC-3 Fill Firstname TextBox with input
		WebElement fName1 = driver.findElement(By.name("firstname"));
		fName1.sendKeys("Ryan");
		//Wait time 5sec
		Thread.sleep(5000);
// TC-4 Clear the input from  FirstName TextBox
	   fName1.clear();
	 //Wait time 5sec
	 	Thread.sleep(5000);
		
//  TC-5 Again Fill the  FirstName TextBox with Input
	   WebElement fName2 = driver.findElement(By.name("firstname"));
	   fName2.sendKeys("MartinLucas");
	 //Wait time 5sec
	 	Thread.sleep(5000);
//  TC-6 Get the Input from TextBox  and display it in Console 
	 	
	 	//System.out.println(driver.findElement(By.xpath("//input[@name='firstname'][@type='text']")).getAttribute("value"));
	 	WebElement Txt1 = driver.findElement(By.name("firstname"));
	 	System.out.println(Txt1.getAttribute("value"));
	 	
	 	
	 //Wait time 5sec
	 	Thread.sleep(5000);
//  TC-6 Close Browser 
	   //driver.close();
	   driver.quit();
		

	}

}
