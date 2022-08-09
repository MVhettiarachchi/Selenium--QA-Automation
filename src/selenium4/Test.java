package selenium4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting webdriver.gecko.driver property
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\selenium\\geckodriver.exe");
        
        //Instantiating driver object and launching browser
        driver = new FirefoxDriver();
        
        //Using get() method to open a webpage
        driver.get("https://youtube.com");
        
        //Closing the browser
        driver.quit();
	}

}
