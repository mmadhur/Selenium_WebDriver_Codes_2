package my_sel_pck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Dragdrop_images {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		driver.manage().window().maximize();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		

		WebElement item1 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement item2 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));

		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(item1, trash).perform();
		act.dragAndDrop(item2, trash).perform();

	}

}
