package ru.me.framework.manager;

import ru.me.framework.page.*;

public class PageManager {
    private static PageManager pageManager;
    private StartPage startPage;
    private ShowcasePage showcasePage;
    private FirstItemPage firstItemPage;
    private SecondShowcasePage secondShowcasePage;
    private SecondItemPage secondItemPage;

    private PageManager() {
    }

    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }

    public ShowcasePage getShowcasePage() {
        if (showcasePage == null) {
            showcasePage = new ShowcasePage();
        }
        return showcasePage;
    }

    public FirstItemPage getFirstItemPage() {
        if (firstItemPage == null) {
            firstItemPage = new FirstItemPage();
        }
        return firstItemPage;
    }

    public SecondShowcasePage getSecondShowcasePage() {
        if (secondShowcasePage == null) {
            secondShowcasePage = new SecondShowcasePage();
        }
        return secondShowcasePage;
    }

    public SecondItemPage getSecondItemPage() {
        if (secondItemPage == null) {
            secondItemPage = new SecondItemPage();
        }
        return secondItemPage;
    }

    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

}
