package tests.netflix;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Login extends BaseTest {

    @Test
    public void openGoogle() {
        pages.netflix.Login.open();
        pages.netflix.Login.clickRejectOnCookies();
        pages.netflix.Login.clickLogin();
        pages.netflix.Login.typeEmail("");
        pages.netflix.Login.typePassword("");
        pages.netflix.Login.clickSignIn();
        pages.netflix.Login.checkIfUrlChangesTo("https://www.netflix.com/browse");

//        String expectedResult
//
//        Assert.assertEquals(actualResult, expectedResult);
    }
}
