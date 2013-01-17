package Ace_POM_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyPage;
import pages.SignUpPage;

public class LoginTest {
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

LoginPage lPage = hp.doLogin();
MyPage mPage= lPage.login("ssbabu@hotmail.co.uk", "password");
Thread.sleep(2000);
Assert.assertEquals(mPage.loginConfirmation.getText(), "ssbabu@hotmail.co.uk");
}

@AfterClass
public void afterClass() throws Exception {
	driver.quit();
}

}
