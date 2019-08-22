package org.test;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screens {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-HariJava\\Debugging\\NEDriver\\chromedriver.exe");
	WebDriver w = new ChromeDriver();
	w.get("https://www.flipkart.com/");
	WebElement e = w.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	e.click();
	Thread.sleep(3000);
	WebElement f = w.findElement(By.xpath("//input[@name='q']"));
	f.sendKeys("Iphone Mobiles");
	WebElement t = w.findElement(By.xpath("//button[@class='vh79eN']"));
	t.click();
	Thread.sleep(3000);
	WebElement y = w.findElement(By.xpath("(//img[@class='_1Nyybr  _30XEf0'])[1]"));
	y.click();
	String par = w.getWindowHandle();
	Set<String> l = w.getWindowHandles();
	for (String x : l) {
		if(!x.equals(par));
		w.switchTo().window(x);
		}
	TakesScreenshot tr = (TakesScreenshot)w;
	File src = tr.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\asus\\eclipse-HariJava\\Debugging\\Screenshots\\Five.png");
	FileUtils.copyFile(src,des);
	
	
	
	
	
	
	
	
	
	
	}
	
}
