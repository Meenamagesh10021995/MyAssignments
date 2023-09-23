package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Meena");
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Magesh");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("Software Tester");
	    driver.findElement(By.id("createLeadForm_description")).sendKeys("Using Automation tool");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc1@gmail.com");
		WebElement select1 = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select b=new Select(select1);
		b.selectByValue("NY");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_description")).clear();
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Testing the software to deliver the quality product to the customer");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
