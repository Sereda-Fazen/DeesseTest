package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;

/**
 * Created by Dima on 12.03.2015.
 */
public class Order extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 10000;

    /*Search product 1*/

    @FindBy(xpath = "//*[@id='wrapper']/div/header/div/nav/ul/li[2]/a")
    private WebElement click;

    @FindBy(xpath = "//*[@id='contentRow']/div[2]/div/div[2]/div/div[1]/div[2]/button")
    private WebElement clickProd;
    @FindBy(xpath = "//*[@id='contentRow']/div[1]/div/div[2]/div/div[1]/div[2]/button")
    private WebElement clickProdNo;

    @FindBy(id = "button-cart")
    private WebElement buy;





    @FindBy(linkText = "Оформление заказа")
    private WebElement orderBuy;

    @FindBy(id = "payment_address_firstname")
    private WebElement name;

    @FindBy(id = "payment_address_email")
    private WebElement mail;

    @FindBy(id = "payment_address_telephone")
    private WebElement phone;

    @FindBy(id = "confirm_order")
    private WebElement order;



    /*Assert*/
    @FindBy(linkText = "Операция выполнена успешно")
    private WebElement OrderResult;


    public Order(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setClick() {
        clickOn(click);

    }
    public void setClickNotGood() {
        clickOn(clickProdNo);
        if (clickProdNo != null) {
            assertFalse("Нет товра в наличии", element(clickProdNo).isPresent());
        }
    }

    public void setClickProd() {

        clickOn(clickProd);
        if (clickProd == null) {
            assertTrue(element(clickProd).isPresent());
        }

    }
    public void setBuy() {
        clickOn(buy);
    }
    public void setOrderBuy() {
        clickOn(orderBuy);
    }

    public void setName() {
        enter("Саша").into(name);
    }
    public void setMail() {
        enter("fazen7@mail.ru").into(mail);
    }
    public void setPhone() {
        enter("093-663-1070").into(phone);
    }

    public void setOrder() {
        clickOn(order);
    }






    public String getTextFromOrder() {
        return $(OrderResult).getText();
    }



}
