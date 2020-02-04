package sell_proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class raddifwala {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		driver.findElement(By.id("login1")).sendKeys("testing@radiffmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("testing");
		Thread.sleep(1000); 
		driver.findElement(By.id("proceed")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div[2]/div[6]/div[1]/input")).click();
		//x = driver.findElement(By.name("q")).getAttribute("value");
		
		//Thread.sleep(1000);
		//driver.findElement(By.name("btnK")).click();
		//Thread.sleep(2000);
		//b=driver.findElement(By.name("q")).getAttribute("value");
		//a = driver.findElement(By.id("resultStats")).getText();
		//System.out.println(a);
		//System.out.println(chk());
		//driver.quit();
		///driver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[3]/a")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Software Testing Professionals")).click();
		//Thread.sleep(15000);
		driver.quit();
	}
}
