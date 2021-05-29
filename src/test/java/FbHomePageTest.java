import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;
// mvn clean test -Dbrowser=chrome -DfbUsername=hello -DfbPassword
public class FbHomePageTest {
    FbHomePage page = null;
    @BeforeTest
    public void setupTest() {
        page = new FbHomePage();
        page.openPage();
    }

    @AfterTest
    public void teardown() {
        if (page != null) {
            page.driver.quit();
        }
    }

    @Test
    public void test_that_hello_world_is_posted_successfully() {
        page.post("Hello World");
        assertThat(page.postedText.isDisplayed()).isTrue();
    }
}