package common;

import com.codeborne.selenide.Configuration;

public class Config {
    public static final String PLATFORM_AND_BROWSER  = "chrome_mac";
    //
    // clear browser cookies
    public static final Boolean CLEAR_COOKIES = false;
    //
    // to keep the browser open after scenario
    public static final Boolean HOLD_BROWSER_OPEN = false;
    //
    //Очистка папки reports
    //
    public static final Boolean CLEAR_REPORTS_DIR = true;
    static {
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
    }
}

