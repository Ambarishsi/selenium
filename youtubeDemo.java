package selinium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class youtubeDemo { 
	static WebDriver d;
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.youtube.com/");
		Thread.sleep(2000);
		d.findElement(By.id("search")).sendKeys("jab harry met sejal songs");
		d.findElement(By.id("search-icon-legacy") ).click();
		//Actions act = new Actions(d);
		Thread.sleep(3000);
		d.findElement(By.xpath("//*[contains(text(),'Safar Full Video')]")).click();
		Thread.sleep(5000);
		d.quit();
		
	}

}
