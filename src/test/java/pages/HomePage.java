package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	@FindBy(tagName = "title")
	public WebElement pageTitle;

	@FindBy(css = "#nav-01>a")
	public WebElement browseBtn;

	@FindBy(css = "#nav-07>a")
	public WebElement signUpBtn;

	@FindBy(id = "login")
	public WebElement signInBtn;

	@FindBy(id = "searchtextbox")
	public WebElement searchBox;

	@FindBy(css = "ul#nav li")
	public List<WebElement> navMenu;

	public void navigateTo(WebDriver driver) {
		driver.get("http://acetrax.com");
	}

	public HomePage(WebDriver dr) {
		driver = dr;
		navigateTo(dr);
	}

	public LoginPage doLogin() {
		signInBtn.click();
		return PageFactory.initElements(driver, LoginPage.class);
	}

	public SignUpPage clickSignup() {
		signUpBtn.click();
		return PageFactory.initElements(driver, SignUpPage.class);
	}

}