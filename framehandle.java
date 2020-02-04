package selinium_automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framehandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium Jars\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		d.switchTo().frame(d.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source = d.findElement(By.id("draggable"));
		WebElement dest = d.findElement(By.id("droppable"));
		Actions act = new Actions(d);
		act.dragAndDrop(source, dest).build().perform();
		Thread.sleep(2000);
		d.switchTo().defaultContent();


	}

}
