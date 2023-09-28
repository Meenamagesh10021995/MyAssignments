package assignment3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phones");
		driver.findElement(By.xpath("(//div[text()='phones'])[2]")).click();
		
		List<WebElement> PhonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = PhonePrice.size();
		System.out.println("Total number of links:"+size);
		List<String> list = new ArrayList<String>();
		Collections.sort(list);
		System.out.println(list);
		for (WebElement data : PhonePrice) {
			String text = data.getText();
			list.add(text);
			System.out.println(text);
			}
		List<String> list1 = new ArrayList<String>();
        
        Collections.min(list1);
        System.out.println("Minimum element in ArrayList =: "
                           + list1);
		
		
		}
           

       
			
		}
		
		
	


