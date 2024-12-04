package seleniumpractices;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelExecution {

	@Test(priority = 1, groups = { "regression" })
	public void C() {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		WebElement userNameTextField = driver.findElement(By.xpath("//input[@name='userName']"));

		WebElement passwordTextField = driver.findElement(By.xpath("//input[@name='password']"));

		WebElement submitBtn = driver.findElement(By.xpath("//input[@name='submit']"));

		Reporter.log("before entering user name");
		userNameTextField.sendKeys("Admin");
		Reporter.log("after entering user name");
		Reporter.log("before entering password");
		passwordTextField.sendKeys("Admin");
		Reporter.log("after entering password");
		Reporter.log("before clicking submit btn");
		submitBtn.click();
		Reporter.log("after clicking submit btn");

		WebElement loginSuccessfulMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));

		String loginSuccMsgText = loginSuccessfulMsg.getText();

		SoftAssert verify = new SoftAssert();

		verify.assertEquals(loginSuccMsgText, "Login Successfully");

		verify.assertAll();

		driver.quit();

	}

	@Test(priority = 1, groups = { "smoke", "regression" })
	public void B() {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/index.php",
				"url is not equal to https://demo.guru99.com/test/newtours/index.php");
		driver.quit();
	}

	@Test(priority = 1, groups = { "sanity" })
	public void Z() {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/index.php");

		assertEquals(driver.getTitle(), "Welcome: Mercury Tours", "title is not equal to Welcome: Mercury Tours");
		driver.quit();
	}
}
