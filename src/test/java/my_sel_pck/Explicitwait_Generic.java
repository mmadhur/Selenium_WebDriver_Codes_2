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

public class Explicitwait_Generic {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);

		By elelocator = By.xpath("//a[contains(text(),'WebDriver')]");
		By eleloc = By.xpath("//a[@id='m-documentationoverview']//span[contains(text(),'Overview')]");

		Explicit_wait_Generic(driver, elelocator, 10).click();
		Explicit_wait_Generic(driver, eleloc, 10).click();

		// WebElement ele = Explicit_wait_Generic(driver, elelocator, 10);
		// ele.click();
	}

	public static WebElement Explicit_wait_Generic(WebDriver driver, By locator, int timeout) {
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		WebElement element = mywait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return driver.findElement(locator);
	}

}
