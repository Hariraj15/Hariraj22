package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailCLick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-HariJava\\Debugging\\NEDriver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(" http://www.greenstechnologys.com/");
		Actions a = new Actions(d);
		Thread.sleep(10000);
		WebElement t = d.findElement(By.xpath("//p[contains(text(),'real corporate')] "));
		a.doubleClick(t).perform();
		a.contextClick(t).perform();
	    a.moveToElement(t).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_P);
		
		
		
		
		
		
	}

}
