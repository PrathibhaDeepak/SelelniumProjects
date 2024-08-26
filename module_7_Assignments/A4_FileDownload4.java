package module_7_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

public class A4_FileDownload4 {

	public static void main(String[] args) {
		
//TC-1 Launch Broser		
		WebDriver driver = new FirefoxDriver();
// Wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
// TC-2 Go to URL
		driver.get("https://www.selenium.dev/downloads/");
//Maximize the window
		driver.manage().window().maximize();
//TC-3 In Selenium Client & WebDriver Language Bindings, 
//Click on linkText to download  Selenium with Java Language binding 
        WebElement downloadLink = driver.findElement(By.linkText("Selenium with Java Language"));
        downloadLink.click();


		//WebElement dJava = driver.findElement(By.tagName("(//a[contains(text(),'4(Feb)'])[3]"));
		//dJava.click();
		//new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.elementToBeClickable(By.xpath("dJava"))).click();
	
		// Wait time
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				//new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'4.18.1 (Feb')])[3]"))).click();

//TC-4 Step-4 Automate File Download    
		
		
//Close Browser	
		//driver.close();
		//driver.quit();
		
	}

}
