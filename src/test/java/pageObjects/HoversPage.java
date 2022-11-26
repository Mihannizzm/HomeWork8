package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$x;

public class HoversPage {

    private final static ElementsCollection usersAvatars = $$x(".//img[@alt='User Avatar']");


    public static void hoverAvatar(int userNumber) {
        int userIndex = userNumber - 1;
        usersAvatars.get(userIndex).hover();
        System.out.println("Навожу курсор аватар пользвателя " + userNumber);
        $(byText("name: user" + userNumber)).shouldBe(Condition.visible);
        System.out.println("Всплывающая информация о пользователе " + userNumber + " отображается на странице");

    }

}
