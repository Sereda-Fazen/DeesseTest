package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Auth;


public class AuthSteps extends ScenarioSteps {
    Auth authPage;

    public AuthSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Auth loginPage = getPages().get(Auth.class);
        loginPage.open();
    }

    @Step("Кликнул Вход")
    public void addClickAuth() {
        authPage.setClick();
    }

    @Step("Ввел майл")
    public void addEmail() {
        authPage.setEmail();
    }

    @Step("Ввел пароль")
    public void addP() {
        authPage.setP();
    }

    @Step("Кликнул Вход")
    public void addEn() {
        authPage.setEn();
    }

    @Step()
    public String getMsg() {
        return authPage.getTextFromPage();
    }


}


