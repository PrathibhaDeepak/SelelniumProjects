package module_1_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Assignment:-1
https://www.moneycontrol.com/
Click on Fruom Linktext

TS1: Launch Chrome browser
TS2: Go to the Url (https://www.moneycontrol.com/)
TS3: Maximize the window
TS4:Click on Forum Linktext
TS5: Close the browser

 */
public class Assignment1_MoneyControl {

	public static void main(String[] args) throws InterruptedException {
		
//TS1: Launch Chrome brower		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Wait Time 3sec
		Thread.sleep(5000);
		
//TS2: Go to the Url (https://www.moneycontrol.com/)
		driver.get("https://www.moneycontrol.com/");
		
		// Wait Time 3sec
		Thread.sleep(3000);	
		
//TS3: Maximize window		
		driver.manage().window().maximize();
		
		// Wait Time 3sec
		Thread.sleep(3000);	
//TS:4 Get the page Title		
				
		String txt1 = driver.getTitle();		
		System.out.println("Page Title: " + txt1);		
		
		// Wait Time 5sec
		Thread.sleep(5000);
		
//TS3: Click on Forum Linktext
		driver.findElement(By.linkText("Forum")).click();
		//System.out.println(ForumText);
	
		// Wait Time 5sec
				Thread.sleep(5000);			
		String txt2 = driver.getCurrentUrl();
		System.out.println("Page Url: " + txt2);		
		
// Wait Time 3sec
		Thread.sleep(3000);	
			
		//driver.close();
		driver.quit();
		

	}

}
