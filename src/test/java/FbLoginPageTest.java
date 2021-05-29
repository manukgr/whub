import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FbLoginPageTest {
    FbLoginPage page = null;
    @BeforeTest
    public void setupTest() {
       page = new FbLoginPage();
       page.openPage();
    }

    @AfterTest
    public void teardown() {
        if (page != null) {
            page.driver.quit();
        }
    }

    @Test
    public void test_that_user_is_able_to_login_into_facebook() throws InterruptedException {
        page.login();
        assertThat(page.menuButton.isDisplayed()).isTrue();
    }
}
