package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptHighlightElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/java/java_basic_syntax.htm");

		
		//Javascript Highlight 
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 5px solid red;');", driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/h1")) );

	}

}
