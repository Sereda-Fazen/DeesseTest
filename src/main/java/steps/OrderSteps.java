package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Order;
import page.Search;

/**
 * Created by Dima on 12.03.2015.
 */
public class OrderSteps extends ScenarioSteps {
    Order orderPage;

    public OrderSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Order loginPage = getPages().get(Order.class);
        loginPage.open();
    }

    @Step("Выбрал категорию")
    public void addClick() {
        orderPage.setClick();
    }

    @Step("Кликнул на категорию")
    public void addClickProd() {
        orderPage.setClickProd();
    }

    @Step("Кликнул Купить")
    public void addBuy() {
        orderPage.setBuy();
    }

    @Step("Кликнул Оформить заказ")
    public void addOrderBuy() {
        orderPage.setOrderBuy();
    }

    @Step("Ввел имя")
    public void addName() {
        orderPage.setName();
    }

    @Step("Ввел майл")
    public void addEmail() {
        orderPage.setMail();
    }

    @Step("Ввел телефон")
    public void addPhone() {
        orderPage.setPhone();
    }

    @Step("Кликнул Подтверждение заказа")
    public void addOrder() {
        orderPage.setOrder();
    }






    @Step ("<strong>Ожидаемый результат: Товар куплен</strong>")
    public String getMsgOrder (){
        {return orderPage.getTextFromOrder();
        }
    }




}




