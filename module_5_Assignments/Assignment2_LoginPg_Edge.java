package module_5_Assignments;

import org.openqa.selenium.By;
/* 	 
  Assignment-2
1.	Automate Facebook Login Page  using Relative X-path  in 2 different  Browsers
     https://www.facebook.com/    
*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2_LoginPg_Edge {

	public static void main(String[] args) throws InterruptedException {
		
//TC-1 Launch Edge Browser		
		System.setProperty("webdriver.msedge.driver","C:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//TC-2 Go to the Url 
		driver.get("https://www.facebook.com/");
		
		//Wait time 3sec
		Thread.sleep(3000);
//Maximize the window 
		driver.manage().window().maximize();
		
		//Wait time 3sec
		Thread.sleep(3000);
		
//TC-3 	Enter email 
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("ayana@gmail.com");
		//Wait time 3sec
		Thread.sleep(3000);
//TC-4 Enter Password
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Password@123");
		//Wait time 3sec
		Thread.sleep(3000);
//TC-5 Click on LogIn button
		driver.findElement(By.xpath("//*[@name='login']")).click();
		
		//Wait time 3sec
		Thread.sleep(3000);
		
		System.out.println("Login Successful");

		
//TC-6 Close the browser
		//driver.close();
		driver.quit();

		
		

	}

}
