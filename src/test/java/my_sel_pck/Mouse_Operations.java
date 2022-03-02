package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Operations {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Mouse Right click Action -- URL not working
		//driver.get("http://swisnl.github.io/jquery-contextmenu/demo.html");
	/*	
		//Mouse Double click Action
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement field1 = driver.findElement(By.xpath("//input[@id='field1']"));
		field1.clear();
		field1.sendKeys("Welcome Mayank Madhur");
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		*/
	/*	
		//Mouse Drag and Drop
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement itlay = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(rome, itlay).perform();
	*/
		
		//Mouse Hover operation
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac= driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().perform();
					
		
	}

}
