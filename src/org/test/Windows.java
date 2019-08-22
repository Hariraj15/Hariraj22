package org.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-HariJava\\Debugging\\NEDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get(" http://www.flipkart.com");
		WebElement q = w.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		q.click();
		Actions ac = new Actions(w);
		WebElement e = w.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		ac.moveToElement(e).perform();
		Thread.sleep(3000);
		WebElement r = w.findElement(By.xpath("//a[text()='Micromax']"));
		r.click();
		Thread.sleep(3000);
		WebElement t = w.findElement(By.xpath("(//div[@class='_3BTv9X'])[1]"));
		t.click();
		String k = w.getWindowHandle();
		Set<String> l = w.getWindowHandles();
		for (String x : l) {
			if(!x.equals(k)) {
				w.switchTo().window(x);
			}
			
			}
		Thread.sleep(3000);
		WebElement p = w.findElement(By.xpath("//button[text()='ADD TO CART']"));
		p.click();
		
		
		
	}

}
