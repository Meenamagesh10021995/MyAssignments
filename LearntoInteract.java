package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearntoInteract {
private static String title;
public static void main(String[] args) {ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Create Account")).click();
			driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
			WebElement select = driver.findElement(By.name("industryEnumId"));
			Select opt=new Select(select);
			opt.selectByIndex(3);
			WebElement select1 = driver.findElement(By.name("ownershipEnumId"));
			Select a=new Select(select1);
			a.selectByVisibleText("S-Corporation");
			WebElement select2 = driver.findElement(By.id("dataSourceId"));
			Select b=new Select(select2);
			b.selectByValue("LEAD_EMPLOYEE");
			WebElement select3 = driver.findElement(By.id("marketingCampaignId"));
			Select c=new Select(select3);
			c.selectByIndex(6);
			WebElement select4 = driver.findElement(By.id("generalStateProvinceGeoId"));
			Select d=new Select(select4);
			d.selectByValue("TX");
			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.id("accountName")).sendKeys("Meena Magesh");
			title = driver.getTitle();
			System.out.println("Meena Magesh");
			driver.close();
			
			
			
			
			
			
			
			
			
			

	}

}
