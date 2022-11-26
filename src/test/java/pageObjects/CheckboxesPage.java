package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class CheckboxesPage {

    private final static ElementsCollection checkboxes = $$x(".//*[text()='Checkboxes']/..//input");

    public static void selectCheckbox() {
        SelenideElement checkbox1 = checkboxes.first();
        checkbox1.click();
        System.out.println("Нажимаю чекбокс №1");
        checkbox1.shouldBe(Condition.selected);
        System.out.println("Проверяю что нажат");
    }
}
