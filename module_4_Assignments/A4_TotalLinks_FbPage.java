package module_4_Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_TotalLinks_FbPage {

	public static void main(String[] args) {


// Launch Chrome browser
		WebDriver driver = new ChromeDriver();
//Wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//Go to Url
		driver.get("https://www.amazon.in/");

//Get all the links present in this website
		List <WebElement> aTag = driver.findElements(By.tagName("a"));
		
		int lenA =  aTag.size();
		
		System.out.println("Size of the Array List is : " + lenA);
		
		
		for(int i=0; i<lenA; i++) {
			System.out.println(aTag.get(i).getText());
			

		driver.quit();
		
		
	}
		}

}
