package assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneAreaCode")).sendKeys("123");
		driver.findElement(By.name("phoneNumber")).sendKeys("9884637465");
		driver.findElement(By.className("x-btn-text")).click();
		WebElement leadElement = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		 String leadID = leadElement.getText();
		 System.out.println("Lead ID: " + leadID);
		 driver.findElement(By.className("linktext")).click();
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 driver.findElement(By.name("id")).sendKeys("DemoLead1");
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 
		 
		
		
		
		


	}

}
