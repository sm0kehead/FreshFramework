package project;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.module.Configuration;

public class BaseClass {

    @Before
    public void before() {
    }

    @After
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
