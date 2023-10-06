package assignment4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement d = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions aa = new Actions(driver);
		aa.moveToElement(d).perform();
		driver.findElement(By.xpath("//span[@class='linkTest']")).click();
		String items = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
		System.out.println(items);
		driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::i")).click();
	    WebElement mm = driver.findElement(By.xpath("//li[@class='search-li']"));
	    mm.click();
	    Thread.sleep(2000);
		List<WebElement> productPrice = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
		List<Integer> prices = new ArrayList<Integer>();
		for(int i=1; i<=productPrice.size();i++) {
	    	 Thread.sleep(2000);
	    	 String price = driver.findElement(By.xpath("(//span[@class='lfloat product-price'])["+i+"]")).getText();
	    	 int parseInt = Integer.parseInt(price.replaceAll("[^0-9]", ""));
				prices.add(parseInt);
	     }
	   
	     boolean flag =false;
			for(int i=0;i<prices.size()-1;i++) {
				if((prices.get(i))<=(prices.get(i+1))) {
					
				flag=true;	
				}else {
					flag = false;
					
					break;
				}
			}
	     if(flag) {
	    	 System.out.println("Prices sorted succesfully");
	     }else {
	    	 System.out.println("Price not sorted");
	    	 }
	     WebElement yy = driver.findElement(By.xpath("//a[@class='price-slider-scroll left-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
	     int minHandlePosition = 1;
	     Actions y = new Actions(driver);
	     y.clickAndHold(yy);
	     y.moveByOffset(minHandlePosition, 0);
	     y.release();
	     y.perform();
	     Thread.sleep(2000);
	     WebElement xx = driver.findElement(By.xpath("//a[@class='price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded']"));
	  // Calculate the offset to move the slider handle backward 
	        int backwardOffset = -150;
	     Actions x = new Actions(driver);
	     x.clickAndHold(xx);
	     x.moveByOffset(backwardOffset, 0);
	     x.release();
	     x.perform();
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//label[@for='Color_s-Black']")).click();
	     Thread.sleep(5000);
	     WebElement oo = driver.findElement(By.xpath("//div[@class='navFiltersPill']//a"));
	     if(oo.getText().contains("Rs.528-Rs.698")) {
	    	 System.out.println("Filters are verified");
	     }else {
	    	 System.out.println("Filters are not verified");
	     }
	     WebElement oo1 = driver.findElement(By.xpath("(//div[@class='navFiltersPill']//a)[2]"));
	     if(oo1.getText().contains("Black")) {
	    	 System.out.println("Again the filters are verified");
	     }else {
	    	 System.out.println("Again the filters are not verified");
	     }
	     Thread.sleep(5000);
	     WebElement cc = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
	     Actions cc1 = new Actions(driver);
	     cc1.moveToElement(cc);
	     driver.findElement(By.xpath("//div[@class='clearfix row-disc']")).click();
	     String wholePrice = driver.findElement(By.xpath("//span[text()='549 ']")).getText();
	     System.out.println("Cost:" + wholePrice);
	     Thread.sleep(5000);
	     String discount = driver.findElement(By.xpath("//span[text()='21% Off']")).getText();
	     System.out.println("Discount:" + discount);
	     WebElement shoeImg = driver.findElement(By.xpath("(//div[@class='bx-wrapper'])[2]"));
	     File src = shoeImg.getScreenshotAs(OutputType.FILE);
	     File des = new File("./Snaps/shoeImg.png");
	     FileUtils.copyFile(src, des);
	     driver.switchTo().defaultContent();
	     driver.close();
	     
}}
        






		
		  
    



