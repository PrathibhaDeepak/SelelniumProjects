package module_7_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Module-7
Module 7_Selenium_Java_Robot
****************************

 Assignment-1

Test Scenario I:  File Upload
Step-1 Launch Chrome Browser
Step-2 Open Test URL https://smallpdf.com/word-to-pdf
Step-3 Click on ChooseFile Button
Step-4 Automate Window Alert by Uploading File   
Step-5 Close Browser*/

public class A1_FileUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
//TC-1 Launch Broser		
		WebDriver driver = new ChromeDriver();
// Wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		Thread.sleep(5000);	
// TC-2 Go to URL
		driver.get("https://smallpdf.com/word-to-pdf");
		//Wait time 3sec
		Thread.sleep(5000);			
//Maximize the window
		driver.manage().window().maximize();
//TC-3 Click on Choose File Button
				
		driver.findElement(By.xpath("(//*[contains(text(),'Choose Files')])[3]")).click();
		//Wait time 3sec
		Thread.sleep(5000);	
// Location of the file : C:\Automation_Inteli		
//Step-4 Automate Window Alert by Uploading File   
		 StringSelection s = new StringSelection("C:\\Automation_Inteli\\TestFile.docx");
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
// send the Data from Clipboard on to Screen //Using Java Robot
		 Robot rb = new Robot();
		 rb.keyPress(KeyEvent.VK_CONTROL);
		 rb.keyPress(KeyEvent.VK_V);
		 
		 rb.keyRelease(KeyEvent.VK_V);
		 rb.keyRelease(KeyEvent.VK_CONTROL);
		 
		 rb.keyPress(KeyEvent.VK_ENTER);
		 rb.keyRelease(KeyEvent.VK_ENTER);
		 
//Click on Download button
		 driver.findElement(By.xpath("//span[text()='Download']")).click();
		//Wait time 3sec
			Thread.sleep(15000);	
//Close Browser	
		//driver.close();
		driver.quit();
		
	}

}
