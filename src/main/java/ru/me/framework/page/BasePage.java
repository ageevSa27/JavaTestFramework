package ru.me.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.me.framework.manager.DriverManager;

public class BasePage {

    public BasePage(){
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 15, 1000);

        PageFactory.initElements(DriverManager.getDriver(), this);
    }


}
