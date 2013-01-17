package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyPage{

public WebDriver driver;

	@FindBy(tagName = "title")
	public WebElement pageTitle;
   
    @FindBy(css = ".username>span")
    public WebElement loginConfirmation;

    
        
public MyPage(WebDriver dr) {
driver = dr;
}

    
  }