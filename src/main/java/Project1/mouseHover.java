package Project1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement cart = driver.findElement(By.xpath("//a[@title='Cart']"));
		WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions act=new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(2000);
		act.moveToElement(cart).click().perform();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		WebElement gmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		act.contextClick(gmail).perform();
		Thread.sleep(5000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	

	}

}
