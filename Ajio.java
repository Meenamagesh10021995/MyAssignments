package assignment3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("(//li[@class='rilrtl-list-item'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		Thread.sleep(3000);
		String Links  = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println(Links);
		List<WebElement> BrandName = driver.findElements(By.xpath("//div[@class='brand']"));
		int size = BrandName.size();
		System.out.println("Total number of links:"+size);
		List<String> list = new ArrayList<String>();
		for (WebElement data : BrandName) {
			String text = data.getText();
			System.out.println(text);
			
		}
	}

}
