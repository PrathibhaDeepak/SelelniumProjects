package module_5_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		
//Launch chrome browser
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
//Go to url 
		driver.get("https://www.facebook.com/");
//Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()='Create new account']/parent::div")).click();
		//Wait time 5sec
		//Thread.sleep(5000);
//Enter First name		
		//driver.findElement(By.xpath("//*[text()='First name']/preceding::input[1]")).sendKeys("Aadhi");
		WebElement fname = driver.findElement(By.xpath("//*[@name='firstname']/ancestor::div/input"));
		fname.sendKeys("Shiv");
//Enter Last name		
		driver.findElement(By.xpath("//*[text()='Last name']/parent::div/input[1]")).sendKeys("Niya");
//Enter Email/Mobile number		
		WebElement email =  driver.findElement(By.xpath("//*[@name='reg_email__']//ancestor::div/input"));
		email.sendKeys("shiv@gmail.com");
//ReEnter email
		driver.findElement(By.xpath("(//input[contains(@name,'reg')]//parent::div/input)[2]")).sendKeys("shiv@gmail.com");
//Enter new password
		WebElement pwd = driver.findElement(By.xpath("(//input[contains(@name,'passwd')]//parent::div/input)"));
				pwd.sendKeys("valorant");
		
//Select Month April
		WebElement month = driver.findElement(By.id("month"));
		Select mnthdrp = new Select(month);
		mnthdrp.selectByVisibleText("Apr");		
		System.out.println("April month selected");
//Select Day 27
		WebElement day = driver.findElement(By.id("day"));
		Select daydrp = new Select(day);
		daydrp.selectByValue("27");
		
//Select year 1981
		WebElement year = driver.findElement(By.id("year"));
		Select yrdrp = new Select(year);
		yrdrp.selectByValue("1981");
				
// Xapth Axes Radio button field
		WebElement rdb = driver.findElement(By.xpath("(//input[@name='sex']//parent::span/input)[2]"));
		rdb.click();
		//Wait time 5sec
		//Thread.sleep(5000);
		System.out.println("Test scripts successfully completed!");
//Close Browser
		driver.quit();
		//driver.close();
		
		
		
		
		
		
		
	}

}
