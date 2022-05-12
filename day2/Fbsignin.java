package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fbsignin {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	System.out.println(driver.getTitle());
	driver.findElement(By.name("email")).sendKeys("regelip333@angeleslid.com");
	driver.findElement(By.id("pass")).sendKeys("Jackdaniels@123");
	driver.findElement(By.name("login")).click();
}
}
