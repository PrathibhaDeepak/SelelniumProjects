package module_6_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Assignment-1

Test Scenario I:   Actions 
Step-1 Launch Chrome Browser
Step-2 Open Test URL https://www.flipkart.com/ 
Step-3 If found any screen hiding actual page Close the Screen
Step-4  Move mouse Pointer  towards Women
Step-5  Click on Shoes
Step-6 Close Browser
*/

public class Mod6_Assignement1_Actions1 {

	public static void main(String[] args) {


//TC 1 Launvh Chrome browser
		WebDriver driver = new ChromeDriver();
		//Wait time 20 sec
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//TC-2 Go to Url
		driver.get("https://www.flipkart.com/");
		//Maximize the window
		driver.manage().window().maximize();
		
		
		/*
		 * // TC-3 If found any screen hiding actual page Close the Screen WebElement
		 * hScreen = driver.findElement(By.xpath("(//div[@class= 'JFPqaw']//span)[1]"));
		 * hScreen.click();
		 */
		
		
//TC-4 Move mouse Pointer towards Women	Footwear
		WebElement fashion =driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).build().perform();
		
		WebElement footwearW = driver.findElement(By.xpath("//*[contains(text(),'Women Footwear')]"));
		act.moveToElement(footwearW).build().perform();
		
		
//Step-5  Click on Shoes
		WebElement shoesW = driver.findElement(By.xpath("//a[text()='Women Sports Shoes']"));
		//a[normalize-space()='Women Sports Shoes']// Women Sports Shoes
		shoesW.click();
		
		System.out.println("Program succesfully completed!");
		
//Step-6 Close Browser		
		
		//driver.close();
		driver.quit();
	}

}
