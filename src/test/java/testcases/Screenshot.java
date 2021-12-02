package testcases;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	
	public static WebDriver driver;
	public static void captureScreenshot() throws IOException {
		Date d = new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//"+fileName));
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/java/java_basic_syntax.htm");

		
		//Javascript Highlight 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 5px solid red;');", driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/h1")) );
        //Screenshot
	    captureScreenshot();
	

	}

}
