package ru.me.framework.tests;

import org.junit.Test;
import ru.me.framework.basetestclass.BaseTest;

public class FirstTest extends BaseTest {

    @Test
    public void firstTest() {

        // найти дрель
        app.getStartPage()
                .clickSearchFild().fillSearchFild().SendSearchFild()
                // выбрать первую дрель
                .clickItem()
                // доавбить в сравненее и найти еще одну дрель
                .clickfirstComparing().clickSearchFild().fillSearchFild().enterSearchFild()
                // выьбрать вторую дрель
                .clickItem()
                // добавить и перйти в сравнение
                .clickSecondComparing().clickComparisonPage();


    }
}
