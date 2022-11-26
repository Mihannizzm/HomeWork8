package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.Assert;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class AddRemoveElementsPage {

    private final static SelenideElement addElementButton = $(byText("Add Element"));
    private final static ElementsCollection deleteButton = $$(byText("Delete"));

    public static void addElement(int countElements) {
        for (int i = 1; i <= countElements; i++) {
            addElementButton.click();
        }
        System.out.println("Добавляю " + countElements + " элементов");
        Assert.assertEquals(countElements, deleteButton.size());

        for (int i = 0; i < deleteButton.size(); i++) {
            deleteButton.get(i).shouldBe(Condition.visible);
        }
        System.out.println("Добавленные " + countElements + " элементов отображаются на странице");
    }
}