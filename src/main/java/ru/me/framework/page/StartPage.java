package ru.me.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchFild;


    public StartPage clickSearchFild() {
        searchFild.click();
        return this;
    }

    public StartPage fillSearchFild() {
        searchFild.sendKeys("Дрель");
        return this;
    }

    public ShowcasePage SendSearchFild() {
        searchFild.sendKeys(Keys.ENTER);
        return new ShowcasePage();
    }

}
