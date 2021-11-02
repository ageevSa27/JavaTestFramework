package ru.me.framework.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstItemPage extends BasePage{

    @FindBy(xpath = "//div[@class='ib toggle-off']")
    private WebElement firstComparing;

    @FindBy(xpath = "//input [@name='search_']")
    private WebElement searchFild;

    public FirstItemPage clickfirstComparing(){
        firstComparing.click();
        return this;
    }

    public FirstItemPage clickSearchFild(){
        searchFild.click();
        return this;
    }

    public FirstItemPage fillSearchFild(){
        searchFild.sendKeys("Дрель");
        return this;
    }

    public SecondShowcasePage enterSearchFild(){
        searchFild.sendKeys(Keys.ENTER);
        return new SecondShowcasePage();
    }



}
