package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_webtable_pagination {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://datatables.net/examples/basic_init/zero_configuration.html");

		int count = 0;
		String classText;
		while (true) {
			
			count++;
			WebElement nextbutton = driver.findElement(By.xpath("//a[@id='example_next']"));
			classText = "";
			classText = nextbutton.getAttribute("class");
			//System.out.println(classText);
			if (classText.contains("disabled")) {
				break;
			}
			
			int rows = driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size();
			System.out.println();
			if (count ==3)
			{
				for(int i= 1; i<=rows; i++)
				{
					String names = driver.findElement(By.xpath("//table[@id='example']//tbody//tr["+i+"]/td[1]")).getText();
					System.out.println(names);
					
				}
				break;
			}
						
			nextbutton.click();
		}
		System.out.println(count);
	}
}
   