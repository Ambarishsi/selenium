package sell_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class relativexpath {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @maxlength='2048']")).sendKeys("cbcs");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
	Thread.sleep(1000);
	driver.close();
}}