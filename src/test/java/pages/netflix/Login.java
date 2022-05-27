package pages.netflix;

import pages.Common;
import pages.Locators;

public class Login {

    public static void open(){
        Common.openUrl("https://www.netflix.com/lt/");

    }
    public static void clickLogin() {
        Common.clickElement(Locators.Netflix.Login.headerLogIn);

    }
    public static void typeEmail(String email) {
        Common.sendKeysToElement(Locators.Netflix.Login.inputValueEmail,email);

    }
    public static void typePassword(String password) {
        Common.sendKeysToElement(Locators.Netflix.Login.inputValuePassword,password);

    }

    public static void clickSignIn() {
        Common.clickElement(Locators.Netflix.Login.buttonSignIn);
    }

    public static void checkIfUrlChangesTo(String url) {
        Common.waitForUrlToBe(url);
    }

    public static void clickRejectOnCookies() {
        Common.clickElement(Locators.Netflix.Login.buttonReject);
    }
}
