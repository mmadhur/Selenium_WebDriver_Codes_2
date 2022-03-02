package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_innerframe_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");

		WebElement innerframe = driver.findElement(By.xpath("/html/body/iframe"));
		driver.switchTo().frame(innerframe);

		String text = driver.findElement(By.xpath("//h1[contains(text(),'This page is displayed in an iframe')]"))
				.getText();
		
		System.out.println(text);
		driver.switchTo().parentFrame();
		
		// driver.switchTo().frame("iframeResult"); this is not working
		
		String txt = driver
				.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]"))
				.getText();
		System.out.println(txt);
		/*
		 * driver.switchTo().frame(0); Thread.sleep(3000); String text1 =
		 * driver.findElement(By.
		 * xpath("//h1[contains(text(),'This page is displayed in an iframe')]")).
		 * getText(); System.out.println(text1);
		 * 
		 * this part not working i think due to presence of multiple frames...not able
		 * to identify the frame
		 */
	}

}
