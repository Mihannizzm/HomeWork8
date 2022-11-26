package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class KeyPressesPage {

    private final static SelenideElement inputText = $x(".//input[@type='text']");

    public static void checkEnteredKey() {
        inputText.val("a");
        System.out.println("Ввожу символ \"a\" ");
        $(byText("You entered: A")).shouldBe(Condition.visible);
        System.out.println("Отображается текст: \"You entered: A\"");
        inputText.pressTab();
        System.out.println("Нажимаю клавишу TAB");
        $(byText("You entered: TAB")).shouldBe(Condition.visible);
        System.out.println("Отображается текст: \"You entered: TAB\"");
    }
}
