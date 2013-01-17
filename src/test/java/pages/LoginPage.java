package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

public WebDriver driver;

	@FindBy(tagName = "title")
	public WebElement pageTitle;
   
    @FindBy(name = "pw")
    public WebElement userName;
    
    @FindBy(name = "new_pw")
    public WebElement passWord;
    
    @FindBy(name = "SignIn")
    public WebElement signIn;
    
        
public LoginPage(WebDriver dr) {
driver = dr;
}

 
    public MyPage login(String uname, String passwd) {
    	userName.sendKeys(uname);
    	passWord.sendKeys(passwd);
    	signIn.click();
    	return PageFactory.initElements(driver, MyPage.class);
         }
    
  }