package com.salesforce.dev;

import com.salesforce.dev.pages.LoginPage;
import com.salesforce.dev.pages.MainPage;
import com.salesforce.dev.pages.TopHeader;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * @author Marcelo Vargas on 6/24/2015.
 * @author Bruno Barrios
 */
public class TestCookies {

    private MainPage mainPage;

    @BeforeMethod(groups = {"BVT"})
    public void setUp() {
        mainPage = LoginPage.loginAsPrimaryUser();
    }

    @Test(groups = {"BVT"})
    public void testCookies() {
        TopHeader topHeader = mainPage.gotoTopHeader();
        assertTrue(topHeader.checkIfCookieIsPresent(),"Cookies not found");
    }
}
