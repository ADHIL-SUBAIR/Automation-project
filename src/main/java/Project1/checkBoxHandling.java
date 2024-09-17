package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkBoxHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement male = driver.findElement(By.xpath("//input[@id='male']"));
		male.click();
		WebElement female = driver.findElement(By.xpath("//input[@id='female']"));
		female.click();
		List<WebElement> days = driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		for(WebElement check:days) {
			
			String day = check.getAttribute("id");
			System.out.println(day);
			if(day.equals("monday")) {
			continue;
		}
			check.click();

	}

}
}