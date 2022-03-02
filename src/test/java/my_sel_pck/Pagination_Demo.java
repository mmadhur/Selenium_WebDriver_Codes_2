package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination_Demo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://www.zaful.com/home/Men?tab=Men");
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//*[@id=\"pageFooter\"]/div[12]/a[1]")).click();
		
		//WebElement clothing = driver.findElement(By.xpath("//span[normalize-space()='CLOTHING']"));
		//Actions act = new Actions(driver);
		//act.moveToElement(clothing).click().perform();
		
		driver.findElement(By.xpath("//span[normalize-space()='BOTTOMS']")).click();
		int count=0;
		String classtext="";
		while(true)
			
		{	
			count++;	
			WebElement nextbutton = driver.findElement(By.xpath("//div[@id='mainWrap']//a[8]"));
			
			classtext= nextbutton.getAttribute("class");
			System.out.println(classtext);
			
			break;
		/*	
			if(classtext.contains("disabled"))
			{
				break;
			}
			nextbutton.click();*/
		}
		
		System.out.println("Total number of pages " +count);
		
	}

}
