package ru.me.framework.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondItemPage extends BasePage{

    @FindBy(xpath = "//div[@class='ib toggle-off']")
    private WebElement secondComparing;

    @FindBy(xpath = "//span[text()='Сравнить']")
    private WebElement comparisonPage;

    public SecondItemPage clickSecondComparing(){
        secondComparing.click();
        return this;
    }

    public void clickComparisonPage(){
        comparisonPage.click();
    }




}
