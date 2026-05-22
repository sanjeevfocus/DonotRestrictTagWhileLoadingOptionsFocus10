package com.focus.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	
	
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//*[@id='identifierId']"));
		ele.sendKeys("sanjeevkumar@focussoftnet.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		//*[@id='password']/div[1]/div/div[1]/input
		WebElement ele2=driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
		ele2.sendKeys("Purvi@123");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@class='gb_A gb_Ka gb_f']")).click();
		
		Thread.sleep(3000);
		
		WebElement ele3=driver.findElement(By.xpath("//div[text()='Sign out']"));
		
		
		
	}

}
