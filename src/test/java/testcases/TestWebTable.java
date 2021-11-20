package testcases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		//*[@id="leftcontainer"]/table
		//*[@id="leftcontainer"]/table/thead
		//*[@id="leftcontainer"]/table/tbody
		//*[@id="leftcontainer"]/table/tbody/tr[1]
		//*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
		 */
		List<WebElement> rowNum = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("Total rows are: "+rowNum.size());
		List<WebElement> colNum = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[1]/td"));
		System.out.println("Total rows are: "+colNum.size());
		for(int rows=1; rows<=rowNum.size();rows++) {
			for(int cols=1; cols<=colNum.size();cols++) {
				System.out.print(driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+rows+"]/td["+cols+"]")).getText()+"  ");
			}
			System.out.println();
			
		}
		

	}

}
