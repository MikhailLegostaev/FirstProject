///*
package common;

import com.codeborne.selenide.Selenide;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static common.Config.CLEAR_COOKIES;

//
//import org.junit.jupiter.api.Assertions;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//import static common.Config.PLATFORM_AND_BROWSER;
//import static constants.Constant.TimoutVariables.IMPLICIT_WAIT;
//
public class CommonActions {
    private static final Logger LOGGER = LoggerFactory.getLogger(Listener.class);

    public static void clearBrowserCookiEndStorage() {
        if (CLEAR_COOKIES) {
            try {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
                Selenide.executeJavaScript("window.sessionStorage.clear()");
            } catch (Exception e) {
                LOGGER.error("" + e.getMessage());
            }
        }
    }
}