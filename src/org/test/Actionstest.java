package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionstest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-HariJava\\Debugging\\NEDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("https://www.shopclues.com/wholesale.html");
		Actions a = new Actions(w);
		WebElement e = w.findElement(By.xpath("//a[text()='Mobiles & Electronics']"));
		a.moveToElement(e).perform();
		WebElement r = w.findElement(By.xpath("//a[text()='Rs.5001 - Rs.10000']"));
		r.click();
		
		
		
	}

}
