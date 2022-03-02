package my_sel_pck;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit_wait {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Explicit wait syntax
		// WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);

		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")))
		//This is Element specific

		WebElement element = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'WebDriver')]")));
		element.click();
		
		//driver.close();

	}

}
