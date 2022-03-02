package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download_Files {

	public static void main(String[] args) {

		// String location = System.getProperty(".\\ + \\Downloads\\");
		//	String location = System.getProperty("user.dir") + "\\Downloads\\";

			// CHROME :- Download file in a desired location (Browser settings needed) 
	/*	
		HashMap preferences = new HashMap();
		preferences.put("download.default_directory", location);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption(location, options);
		
	*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]")).click();
		
		
		
		
		
	}

}
