package module_5_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Assignment-6
	Step-1 Launch ChromeBrowser
	Step-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  in Chrome Browser
	Step-3 Switch into 0th  Frame 
	Step-3 Get plain text into Console You've found my HTML tutorial site, which is my final year computing project.
	Step-4 Switch into 1st  Frame
	Step-5 Clear text from Browser and versions: Text box 
	Step-6 Send text into Browser and versions: Text box 
	Step-7 Get given input into Console from Browser and versions: Text Box 
        Step-8 Switch into 2nd  Frame
        Step-9 Get plain text into Console A Tag in HTML denotes certain.............
        Step-10 Close Browser  
 
     */
public class Assignment6__Chrome {

	public static void main(String[] args) throws InterruptedException {
//TC-1 Launch ChromeBrowser		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
//TC-2 Open Test URL http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm  - not working url
		//driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/frame2.htm");
		
//TC-3 Open Url https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/frames");
		//Maximize the window
		driver.manage().window().maximize();
		//Wait time 3sec
		Thread.sleep(3000);
//TC-4 Switch into 0th frame
		driver.switchTo().frame("frame1");
		//Wait time 3sec
		Thread.sleep(3000);
//TC-5 Get Text from the 0th frame
		WebElement txt1 = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
		//Wait time 3 sec
		Thread.sleep(3000);
		System.out.println("Text from 1st frame : " + txt1.getText());
		//Wait time 3 sec
		Thread.sleep(3000);
		//Switch to default content
		driver.switchTo().defaultContent();

//TC-6 Switch into 2nd frame
		
		driver.switchTo().frame("frame2");
		//Wait time 3 sec
		Thread.sleep(3000);
//TC-7 Get the text from the 1st frame	
		WebElement text2 = driver.findElement(By.xpath("//*[@id='sampleHeading']"));
		System.out.println("Text from 2nd frame : " + text2.getText());
		
//TC-8 Close Browser
		//driver.close();
		driver.quit();

	}

}
