package Project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		capture(driver);
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("adhilsubair@gmail.com");
		capture(driver);

		Thread.sleep(2000);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("12345");
		capture(driver);
		
		
		

	}
	public static void capture(WebDriver driver) throws IOException {
		TakesScreenshot tks =(TakesScreenshot) driver;
		File img = tks.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(img, dest);
	}

}
