package my_sel_pck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_Action_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement input1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
		WebElement input2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
		Thread.sleep(3000);
		input1.sendKeys("Welcome to Selenium");

		// System.out.println(input1.getText());
		// System.out.println(input1.getAttribute("value"));
		

		Actions act = new Actions(driver);

		// ctrl+A

		act.keyDown(Keys.CONTROL);
		// act.keyDown("a");
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// ctrl+C

		act.keyDown(Keys.CONTROL);
		// act.keyDown("a");
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// Tab

		act.sendKeys(Keys.TAB);
		act.perform();

		// ctrl + V

		act.keyDown(Keys.CONTROL);
		// act.keyDown("a");
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();

		// Compare the texts

		if (input1.getAttribute("value").equals(input2.getAttribute("value"))) {

			System.out.println("Text Copied");

		}

		else {
			System.out.println("Text not copied");
		}

	}

}
