package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("abcd@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		//Enter from Keyboard 
		Actions action = new Actions(driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).click();
		action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		

	}

}
