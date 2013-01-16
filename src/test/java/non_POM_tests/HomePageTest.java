package non_POM_tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class HomePageTest {

	private WebDriver driver;

	@Test
	public void homeTest() {
		driver.get("http://www.acetrax.com");

		Assert.assertEquals("Acetrax Movies Homepage", driver.getTitle(),
				"Title is wrong");

		Assert.assertTrue(driver.findElement(By.cssSelector("#nav-01 > a"))
				.isDisplayed());

		List<WebElement> options = driver.findElements(By
				.cssSelector("ul#nav li"));
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getAttribute("id") + "  ----  "
					+ options.get(i).getAttribute("value"));
		}

	}

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
