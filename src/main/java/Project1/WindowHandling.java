package Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandling {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement input = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	input.sendKeys("Selenium");
	input.sendKeys(Keys.ENTER);
	List<WebElement> result = driver.findElements(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a"));
	for(WebElement link:result) {
		link.click();
	}
	String parent = driver.getWindowHandle();
	Set<String> child = driver.getWindowHandles();
	for(String page:child) {
		driver.switchTo().window(page);
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	List<String> L=new ArrayList<>(child);
	driver.switchTo().window(L.get(4));
	System.out.println(driver.getTitle());
	
	
	
}
}
