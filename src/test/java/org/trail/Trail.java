package org.trail;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Trail {

	public static void main(String[] args) {
		
//		
//		System.out.println("start");
//		System.out.println("start1");
//		System.out.println("start3");
//		
//		System.out.println("final");
//		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement ser = driver.findElement(By.id("twotabsearchtextbox"));
		ser.sendKeys("iphone");
		
		WebElement serbtn = driver.findElement(By.id("nav-search-submit-button"));
		serbtn.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		for (WebElement x:list) {
			System.out.println(x.getText());
			
		}
		
		List<WebElement> amount = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (WebElement y:amount) {
			System.out.println(y.getText());
		}
		
		
	}
}
