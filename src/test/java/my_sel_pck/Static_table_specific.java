package my_sel_pck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_table_specific {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");
		driver.manage().window().maximize();
		
		

	}

}
