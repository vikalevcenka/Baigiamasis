package tests.netflix;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Common;
import tests.BaseTest;
import utils.Driver;

public class netflixLogin extends BaseTest {

    @Test
    public void openGoogle() {
        Common.openUrl("https://www.netflix.com/lt/");
    }

    WebElement buttonLogIn = Driver.findElement;

}
