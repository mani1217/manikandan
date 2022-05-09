package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserjava {
public static void main(String[] args) {
 WebDriverManager.chromedriver().setup();
 ChromeDriver driver=new ChromeDriver();
 driver.get("http://leaftaps.com/opentaps/control/main");
 System.out.println(driver.getTitle());
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
String text = driver.findElement(By.tagName("h2")).getText();
System.out.println(text);
driver.findElement(By.linkText("CRM/SFA")).click();
String word = driver.getTitle();
System.out.println(word);
String link = driver.getCurrentUrl();
System.out.println(link);
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Future Automation technologies");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mani");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
driver.findElement(By.className("smallSubmit")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("JD");
String letter = driver.getTitle();
System.out.println(driver.getTitle());
driver.close();

}
}
