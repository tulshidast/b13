package seleniumpractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitInSelenium {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		WebElement delyedText = driver.findElement(By.cssSelector("#delayedText"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(11));

		System.out.println("Element visible before explicit wait = " + delyedText.isDisplayed());

		wait.until(ExpectedConditions.visibilityOf(delyedText));

		System.out.println("Element visible after explicit wait = " + delyedText.isDisplayed());

	}

}
