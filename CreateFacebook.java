package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFacebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Shankar");
		driver.findElement(By.name("lastname")).sendKeys("Ganesh");
		driver.findElement(By.name("reg_email__")).sendKeys("meenamagesh12345@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("abcd123");
		WebElement select = driver.findElement(By.id("day"));
		Select a=new Select(select);
		a.selectByValue("10");
		WebElement select1 = driver.findElement(By.id("month"));
		Select b=new Select(select1);
		b.selectByValue("7");
		WebElement select2 = driver.findElement(By.id("year"));
		Select c=new Select(select2);
		c.selectByValue("1987");
		driver.findElement(By.name("sex")).click();
		driver.findElement(By.linkText("Male")).click();
		
		

	}

}
