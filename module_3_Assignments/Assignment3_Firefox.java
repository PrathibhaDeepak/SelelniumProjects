package module_3_Assignments;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Assignment-4

TC-1	Launch Firefox  Browser
TC-2	Go to Test URL  https://demoqa.com/browser-windows
TC-3	Maximize the Browser Window
TC-4	Get the Title of Page
TC-5	Click on new window/ new tab Link Text 
TC-6	Switch from 0th   Window to 1st   Window
TC-7	After Switching Get the Title of Page 
TC-8    Close 1st Window 
TC-8	Switch from 1st   Window to 0th  Window
TC-9    After Switching Get the Title of Page 
TC-10	Close 0th Window  


 */
public class Assignment3_Firefox {

	public static void main(String[] args) throws InterruptedException {
//TC-1	Launch Firefox Browser
		System.setProperty("webdriver.geckodriver.driver","C:\\geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
// TC-2	Go to Test URL  https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/browser-windows");
		//Watit time 3sec
		Thread.sleep(3000);
//TC-3	Maximize the Browser Window
		driver.manage().window().maximize();
		//Watit time 3sec
		Thread.sleep(3000);

//	TC-4	Get the Title of Page
	String titleTxt = driver.getTitle();
	System.out.println(titleTxt);
	//Watit time 3sec
	Thread.sleep(5000);
//Page down
	driver.findElement(By.id("tabButton")).sendKeys(Keys.PAGE_DOWN);
	//Watit time 3sec
		Thread.sleep(5000);
//TC-5	Click on new window /new tab 
	driver.findElement(By.id("tabButton")).click();
	
	//Watit time 5sec
		Thread.sleep(5000);
		
//Handling multiple windows
	ArrayList<String> wins = new ArrayList<String>(driver.getWindowHandles());
	System.out.println(wins);
	
	//Watit time 5sec
	Thread.sleep(5000);
//TC-6	Switch from 0th   Window to 1st 	
	driver.switchTo().window(wins.get(1));
	
//TC-7	After Switching Get the Title of Page/Text
	System.out.println("Page Index 1 Text: ");
	System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
	//Watit time 5sec
	Thread.sleep(5000);
//TC-8    Close 1st Window	
	driver.close();

//TC-8	Switch from 1sr   Window to 0th  Window
	driver.switchTo().window(wins.get(0));
	
 //TC-9    After Switching Get the Title of Page 
	System.out.println("Page Index 0 - PageTitle: ");
	System.out.println(driver.switchTo().window(wins.get(0)).getTitle());	
	
	//Watit time 5sec
		Thread.sleep(5000);
	
//TC-10	Close all windows of Browser
	driver.close();
	}

}
