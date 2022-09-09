package org.trail;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
		
		List<Integer> li=new LinkedList<Integer>();
		
		li.add(130000);
		li.add(13499);
		li.add(100000);
		
		List<String> pr=new LinkedList<String>();
		
		pr.add("iphone11");
		pr.add("iphone 12");
		pr.add("iphone 13");
		
		Collections.sort(li);
		System.out.println(Collections.max(li));
		System.out.println(Collections.min(li));
		Collections.reverse(li);
		
		System.out.println(li);
		
		Collections.sort(li,Collections.reverseOrder());
		System.out.println(li);
		
		
		Map<String,Integer> mp=new LinkedHashMap<String,Integer>();
		
		for (int i=0; i<li.size(); i++) {
			System.out.println(pr.get(i)+"---------"+li.get(i));
			mp.put(pr.get(i), li.get(i));
			
		}
		System.out.println(mp);
		System.out.println(mp.get("iphone 13"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
