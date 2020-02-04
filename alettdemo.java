package selinium_automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alettdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("http://demo.automationtesting.in/Alerts.html");
		
		d.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		d.findElement( By.xpath("//*[@id=\"OKTab\"]/button")).click();
		d.switchTo().alert().accept();
		
		d.findElement( By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		d.findElement( By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		d.switchTo().alert().dismiss();
		
		
		d.findElement( By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		d.findElement( By.xpath("//*[@id=\"Textbox\"]/button")).click();
		d.switchTo().alert().sendKeys("ambarish");
		d.switchTo().alert().accept();
		
		Thread.sleep(4000);
	}

}
