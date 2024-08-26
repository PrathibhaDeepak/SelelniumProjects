package module_5_Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Assignment-4

	Step-1 Launch Chrome Browser
	Step-2 Open Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1  in Chrome Browser
	Step-3 Click on  Click here to show confirm alert Button 
	Step-4 Get the text displayed on Alert into Console
	Step-5 Accept  the Web Alert to Delete Account  
	Step-6 Get the text displayed on Alert into Console 
	Step-6 Accept the Alert 
	Step-6 Close Browser
	 */

public class Assignment4_SwitchTo_Alert_Chrome {

	public static void main(String[] args) throws InterruptedException {
		
//TC-1 Launch Chrom Browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//TC-2 Go to the Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1	
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		//Wait time 3sec
		Thread.sleep(3000);
//Maximize the window
		driver.manage().window().maximize();
		//Wait time 3sec
		Thread.sleep(3000);
//TC-3 Click on  Click here to show confirm alert Button 
		WebElement txt1 = driver.findElement(By.xpath("//*[text()='Click here to show confirm alert']"));
		txt1.click();
		
		//Wait time 3sec
		Thread.sleep(3000);
//TC-4 Get the text displayed on Alert into Console		
		String alert1 = driver.switchTo().alert().getText();
		System.out.println(alert1);
		driver.switchTo().alert();
		
		//Wait time 5sec
		Thread.sleep(5000);
//TC-5 Accept the web alert
		driver.switchTo().alert().accept();
		//Wait time 3 sec
		Thread.sleep(3000);
//Get the text displayed on Alert into console
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2);
		driver.switchTo().alert().accept();
			
		//Wait time 5sec
		Thread.sleep(5000);
//Close Browser
		//driver.close();
		driver.quit();
		
		

	}

}
