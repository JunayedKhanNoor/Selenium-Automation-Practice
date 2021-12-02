package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOverEventsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("pikaboo");
		//Explicit wait for clicking google search button
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"))).click();
		
		driver.findElement(By.xpath("/html/body/div[7]/div/div[10]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[1]/a/h3")).click();
		
	    WebElement manu = driver.findElement(By.xpath("/html/body/div[7]/header/div[2]/div/div/div[2]/div[1]/div/div[2]/div/div/div/div/ul/li[4]/a/span"));
	    // Action for mouseOver
	    Actions action = new Actions(driver);
	    action.moveToElement(manu).perform();
	    driver.findElement(By.linkText("Mouse")).click();
	    
	    

	}

}
