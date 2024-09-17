package Project1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyProject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	    boolean email = driver.findElement(By.xpath("//input[@id='email']")).isEnabled();
		if(email==true) {
			System.out.println("Textbox is enabled");
			
		}
		else {
			System.out.println("Textbox is not enabled");
		}
		
		
		driver.close();

	}

}
