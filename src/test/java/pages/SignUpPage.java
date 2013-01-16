package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage{

public WebDriver driver;

	@FindBy(tagName = "title")
	public WebElement pageTitle;
   
    @FindBy(id = "email1")
    public WebElement emailField;
    
    @FindBy(id = "password")
    public WebElement passwordField;
    
    @FindBy(id = "pintype")
    public WebElement pinField;
    
    @FindBy(id = "uword")
    public WebElement wordField;
    
    @FindBy(id = "checkbox_readterms")
    public WebElement readTerms;
    

    @FindBy(name = "submitUser")
    public WebElement submitBtn;
    
    @FindBy(css = ".caerror_captcha")
    public WebElement wordError;

    
public SignUpPage(WebDriver dr) {
driver = dr;
}

 
    public void SignUp(String email, String passwd, String pin, String word) {
    	emailField.sendKeys(email);
    	passwordField.sendKeys(passwd);
    	pinField.sendKeys(pin);
    	wordField.sendKeys(word);
    	readTerms.click();
    	submitBtn.click();
         }
    
  }