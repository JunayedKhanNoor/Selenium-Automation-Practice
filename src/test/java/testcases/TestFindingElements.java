package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFindingElements {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://stackoverflow.com/users/login");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("testandtesterand@gmail.com");
		//Core java wait
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("0000");
		/*driver.findElement(By.id("identifierId")).sendKeys("test01@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();*/
		
		WebElement btn = driver.findElement(By.id("submit-button"));
		btn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"login-form\"]/div[1]/p")));
		
		
		WebElement alert = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/p"));
		String message = alert.getText();
		System.out.println(message);
		
	}

}
