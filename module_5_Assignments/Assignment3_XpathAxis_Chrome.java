package module_5_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
  Assignment-3
1.	Automate Facebook Login Page  using Relative X-path Axis   in 2 different  Browsers
     https://www.facebook.com/  
     */
public class Assignment3_XpathAxis_Chrome {

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
		

	}

}
