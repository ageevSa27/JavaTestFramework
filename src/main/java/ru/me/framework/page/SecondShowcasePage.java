package ru.me.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondShowcasePage extends BasePage {

    @FindBy(xpath = "//a[@href='/ZUBR-DSHL-141-K.htm']")
    private WebElement item2;


    public SecondItemPage clickItem(){
        item2.click();
        return new SecondItemPage();
    }

}
