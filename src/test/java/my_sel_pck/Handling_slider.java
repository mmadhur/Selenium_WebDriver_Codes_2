package my_sel_pck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_slider {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();

		WebElement min_slider = driver
				.findElement(By.xpath("//span[@class  ='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		System.out.println(min_slider.getLocation());
		System.out.println(min_slider.getSize());

		// Actions class
		Actions act = new Actions(driver);
		act.dragAndDropBy(min_slider, 100, 0).perform();

		WebElement max_slider = driver.findElement(By.xpath("//span[2]"));
		act.dragAndDropBy(max_slider, -100, 0).perform();
	}

}
