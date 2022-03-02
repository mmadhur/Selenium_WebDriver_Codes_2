package my_sel_pck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions_vs_Action {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		System.out.println(women.getText());
		System.out.println(women.getAttribute("title"));
		
		Actions act = new Actions(driver);
		//act.moveToElement(women).perform();

		//    OR
		
		Action action = act.moveToElement(women).build();
		action.perform();
		

	}
}

