package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Auth extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;


    @FindBy(className = "ajaxPage")
    private WebElement addClickAuth;


    @FindBy(id = "input-email")
    private WebElement addEmail;

    @FindBy(id = "input-password")
    private WebElement addP;

    @FindBy(xpath = "//*[@id='ajax2login']/input")
    private WebElement addEn;


    @FindBy(linkText = "Sereda Alexander")
    private WebElement userName;


    public Auth(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }


    public void setClick() {
        clickOn(addClickAuth);
    }

    public void setEmail() {
        enter("fazen7@mail.ru").into(addEmail);
    }

    public void setP() {
        enter("12345").into(addP);
    }

    public void setEn() {
        clickOn(addEn);
    }


    public String getTextFromPage() {
        return $(userName).getText();
    }

}
