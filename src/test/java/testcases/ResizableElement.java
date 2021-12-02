package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ResizableElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		driver.manage().window().maximize();
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(resizable, 400, 400).perform();

	}

}
