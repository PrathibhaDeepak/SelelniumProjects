package module_2_Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign1_Edge {

	public static void main(String[] args) throws InterruptedException {
		

				//Open Test URL on Edge browser
				System.getProperty("webdriver.edge.driver","C\\edgedriver.exe");
				 WebDriver driver = new EdgeDriver();
				driver.get("https://google.com/");
				System.out.println("3. Edge Browser");
				

				//wait 5sec
						Thread.sleep(5000);

						driver.quit();
	}

}
