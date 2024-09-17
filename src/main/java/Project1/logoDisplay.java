package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logoDisplay {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean displayed = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		

		if(displayed==true) {
			System.out.println("logo available");
		}
		else {
			System.out.println("logo  not available");
		}
		WebElement emailbox = driver.findElement(By.xpath("//input[@name='email']"));
		emailbox.sendKeys("adhilsubair@gmail.com");
		String attribute = emailbox.getAttribute("class");
		System.out.println(attribute);
		System.out.println(emailbox.getAttribute("value"));
	}

}
