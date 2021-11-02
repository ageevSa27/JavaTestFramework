package ru.me.framework.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static ru.me.framework.utils.PropConst.*;

public class DriverManager {
    private static WebDriver driver;
    private static TestPropManager props = TestPropManager.getTestPropManager();


    private DriverManager() {
    }


    private static void initDriver() {
        switch (TestPropManager.getTestPropManager().getProperty(TYPE_BROWSER)) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", props.getProperty(PATH_CHROME_DRIVER));
                driver = new ChromeDriver();
                break;
        }
    }


    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }

}
