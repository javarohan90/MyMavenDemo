package com.qa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	@Test
	public void sum() {
		System.out.println("Sum method");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a + b);
	}

	@Test
	public void sub() {
		System.out.println("Sub method");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b - a);
	}

	@Test
	public void Div() {
		System.out.println("Div method");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b / a);
	}

	@Test
	public void mul() {
		System.out.println("Multi method");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a * b);
	}
	
	@Test
	public void TestD() throws InterruptedException
	{
		WebDriver driver;
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
