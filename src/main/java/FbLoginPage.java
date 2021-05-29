import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FbLoginPage extends BasePage{
    WebDriver driver = DriverFactory.getDriver();
    private final static String fbPage = "https://www.facebook.com/";
    @FindBy(id = "email")
    public WebElement emailBox;

    @FindBy(id = "pass")
    public WebElement passwordBox;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(css="div[aria-label=\"Menu\"]")
    public WebElement menuButton;
    public void openPage(){
        PageFactory.initElements(driver, this);
        driver.get(fbPage);
    }

    public void login(){
        emailBox.sendKeys(System.getProperty("fbUsername"));
        passwordBox.sendKeys(System.getProperty("fbPassword"));
        loginButton.click();
    }

}
