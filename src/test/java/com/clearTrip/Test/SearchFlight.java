package com.clearTrip.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchFlight {
@Test
public void flightDetail() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where from?']")).sendKeys("Bangalore");
	driver.findElement(By.xpath("(//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500'])[1]")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Where to?']")).sendKeys("Prayagraj");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//p[@class='to-ellipsis o-hidden ws-nowrap fs-3 fw-500'])[1]")).click();
	driver.findElement(By.xpath("//div[@class='fs-4 fw-500 c-inherit flex flex-nowrap ml-4']")).click();
	while(true) {
		try {
			Thread.sleep(1000);
			driver.findElement(By.xpath("//div[text()='August 2023']/../..//div[text()='28']")).click();
			break;
		} catch (Exception e) {
			driver.findElement(By.id("rightArrow")).click();
		}
	}
}
}
