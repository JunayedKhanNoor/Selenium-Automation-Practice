package testcases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCheckboxes {
	public static WebDriver driver;
	public static boolean isElementPresent(String locator) {
		try {
			driver.findElement(By.xpath(locator));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tizag.com/htmlT/htmlcheckboxes.php");
		/*1st way
		//driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/input[2]")).click();
		//Another way
		//driver.findElement(By.xpath("//div[4]/input[3]")).click();
		for(int i=1; i<4; i++) {
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
		}
		int i=1;
		int count =0;
		while(isElementPresent("//div[4]/input["+i+"]")) {
			
			driver.findElement(By.xpath("//div[4]/input["+i+"]")).click();
			i++;
			count++;
		}
		System.out.println("Total checkboxes are:"+count);*/
		
		//Recommended way to check all the boxes
		WebElement block = driver.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]"));
		List<WebElement> checkboxes = block.findElements(By.name("sports"));
		System.out.println("Total checkboxes are:"+checkboxes.size());
		for(WebElement checkbox: checkboxes) {
			checkbox.click();
		}
		
		
	
	}

}
