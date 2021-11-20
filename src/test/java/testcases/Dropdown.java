package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("country")).sendKeys("Germany");*/
		//Dropdown
		driver.get("https://www.wikipedia.org/");
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Eesti");
		select.selectByIndex(5);
		/*count total values in dropdown list
		List <WebElement> elementCount = select.getOptions();
		System.out.println(elementCount.size());
		//Printing selected element from list
		System.out.println(elementCount.get(5).getText());
		//Printing all element from list
		for(int i=0; i<elementCount.size(); i++) {
			System.out.println(elementCount.get(i).getText());
		}*/
		/*Another way of counting total value of dropdown list and Useful
		List<WebElement> values = driver.findElements(By.tagName("option"));
		System.out.println("Total values are: "+values.size());
		System.out.println(values.get(9).getText());
		for(int i=0;i<values.size();i++) {
			System.out.println(values.get(i).getText());
			
		}*/
		//Getting all links in the webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("===========Printing Links================");
		System.out.println("Total Links are: "+links.size());
		for(WebElement link: links) {
			System.out.println(link.getText()+"--URL Is--"+link.getAttribute("href"));
			
		}
		
		
	}

}
