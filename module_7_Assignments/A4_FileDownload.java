package module_7_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*Module-7
Module 7_Selenium_Java_Robot
****************************
 Assignment-4

Test Scenario I:---File Download  
Step-1 Launch Firefox Browser
Step-2 Open Test URL https://www.selenium.dev/downloads/
Step-3 In table Selenium Client & WebDriver Language Bindings, automate the plain text   
Step-4 Get the plain text Java , Python  into Console   
Step-5 Close Browser

*/

public class A4_FileDownload {

	public static void main(String[] args) {
		
//TC-1 Launch Broser		
		WebDriver driver = new FirefoxDriver();
// Wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// TC-2 Go to URL
		driver.get("https://www.selenium.dev/downloads/");
//Maximize the window
		driver.manage().window().maximize();
//TC-3  In table Selenium Client & WebDriver Language Bindings, automate the plain text  
//Get the plain text Java , Python  into Console 		
    		
		String javaText = driver.findElement(By.xpath("(//*[text()='Java'])[1]")).getText();
		System.out.println(javaText);
		String pyText = driver.findElement(By.xpath("(//*[text()='Python'])[1]")).getText();
		System.out.println(pyText);
		

		
//Close Browser	
		//driver.close();
		driver.quit();
		
	}

}
