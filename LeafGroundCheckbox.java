package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement checkbox = driver.findElement(By.xpath("//span[text()='Basic']"));
		// Check if the checkbox is not selected (optional)
		if (!checkbox.isSelected()) {
            // Click on the checkbox to select it
            checkbox.click();
        }
        WebElement checkbox1 = driver.findElement(By.xpath("//span[text()='Ajax']"));
        if (!checkbox1.isSelected()) {
        	checkbox1.click();
        	}
        
        
        WebElement checkbox2 = driver.findElement(By.xpath("//label[text()='Java']"));
        if (!checkbox2.isSelected()) {
        	checkbox2.click();
        	}
        WebElement checkbox3 = driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]"));
        if (!checkbox3.isSelected()) {
        	checkbox3.click();
        	}
        WebElement a1 = driver.findElement(By.xpath("(//div[@class='ui-growl ui-widget'])[2]"));
        if(!a1.isEnabled()){
     	   System.out.println("The expected message is not displayed.");
        } else {
     	   System.out.println("The expected message is displayed.");
        
        }
       driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
       WebElement checkbox4 = driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']"));
       if (!checkbox4.isEnabled()) {
    	   System.out.println("The expected message is not displayed.");
       } else {
    	   System.out.println("The expected message is displayed.");
       
       }
       WebElement b1 = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
       if(!b1.isEnabled()){
    	   System.out.println("Verified as enabled.");
       } else {
    	   System.out.println("Verified as disabled.");
       
       }
       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();
       driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[6]")).click();
       driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[7]")).click();
       driver.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[8]")).click();
       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
       driver.close();
       
       
       
       

        


        
        
        
        	

	}

}
