package module_7_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Module-7
Module 7_Selenium_Java_Robot
****************************
*Assignment-2

Test Scenario I:---File Download  
Step-1 Launch Firefox Browser
Step-2 Open Test URL https://www.selenium.dev/downloads/
Step-3 In Selenium Client & WebDriver Language Bindings, Click on linkText to download  Selenium with Java Language binding  
Step-4 Automate File Download    
Step-5 Close Browser


*/

public class A2_FileDownload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
//TC-1 Launch Broser		
		WebDriver driver = new FirefoxDriver();
// Wait time
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// TC-2 Go to URL
		driver.get("https://www.selenium.dev/downloads/");
		//Wait time 3sec
		Thread.sleep(5000);	
//Maximize the window
		driver.manage().window().maximize();
//TC-3 In Selenium Client & WebDriver Language Bindings, 
		//Wait time 3sec
		Thread.sleep(5000);	
		////*[contains(text(),'Selenium Clients and WebDriver')]
//Click on linkText to download  Selenium with Java Language binding    		
		driver.findElement(By.xpath("(//*[contains(text(),'Stable:')])[3]")).click();
		//Path of File C:\\Automation_Inteli\\TestFile.docx
		StringSelection str = new StringSelection("C:\\Automation_Inteli\\TestFile.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

		//Send the Data from Clipboard on to Screen
		//Using Java Robot
		Robot rb = new Robot();
		//Wait time 3sec
		Thread.sleep(5000);	
//TC-4 Step-4 Automate File Download    
		//Paste CONTROL + V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		//Wait time 5sec
		Thread.sleep(5000);	
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
//Click on Open Button
//Press ENTER key
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
//Java Wait time 15sec
Thread.sleep(15000);
		
//Click on download button		
		driver.findElement(By.xpath("//span[text()='Download']")).click();
		//Java Wait time 15sec
		
		//Wait time 3sec
		Thread.sleep(5000);	
//Close Browser	
		//driver.close();
		driver.quit();
		
	}

}
