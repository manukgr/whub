import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FbHomePage extends BasePage{
    WebDriver driver = DriverFactory.getDriver();

    @FindBy(partialLinkText="on your mind")
    public WebElement post;

    @FindBy(partialLinkText="on your mind")
    public WebElement postTextField;

    @FindBy(linkText="Post")
    public WebElement postButton;

    @FindBy(linkText = "Hello World")
    public WebElement postedText;

    @FindBy(css="div[aria-label=\"Menu\"]")
    public WebElement menuButton;

    public void openPage(){
        PageFactory.initElements(driver, this);
        FbLoginPage pg =new FbLoginPage();
        pg.openPage();
        pg.login();
    }

    public void post(String message){
        post.click();
        postedText.sendKeys(message);
        postButton.click();
    }

}
