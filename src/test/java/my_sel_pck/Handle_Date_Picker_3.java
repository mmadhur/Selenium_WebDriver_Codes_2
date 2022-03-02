package my_sel_pck;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Date_Picker_3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");

		driver.manage().window().maximize();
		driver.findElement(By.id("dob")).click();

		WebElement month_ele = driver.findElement(By.className("ui-datepicker-month"));
		month_ele.click();

		Select monthdrp = new Select(month_ele);
		monthdrp.selectByVisibleText("Nov");

		WebElement year_ele = driver.findElement(By.className("ui-datepicker-year"));
		year_ele.click();
		Select yeardrp = new Select(year_ele);
		yeardrp.selectByVisibleText("2022");

		String date = "15";

		List<WebElement> all_dates = driver
				.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td"));

		for (WebElement item : all_dates) {
			String txt = item.getText();
			if (txt.equals(date)) {
				item.click();
				break;
			}

		}

	}

}
