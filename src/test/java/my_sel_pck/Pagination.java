package my_sel_pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Pagination {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/admin/index.php");
		WebElement user_name = driver.findElement(By.name("username"));
		user_name.clear();
		user_name.sendKeys("demo");

		WebElement Pwd = driver.findElement(By.name("password"));
		Pwd.clear();
		Pwd.sendKeys("demo");

		driver.findElement(By.xpath("//button[@type='submit' ]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Sales']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Orders']")).click();
		driver.manage().window().maximize();

		// Getting total number of pages in Dynamic webTable
		driver.findElement(By.xpath("//a[normalize-space()='>|']")).click();
		WebElement ele = driver.findElement(By.xpath("//ul[@class ='pagination']//li//span"));
		ele.click();
		String text = ele.getText();
		// System.out.println(ele.getText());

		int total_pages = Integer.parseInt(text);
		System.out.println(total_pages);

		driver.findElement(By.xpath("//a[normalize-space()='|<']")).click();
		// driver.findElement(By.xpath("//span[normalize-space()='1']")).click();

		for (int i = 1; i <= 3; i++) {
			int rows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr"))
					.size();
			System.out.println(rows);

			WebElement page = driver.findElement(By.xpath("//a[normalize-space()='" + (i + 1) + "']"));
			page.click();

		}

	}
}
