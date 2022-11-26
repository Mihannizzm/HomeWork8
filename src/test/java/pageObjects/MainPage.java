package pageObjects;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Главная страница the-internet.herokuapp.com
 */
public class MainPage {

    private final static String BASE_URL = "http://the-internet.herokuapp.com/";

    public static void clickElementOnMainPage(String text) {
        SelenideElement link = $(byText(text));
        link.click();
        System.out.println("Нажимаю на: " + text);
    }

    public static void openMainPage() {
        Selenide.open(BASE_URL);
        System.out.println("Открываю страницу: \"" + BASE_URL + "\"");
    }

}
