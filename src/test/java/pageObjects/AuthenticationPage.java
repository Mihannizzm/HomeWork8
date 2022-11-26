package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class AuthenticationPage {
    private final static SelenideElement usernameInput = $x(".//input[@id='username']");
    private final static SelenideElement passwordInput = $x(".//input[@id='password']");
    private final static SelenideElement loginButton = $x(".//button[@type='submit']");
    private final static SelenideElement logoutButton = $x(".//a[@href='/logout']");
    private final static SelenideElement successfulAuthText = $(byText("You logged into a secure area!"));
    private final static SelenideElement failAuthText = $(byText("Your username is invalid!"));


    public static void authentication(String login, String password) {
        usernameInput.val(login);
        System.out.println("\nВвожу логин: " + login);
        passwordInput.val(password);
        System.out.println("Ввожу пароль: " + password);
        loginButton.click();
        System.out.println("Нажимаю кнопку \"Login\"");

        if (login == "tomsmith" && password == "SuperSecretPassword!") {
            successfulAuthText.shouldBe(Condition.visible);
            System.out.println("Успешная авторизация!");
            logoutButton.click();
        } else {
            failAuthText.shouldBe(Condition.visible);
            System.out.println("Неверные логин/пароль!");
        }

    }
}
