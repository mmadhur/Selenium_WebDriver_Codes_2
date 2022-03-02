package my_sel_pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Datepicker_1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		String year = "2022";
		String month = "Nov";
		String date = "15";

		driver.findElement(By.id("onward_cal")).click();

		String month_year = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();

		String arr[] = month_year.split(" ");
		String mon = arr[0];
		String yr = arr[1];

		if (mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year)) {

			List<WebElement> all_dates = driver
					.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
			for (WebElement ele : all_dates) {
				String txt = ele.getText();
				if (txt.equals(date)) {
					ele.click();
					break;
				}

			}

		}

		while (!(yr.equalsIgnoreCase(year) && mon.equals(month))) {
			driver.findElement(By.xpath("//td[@class='next']")).click();
			mon = (driver.findElement(By.xpath("//td[@class='monthTitle']")).getText()).split(" ")[0];
		}
		List<WebElement> all_dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']//td"));
		for (WebElement ele : all_dates) {
			String txt = ele.getText();
			if (txt.equals(date)) {
				ele.click();
				break;
			}

		}

	}
}
