package Project1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=browser.browserSetup("chrome");
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int sum=0;
		for(WebElement allLink:links) {
			String url=allLink.getAttribute("href");
			int num=brokenHelper.linkChecker(url);
			sum=sum+num;
		}
		System.out.println("Broken link count : "+sum);

	}

}
