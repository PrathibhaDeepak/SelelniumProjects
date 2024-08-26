package module_2_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assign1_Firefox {

	public static void main(String[] args) throws InterruptedException {

		
		//Open  Test URL  in Firefox Browser 
		System.getProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();

		driver.get("https://google.com/");
		System.out.println("2. Firefox Browser");

		//wait 5sec
				Thread.sleep(5000);
				
				driver.quit();
	}

}
