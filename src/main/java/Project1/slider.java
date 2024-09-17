package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class slider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement slide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Point location=slide.getLocation();
		System.out.println(location);
		Actions act=new Actions(driver);
		act.dragAndDropBy(slide, 50, 0).perform();
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,1500)");
		String color=slide.getCssValue("color");
		System.out.println(color);
		String newcolor="rgba(245, 66, 209)";
		j.executeScript("arguments[0].style.backgroundColor='"+newcolor+"';", slide);

	}

}
