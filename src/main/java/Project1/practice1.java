package Project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement logo = driver.findElement(By.xpath("//img[@class='_97vu img']"));
		js.executeScript("arguments[0].style.backgroundColor='rgba(245, 66, 209)';", logo);
		js.executeScript("arguments[0].style.border='3px solid green';", logo);
		capture(driver);
		

	}
	
	public static void capture(WebDriver driver) throws IOException {
		TakesScreenshot tks =(TakesScreenshot) driver;
		File img = tks.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/face"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(img, dest);
	}

}
