package module_3_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 * Assignment-5

TC-1	Launch Chrome  Browser
TC-2	Go to Test URL  https://www.google.com
TC-3	Maximize the Browser Window
TC-4	Get the URL of Page
TC-5	Navigate to Test URL  https://www.selenium.dev/
TC-6	Get the URL of Page
TC-7	Navigate back to Test URL  https://www.google.com
TC-8    Get the URL of Page 
TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/ 
TC-9    Get the URL of Page 
TC-10	Refresh the Current Page 
TC-11	Get the URL of Page 
TC-12   Close the Browser 


 */
public class Assignment6_Edge {

	public static void main(String[] args) throws InterruptedException {
//TC-1	Launch Chrome  Browser
		System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
//TC-2	Go to Test URL  https://www.google.com		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
//Watit time 5sec
		Thread.sleep(5000);
//TC-3 Maximize the window
		driver.manage().window().maximize();
//Watit time 5sec
		Thread.sleep(5000);		
//TC-4 Get the page URL
		System.out.println("1. Current Url: ");
		System.out.println(driver.getCurrentUrl());
//Watit time 5sec
		Thread.sleep(5000);		

		
//TC-5	Navigate to Test URL  https://www.selenium.dev/	
		driver.navigate().to("https://www.selenium.dev/");
//Watit time 5sec
		Thread.sleep(5000);			
//TC-6 Get the page URL
		System.out.println("2. Navigate to  ");
		System.out.println(driver.getCurrentUrl());
//TC-7	Navigate back to Test URL  https://www.google.com
		driver.navigate().back();	
//TC-8    Get the URL of Page	
		System.out.println("3. Back to  ");
		System.out.println(driver.getCurrentUrl());
//Watit time 5sec
		Thread.sleep(5000);	
//TC-8	Navigate one step forward to Test URL  https://www.selenium.dev/	
		driver.navigate().forward();
	
//Watit time 5sec
		Thread.sleep(5000);	
//TC-9    Get the URL of Page 
		System.out.println("4. Forward ");
		System.out.println(driver.getCurrentUrl());
		
//TC-10	Refresh the Current Page 
		driver.navigate().refresh();
//Watit time 5sec
		Thread.sleep(5000);	
//TC-11	Get the URL of Page
		System.out.println("5. Refresh ");
		System.out.println(driver.getCurrentUrl());
//Watit time 5sec
		Thread.sleep(5000);	
//TC-12   Close the Browser
		driver.quit();
		
}

}
