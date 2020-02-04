package sell_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonauto {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike vaulc delta force");
		driver.findElement(By.className("nav-input")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//driver.findElement(By.className("s-image")).click();
		driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("nike+vaulc+delta+force&ref=nb_sb_noss")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
