package ru.me.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShowcasePage extends BasePage {

    @FindBy(xpath = "//a[@href='/INTERSKOL-DU-13-780ER-421-1-0-00.htm']")
    private WebElement item1;



    public FirstItemPage clickItem(){
        item1.click();
        return new FirstItemPage();
    }


}
