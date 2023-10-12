package marathon2;

import java.awt.Window;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TATACliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
			ChromeDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.tatacliq.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//button[@class='No thanks']")).click();
			WebElement aa1 = driver.findElement(By.xpath("//div[text()='Brands']"));
			Actions aa2 = new Actions(driver);
			aa2.moveToElement(aa1).perform();
		   WebElement bb1 = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		   Actions bb2 = new Actions(driver);
		   bb2.moveToElement(bb1).perform();
			driver.findElement(By.xpath("//div[text()='Casio']")).click();
			Thread.sleep(2000);
			WebElement cc1 = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
			Select cc2 = new Select(cc1);
			cc2.selectByVisibleText("New Arrivals");
			driver.findElement(By.xpath("//div[@class='CheckBox__base']")).click();
			Thread.sleep(2000);
			List<WebElement> watch  = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
			String a = watch.get(0).getText();
			String watchPriceMainWindow= a.replaceAll("[^0-9]","");
			//List<Integer> prices = new ArrayList<Integer>();
			for ( WebElement x : watch) {
				System.out.println(x.getText());
			}
			driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
			Set<String>windowHandles = driver.getWindowHandles();
			List<String>windows = new ArrayList<String>(windowHandles);
			driver.switchTo().window(windows.get(1));
			String mRP1 = driver.findElement(By.xpath("//h3[text()='MRP:  ₹9195']")).getText();
			//String text = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']//h3")).getText();
	//tring mrp ="9195";
			Thread.sleep(2000);
			String watchPriceChildWindow = mRP1.replaceAll("[^0-9]","");
			if(watchPriceMainWindow.equals(watchPriceChildWindow)) {
				System.out.println("Both the prices are same");
			}else {
				System.out.println("Both the prices are different");
			}
			driver.findElement(By.xpath("(//div[@class='Button__base'])[3]")).click();
			String value = driver.findElement(By.xpath("//span[text()='1']")).getText();
			System.out.println( "The cart value is:"+value);
			driver.findElement(By.xpath("//span[text()='1']")).click();
			Thread.sleep(2000);
			File src1 = driver.getScreenshotAs(OutputType.FILE);
			File des1 = new File("./Snaps/watchpic.png");
			FileUtils.copyFile(src1, des1);
			driver.switchTo().window(windows.get(1));
			driver.close();
			driver.switchTo().window(windows.get(0));
			driver.close();
			
			
			
		

	}

}
