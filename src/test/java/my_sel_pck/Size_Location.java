package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Size_Location {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='divLogo']//img"));
	/*	
		// Find Location Method-1
		
		System.out.println(logo.getLocation()); // 451 75
		System.out.println(logo.getLocation().getX()); // 451
		System.out.println(logo.getLocation().getY()); //75
		
		//  Find Location Method-2
		
		System.out.println(logo.getRect().getX()); //451
		System.out.println(logo.getRect().getY()); // 75
	*/	
		//Size Method-1
		System.out.println(logo.getRect().getDimension().getWidth());//445
		System.out.println(logo.getRect().getDimension().getHeight());//87
		
		//Size Method-2
		
		System.out.println(logo.getSize()); // 445 87
		System.out.println(logo.getSize().getWidth()); //445
		System.out.println(logo.getSize().getHeight()); //87
		
		
	}

}
