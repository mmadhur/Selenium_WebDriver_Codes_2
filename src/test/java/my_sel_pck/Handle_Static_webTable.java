package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_Static_webTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://softwaretestingo.blogspot.com/2020/09/static-table.html");
		driver.manage().window().maximize();

		// no of rows in a table

		int rows = driver.findElements(By.xpath("//table[@name ='BookTable']/tbody/tr")).size();
		System.out.println("Number of rows in a table is :" + rows);

		// no of cols in a table

		int cols = driver.findElements(By.xpath("//table[@name = 'BookTable']/tbody/tr/th")).size();
		System.out.println("Number of cols in a table is :" + cols);

		// 2nd row and 1st col
		
		String text = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[2]/td[1]")).getText();
		System.out.println(text);// Learn Selenium

		// 1st row (Heading) and 1st col
		
		String txt = driver.findElement(By.xpath("//tbody/tr[1]/th[1]")).getText();
		System.out.println(txt); // BookName

		// Retrieve all the table data by string.format + dynamic xpath
		
		/*
		 * for (int i=2; i<=rows; i++) { for (int j=1; j<=cols; j++) {
		 * System.out.println(driver.findElement(By.xpath(String.format(
		 * "//table[@name='BookTable']/tbody/tr[%s]/td[%s]", i,j))).getText()); } }
		 */
		
		// Retrieve all the table data by dynamic xpath 
		for(int i =2; i<=rows; i++)
		{
			for(int j=1; j<=cols; j++)
			{
				String data = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.println(data+ " ");
			}
			System.out.println();
		}
										

	}

}
