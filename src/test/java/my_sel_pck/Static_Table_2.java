package my_sel_pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Static_Table_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");

		int rows = driver.findElements(By.xpath("//table[@id ='customers']/tbody/tr")).size();
		System.out.println("Number of rows :" + rows);

		int cols = driver.findElements(By.xpath("//table[@id ='customers']/tbody/tr/th")).size();
		System.out.println("Number of cols :" + cols);

		// Retrieving the table data
		/*
		 * for (int i= 2; i<=rows; i++) { for(int j=1; j<=cols; j++) { String data =
		 * driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+i+"]/td["+j
		 * +"]")).getText(); System.out.println(data); } System.out.println(); }
		 */

		// I want to know the country and contact of Island Trading [The best way]
		/*
		 * for (int r = 2; r<=rows; r++) { String company =
		 * driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+r+"]/td[1]"
		 * )).getText();
		 * 
		 * if (company.equalsIgnoreCase("Island Trading")) { String contact =
		 * driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+r+"]/td[2]"
		 * )).getText(); String country =
		 * driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+r+"]/td[3]"
		 * )).getText();
		 * 
		 * System.out.println(company+ " " +contact+ " "+country); } }
		 */

		// I want to know the country of Ernst Handel
		/*
		 * for (int r = 2; r <= rows; r++) { String country =
		 * driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr[" + r +
		 * "]/td[3]")) .getText();
		 * 
		 * if (country.equalsIgnoreCase("Austria")) { System.out.println(country); } }
		 */
		// I want to know the country of Ernst Handel
		for (int r = 2; r <= rows; r++) {
			String company = driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr[" + r + "]/td[1]"))
					.getText();

			if (company.equalsIgnoreCase("Ernst Handel")) {
				String cont = driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr[" + r + "]/td[3]"))
						.getText();
				System.out.println(cont);
			}

		}

		// I want to know the contact and country of the Laughing Bacchus Winecellars
		/*
		 * for (int r=2; r<=rows; r++) { String contact1
		 * =driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+r+
		 * "]/td[2]")).getText(); String country1
		 * =driver.findElement(By.xpath("//table[@id ='customers']/tbody/tr["+r+
		 * "]/td[3]")).getText();
		 * 
		 * 
		 * if((contact1.equalsIgnoreCase("Yoshi Tannamuri")) &&
		 * (country1.equalsIgnoreCase("Canada"))) { System.out.println(contact1+
		 * " "+country1);
		 * 
		 * }
		 * 
		 * }
		 */

	}

}
