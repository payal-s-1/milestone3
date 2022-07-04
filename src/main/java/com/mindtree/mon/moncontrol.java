package com.mindtree.mon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class moncontrol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		WebElement l =driver.findElement(By.xpath("//a[@href=https://www.moneycontrol.com/personal-finance/']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(l).build().perform();
		
		driver.findElement(By.xpath("//a[@href='https://www.moneycontrol.com/personal-finance/tools/income-tax-calculator']")).click();
		driver.findElement(By.xpath("//span[@class='styspri icradio_mid checked']'")).click();
		
		
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("20");
		
		Select sc = new Select(driver.findElement(By.className("custselect")));
		sc.selectByVisibleText("Stay in Non Metro city");
		
		driver.findElement(By.cssSelector("[title=Next]")).click();
		
		driver.findElement(By.cssSelector("[id=annual_salary]")).sendKeys("15000");
		driver.findElement(By.cssSelector("[id=other_income]")).sendKeys("15000");
		driver.findElement(By.id("income_tab_next")).click();
		
		driver.findElement(By.id("tax_savings_investment")).sendKeys("2000");
		driver.findElement(By.cssSelector("title=Next")).click();
		
		WebElement obj = driver.findElement(By.className("summary_text"));
		System.out.println(obj.getText());
		
		
	}

	private static WebElement findElement(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}

}
