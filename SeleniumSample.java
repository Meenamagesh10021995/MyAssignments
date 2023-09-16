import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SeleniumSample {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Meena");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Magesh");
		WebElement select = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select opt=new Select(select);
		opt.selectByIndex(4);
		WebElement select1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select a=new Select(select1);
		a.selectByVisibleText("Automobile");
		WebElement select11 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select b=new Select(select11);
		b.selectByValue("OWN_CCORP");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
		
		
		
		
		
		
	}

}

