package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for b");
		Thread.sleep(2000);
		driver.findElement(By.className("s-suggestion-container")).click();
		String Totalresults = driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
		System.out.println(Totalresults);
		driver.findElement(By.linkText("Skybags")).click();
		driver.findElement(By.linkText("American Tourister")).click();
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		String a = driver.findElement(By.xpath("(//span[text()='Skybags'])[2]")).getText();
		System.out.println(a);
		String b = driver.findElement(By.xpath("//span[text()='(32% off)']")).getText();
		System.out.println(b);
		String title = driver.getTitle();
		 System.out.println(title);
		 driver.close();
		 
		
		
		

	}

}
