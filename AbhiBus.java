package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbhiBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Bus']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
        driver.findElement(By.xpath("//a[text()='Today']")).click();
        WebElement busname = driver.findElement(By.xpath("//h5[text()='Yolo Bus']"));
		 String Busname = busname.getText();
		 System.out.println("Busname: " + Busname);
		 driver.findElement(By.xpath("//span[text()='Sleeper']")).click();
		 WebElement Busseats = driver.findElement(By.xpath("(//small[text()='16'])[3]"));
		 String Busseats1 = Busseats.getText();
		 System.out.println("Busseats"+ Busseats1);
		 driver.findElement(By.xpath("//button[text()='Show Seats']")).click();
		 driver.findElement(By.xpath("//span[text()='DU2']")).click();
		 driver.findElement(By.xpath("//p[text()='Sirsuri']")).click();
		 driver.findElement(By.xpath("//p[text()='Attibele Toll Gate']")).click();
		 WebElement Selectedseats = driver.findElement(By.xpath("//span[text()='Seat Selected :']"));
		 String Selectedseats1 = Selectedseats.getText();
		 System.out.println("SelectedSeats"+ Selectedseats1);
		 WebElement Totalfare = driver.findElement(By.xpath("//span[text()='Base Fare :']"));
		 String Busfare = Totalfare.getText();
		 System.out.println("Totalfare"+ Busfare);
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 
		 
		 
		 
		
		

	}

}
