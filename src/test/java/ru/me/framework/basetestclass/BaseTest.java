package ru.me.framework.basetestclass;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import ru.me.framework.manager.DriverManager;
import ru.me.framework.manager.InitManager;
import ru.me.framework.manager.PageManager;
import ru.me.framework.manager.TestPropManager;

import java.util.concurrent.TimeUnit;

import static ru.me.framework.utils.PropConst.* ;

public class BaseTest {


    protected PageManager app = PageManager.getPageManager();

    protected TestPropManager testPropManager = TestPropManager.getTestPropManager();

    @BeforeClass
    public static void beforeClass() {
        InitManager.initFramework();
    }

    @Before
    public void before(){
        DriverManager.getDriver().get(testPropManager.getProperty(APP_URL));
    }


    @After
    public void after(){
        InitManager.quitFramework();
    }
}
