package Ace_POM_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class SignUpTest {
private WebDriver driver;
HomePage hp = null;

@BeforeClass
public void beforeClass() throws Exception {
driver = new FirefoxDriver();
}

@Test
public void test() throws Exception{

HomePage hp = PageFactory.initElements(driver, HomePage.class);

Assert.assertEquals(hp.pageTitle.getText(), "Acetrax Movies Homepage");

SignUpPage sPage = hp.clickSignup();
sPage.SignUp("ssbabu@hotmail.co.uk", "password", "123456", "word");
Thread.sleep(2000);
Assert.assertEquals(sPage.wordError.getText(), "Enter the word on the picture");
}

@AfterClass
public void afterClass() throws Exception {
	driver.quit();
}

}
