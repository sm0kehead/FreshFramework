package project.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    MainPageElements ele = new MainPageElements();

    public static class MainPageElements {


    }

    @Given("navigate to page {string}")
    public void navigateToPage(String url) {
        switch (url.toLowerCase()) {
            case "jet":
                Selenide.open("https://www.jetbrains.com/");
                break;
            case "google":
                Selenide.open("https://www.google.com/");
            default:
                System.out.println("Nothing found for " + url);
        }
    }

}

