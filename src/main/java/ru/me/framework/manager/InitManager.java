package ru.me.framework.manager;

import java.util.concurrent.TimeUnit;

import static ru.me.framework.manager.DriverManager.quitDriver;
import static ru.me.framework.manager.DriverManager.getDriver;
import static ru.me.framework.utils.PropConst.IMPLICITLY_WAIT;
import static ru.me.framework.utils.PropConst.PAGE_LOAD_TIMEOUT;

public class InitManager {

    private static TestPropManager props = TestPropManager.getTestPropManager();

    public static void initFramework() {
        getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(Integer.parseInt(props.getProperty(PAGE_LOAD_TIMEOUT)), TimeUnit.SECONDS);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(props.getProperty(IMPLICITLY_WAIT)), TimeUnit.SECONDS);

    }

    public static void quitFramework() {
        quitDriver();
    }
}
