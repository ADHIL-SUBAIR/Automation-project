package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.id("country"));
		Select s=new Select(country);
		s.selectByValue("germany");
		WebElement colors = driver.findElement(By.id("colors"));
		Select s1=new Select(colors);
		s1.selectByIndex(1);
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		driver.findElement(By.xpath("//button[@id='dropdownMenuButton']")).click();
		List<WebElement> drop = driver.findElements(By.xpath("//div[@class='dropdown-menu show']/child::*"));
		Thread.sleep(3000);
		for(WebElement d:drop) {
			System.out.println(d.getText());
		}
	}
	
	

}
