package selinium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class raddiff {
	static WebDriver d;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Ambarish");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("Ambarish");
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Ambarish");
		d.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("Ambarish");
		d.findElement(By.xpath("//input[contains(@name,'hk_altemail')  ]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@name,'gender') and contains(@value,'m') ]")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//input[contains(@name,'gender') and contains(@value,'f') ]")).click();
		Thread.sleep(1000);
		Select s = new Select(d.findElement(By.id("country")));
		s.selectByVisibleText("Swaziland");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@style='width:58px; height: 20px; float:left; cursor: pointer; border:1px solid #C0C0C0; font-size:14px;']")).click();
		Thread.sleep(1000);
		d.findElement(By.xpath("//*[text()='USA / Canada (+1)']")).click();
		Thread.sleep(2000);
		d.quit();
		
	}

}
