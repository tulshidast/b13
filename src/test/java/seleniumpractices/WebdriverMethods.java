package seleniumpractices;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverMethods {	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		// Maximizes the current window if it is not already maximized
		driver.manage().window().maximize();

		// Load a new web page in the current browser window
		driver.get("https://omayo.blogspot.com/");

		// The URL of the page currently loaded in the browser
		System.out.println("Current page url = " + driver.getCurrentUrl());

		// Get the source of the last loaded page.
		// System.out.println("Page source = " + "\n" + driver.getPageSource());

		// Get the title of the current page. omayo (QAFox.com)
		System.out.println("Title of the page is = " + driver.getTitle());

		// Return an opaque handle to this window that uniquely identifies it within
		// this driver instance.
		System.out.println("Current focused window handle = " + driver.getWindowHandle());

		//
		// driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.amazon.in/");

		// A set of window handles which can be used to iterate over all open windows.
		Set<String> windowHandles = driver.getWindowHandles();

		System.out.println(windowHandles.size());

		driver.manage().window().minimize();

		driver.manage().window().maximize();

		// navigations methods
		driver.navigate().to("https://www.amazon.in/");

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();
		
		//driver.close();
		
		driver.quit();

	}

}
