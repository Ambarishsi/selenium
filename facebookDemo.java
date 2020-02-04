package sell_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookDemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dripreport");
		driver.findElement(By.partialLinkText("account")).click();
		//driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//driver.findElement(By.className("s-image")).click();
		//driver.findElement(By.xpath("/html/body")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("nike+vaulc+delta+force&ref=nb_sb_noss")).click();
		//Thread.sleep(2000);
		driver.close();

	}

}
