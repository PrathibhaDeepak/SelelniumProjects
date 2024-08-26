package module_6_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
/*Assignment-2

Assignment-3

Test Scenario I:   Actions 
Step-1 Launch Chrome Browser
Step-2 Open Test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
Step-3 Right  Click on Double-Click Me To See Alert Button  
Step-4 Close Browser


*/


public class Mod6_Assignement3_ActionsRightClick {

	public static void main(String[] args) {


//TC 1 Launvh Chrome browser
		WebDriver driver = new ChromeDriver();
		//Wait time 20 sec
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//TC-2 Go to Url
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//Maximize the window
		driver.manage().window().maximize();

//TC-3 Double Click on Double-Click Me To See Alert Button  to generate Alert
		
		WebElement rClick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		Actions act = new Actions(driver);
		act.contextClick(rClick).build().perform();
	
		
		
	
System.out.println("Program succesfully completed!");
		
//Step-6 Close Browser		
		
		//driver.close();
		driver.quit();
	}

}
