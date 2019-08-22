package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GreensDebug {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-HariJava\\Debugging\\NEDriver\\chromedriver.exe");
		WebDriver w = new ChromeDriver();
		w.get("http://www.amazon.in");
		Actions ac = new Actions(w);
		WebElement f = w.findElement(By.xpath("//a[@id='nav-link-shopall']"));
		ac.moveToElement(f).perform();
		
		WebElement g = w.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		ac.moveToElement(g).perform();
		Thread.sleep(3000);
		WebElement t = w.findElement(By.xpath("//span[text()='Power Banks']"));
		t.click();
				
	}

}
