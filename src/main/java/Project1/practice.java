package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Adhil Subair");
		driver.findElement(By.id("email")).sendKeys("adhilsubair@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("8606381874");
		driver.findElement(By.id("textarea")).sendKeys("Kerala");
		driver.findElement(By.id("male")).click();
		List<WebElement> element = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		for(WebElement days:element) {
			if(days.getAttribute("id").equals("sunday")||days.getAttribute("id").equals("saturday")) {
				continue;
			}
			
			days.click();
			
		}
		WebElement country = driver.findElement(By.id("country"));
		Select s=new Select(country);
		s.selectByVisibleText("India");
		WebElement colors = driver.findElement(By.id("colors"));
		Select s1=new Select(colors);
		s1.selectByValue("green");
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("day");
		Actions act=new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		act.moveToElement(btn).click().perform();
		WebElement copy = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.moveToElement(copy).doubleClick(copy).perform();
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(drag, drop).perform();

	}

}
