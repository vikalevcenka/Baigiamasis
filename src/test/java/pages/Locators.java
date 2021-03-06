package pages;

import org.openqa.selenium.By;

public class Locators {

    public static class Netflix {

        public static class Login {

            //1st Test
            //press Sign In
            public static By headerLogIn = By.xpath("//*[@data-uia = 'header-login-link']");

            //login page email or phone number
            public static By inputValueEmail = By.xpath("//*[@id = 'id_userLoginId']");

            //login page password
            public static By inputValuePassword = By.xpath("//*[@id = 'id_password']");

            //checkbox Remember me
            public static By checkbox = By.xpath("//*[@class = 'login-remember-me-label-text']");

            //press Sign In
            public static By buttonSignIn = By.xpath("//*[@data-uia = 'login-submit-button']");
            public static By buttonReject = By.xpath("//*[@class = 'btn-reject btn-red']");
        }



    }
}
