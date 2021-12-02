package testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToNewWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//1st Window
		driver.get("https://www.tutorialspoint.com/java/java_basic_syntax.htm");
		//Window Handle
		System.out.println("----Generating window ids from first window-----");
		Set<String> winds = driver.getWindowHandles();
		Iterator<String> iterate = winds.iterator();
		//calling first window
		String first_window = iterate.next();
		System.out.println(first_window);
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div[1]/a")).click();
		//2nd Window
		//Window Handle
		System.out.println("----Generating window ids from second window-----");
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		//calling first window
		System.out.println(iterate.next());
		//calling second window
		String second_window = iterate.next();
		System.out.println(second_window);
		driver.switchTo().window(second_window);
		
		
		System.out.println(driver.getTitle().contains("Biggest Online Tutorials Library"));
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[5]/a[3]/span")).click();
		
		//3rd Window
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/ul/li[6]/a/span")).click();
		//Window Handle
		System.out.println("----Generating window ids from thirtd window-----");
		winds = driver.getWindowHandles();
		iterate = winds.iterator();
		//calling first window
		System.out.println(iterate.next());
		//calling second window
		System.out.println(iterate.next());
		//calling third window
		String third_window = iterate.next();
		System.out.println(third_window);
		driver.switchTo().window(third_window);
		System.out.println("-----------Title-----------");
		System.out.println(driver.getTitle());
		//close last window
		driver.close();
		//close 2nd window
		driver.switchTo().window(second_window);
		driver.close();
		

	}

}
