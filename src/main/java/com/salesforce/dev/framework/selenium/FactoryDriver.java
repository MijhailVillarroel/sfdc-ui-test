package com.salesforce.dev.framework.selenium;

import org.openqa.selenium.WebDriverException;

/**
 * @author Henrry Salinas.
 *
 * This class handle the logic related to what kind of browser will be used in the test
 */
public final class FactoryDriver {

    private FactoryDriver(){}

    public static IDriver getDriver(String browser) {
        Browser currentBrowser=Browser.valueOf(browser.toUpperCase());
        if(Browser.CHROME.equals(currentBrowser)){
            return new Chrome();
        }else if(Browser.FIREFOX.equals(currentBrowser)){
            return  new Firefox();
        }else if(Browser.SAFARY.equals(currentBrowser)){
            return  new Safary();
        }else if(Browser.IE.equals(currentBrowser)){
            return  new InternetExplorer();
        }else if(Browser.SAUCELAB.equals(currentBrowser)){
            return  new SauceLab();
        }else {
            throw new WebDriverException("Browser not found : " + browser);
        }
    }
}