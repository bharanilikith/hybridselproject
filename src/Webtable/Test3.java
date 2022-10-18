package Webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);


List<WebElement> ele = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	
for(WebElement b:ele)
	System.out.println(b.getText());

List<WebElement> col2 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[2]"));
for(WebElement b1:col2)
	System.out.println(b1.getText());

driver.close();
	}

	}


