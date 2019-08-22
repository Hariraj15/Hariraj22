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

public class WindowScreenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\eclipse-HariJava\\Debugging\\NEDriver\\chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.get("https://www.amazon.in/");
	WebElement f = d.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	f.sendKeys("Motorola Mobiles");
	WebElement g = d.findElement(By.xpath("(//input[@class='nav-input'])[1]"));
	g.click();
	WebElement i = d.findElement(By.xpath("(//img[@class='s-image'])[1]"));
	i.click();
	WebElement j = d.findElement(By.xpath("(//img[@class='s-image'])[2]"));
	j.click();
	WebElement k = d.findElement(By.xpath("(//img[@class='s-image'])[3]"));
	k.click();
	WebElement l = d.findElement(By.xpath("(//img[@class='s-image'])[4]"));
	l.click();
	String par = d.getWindowHandle();
	Set<String> All = d.getWindowHandles();
	int count=0;
	for (String x : All) {
		if(count==5) {
			d.switchTo().window(x);
			}
		count=count+1;
		}
	TakesScreenshot tr = (TakesScreenshot)d;
	File src = tr.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\asus\\eclipse-HariJava\\Debugging\\Screenshots\\Six.png");
	FileUtils.copyFile(src, des);
	
		
	}
	
	
	
	}


