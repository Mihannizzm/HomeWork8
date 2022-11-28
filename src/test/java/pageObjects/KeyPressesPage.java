package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class KeyPressesPage {

    private final static SelenideElement inputText = $x(".//input[@type='text']");

    public static void checkEnteredKey(String symbol, String key) {
        inputText.sendKeys(symbol);
        System.out.println("Ввожу символ: " + symbol);
        String symbolForCheck = symbol.toUpperCase();
        $(byText("You entered: " + symbolForCheck)).shouldBe(Condition.visible);
        System.out.println("Отображается текст: \"You entered: " + symbolForCheck + "\"");

        inputText.sendKeys(Keys.valueOf(key));
        System.out.println("Нажимаю клавишу: " + key);
        $(byText("You entered: " + key)).shouldBe(Condition.visible);
        System.out.println("Отображается текст: \"You entered: " + key + "\"");
    }
}
