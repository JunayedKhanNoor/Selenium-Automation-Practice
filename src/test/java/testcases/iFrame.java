package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement iFrame = driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/iframe"));
	    driver.switchTo().frame(iFrame);
	    WebElement CSS = driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div/a[4]"));
	    CSS.click();
	    
		

	}

}
