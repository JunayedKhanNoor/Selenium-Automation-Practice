package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestTabsAndPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Disable all Notification
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "E:\\\\Automation Projects\\\\Tools\\\\Executable_Browsers_Exe\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@id=\"custom-button\"]/button")).click();
		//Click on Login
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
        // 2nd Click
	    driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[12]/div[3]/div/div/div/div/div[2]/div[2]/div[2]/div[3]/a[2]")).click();
	    
		 

	}

}
