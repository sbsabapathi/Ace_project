package Ace_POM_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class SmokeTest {
	private WebDriver driver;
	HomePage hp = null;

	@BeforeClass
	public void beforeClass() throws Exception {
		driver = new FirefoxDriver();
	}

	@Test
	public void smokeTest() throws Exception {

		HomePage hp = PageFactory.initElements(driver, HomePage.class);

		Assert.assertEquals(hp.pageTitle.getText(), "Acetrax Movies Homepage");

		Assert.assertEquals(hp.navMenu.size(), 7);

		hp.signUpBtn.click();

	}

	@AfterClass
	public void afterClass() throws Exception {
		driver.quit();
	}

}
