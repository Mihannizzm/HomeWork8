package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class DynamicallyLoadedPage {

    private final static SelenideElement linkExample2 = $(byText("Example 2: Element rendered after the fact"));
    private final static SelenideElement startButton = $(byText("Start"));
    private final static SelenideElement expectedText = $(byText("Hello World!"));
    private final static SelenideElement loader = $x(".//div[@id='loading']");

    public static void dynamicallyLoaded() {
        linkExample2.click();
        System.out.println("Нажимаю на: \"Example 2: Element rendered after the fact\"");
        startButton.click();
        System.out.println("Нажимаю на кнопку \"Start\"");
        System.out.println("Ожидаю окончания загрузки");
        loader.shouldBe(Condition.disappear, Duration.ofSeconds(30));
        expectedText.shouldBe(Condition.visible);
        System.out.println("Текст \"Hello World!\" отображается на странице");
    }
}
