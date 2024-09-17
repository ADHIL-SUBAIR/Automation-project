package Project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rowsize=row.size();
		List<WebElement> column = driver.findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		int columnsize=column.size();
		
		for(int i=2;i<=rowsize;i++) {
			for(int j=1;j<=columnsize;j++) {
				WebElement cell = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
				System.out.print(cell.getText()+"  ");
			}
			System.out.println();
		}
		int sum=0;
		for(int a=2;a<=rowsize;a++) {
			WebElement price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+a+"]/td["+columnsize+"]"));
			int num=Integer.parseInt(price.getText());
			sum=sum+num;
			System.out.print(num+"  ");
			
		}
		System.out.println();
		System.out.println("total price = "+sum);

	}

}
