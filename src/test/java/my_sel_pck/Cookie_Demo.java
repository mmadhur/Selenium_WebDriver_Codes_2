package my_sel_pck;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cookie_Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/");

		// Capture Cookies from the Browser

		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size()); // 3

		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "------" + cookie.getValue());
		}

		// Add cookie to the Browser

		Cookie cookieobj = new Cookie("mycookie123", "56789");
		driver.manage().addCookie(cookieobj);

		cookies = driver.manage().getCookies();
		System.out.println(cookies.size()); // 4

		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + "------" + cookie.getValue());
		}

		// Delete Specific cookie from the browser

		driver.manage().deleteCookie(cookieobj);
		// driver.manage().deleteCookieNamed("mycookie123");
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());

		// Delete all cookies from the browser
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
	}

}
