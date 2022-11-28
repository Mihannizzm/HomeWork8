import org.junit.Test;
import pageObjects.*;


public class HerokuappTests extends BaseTest {

    @Test
    public void checkboxesTest() {
        MainPage.openMainPage();
        MainPage.clickElementOnMainPage("Checkboxes");
        CheckboxesPage.selectCheckbox();
    }

    @Test
    public void authenticationTest() {
        MainPage.openMainPage();
        MainPage.clickElementOnMainPage("Form Authentication");
        AuthenticationPage.authentication("tomsmith", "SuperSecretPassword!");
        AuthenticationPage.authentication("admin", "admin!");
    }

    @Test
    public void hoversTest() {
        MainPage.openMainPage();
        MainPage.clickElementOnMainPage("Hovers");
        HoversPage.hoverAvatar(3);
    }

    @Test
    public void dynamicallyLoadedTest() {
        MainPage.openMainPage();
        MainPage.clickElementOnMainPage("Dynamic Loading");
        DynamicallyLoadedPage.dynamicallyLoaded();
    }

    @Test
    public void keyPressesTest() {
        MainPage.openMainPage();
        MainPage.clickElementOnMainPage("Key Presses");
        KeyPressesPage.checkEnteredKey("a", "TAB");
    }

    @Test
    public void AddRemoveElementsTest() {
        MainPage.openMainPage();
        MainPage.clickElementOnMainPage("Add/Remove Elements");
        AddRemoveElementsPage.addElement(15);
    }
}
