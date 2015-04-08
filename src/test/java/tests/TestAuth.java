package tests;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import utils.Application;


@Story(Application.TestAuth.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class TestAuth extends BeforeClass {
    @ManagedPages(defaultUrl = "http://deesse.com.ua/cumki")
    public Pages pages;

    @WithTag("Регистрация")
  //@Test
    public void OneTestRegistration() throws InterruptedException {


        compare.addClick();
        name.addName();
        mail.addMail();
        phone.addPhone();
        adres.addAdress();
        city.addCity();
        pass1.addPass1();
        pass2.addPass2();
        select.addSelect();
        button.addButton();
        Thread.sleep(3000);
    }

    @WithTag("Авторизация")
   //@Test
    public void TwoTestAuth() throws InterruptedException {

        compare1.addClickAuth();
        email.addEmail();
        pass.addP();
        enter.addEn();

    }

    @WithTag("Поиск")
 //@Test
    public void TreeTestSearch() throws InterruptedException {



        input.addInput();
        Thread.sleep(3000);
        submit.addSearch();

    }
    @WithTag("Заказ")
   // @Test
    public void FourTestOrder() throws InterruptedException {

        click.addClick();
        clickProd.addClickProd();
        buy.addBuy();
        orderBuy.addOrderBuy();
        nameOrder.addName();
        emailOrder.addEmail();
        phoneOrder.addPhone();
        order.addOrder();
        Thread.sleep(3000);
    }
    @WithTag("Фильтр")
  @Test
    public void FiveTestFilter() throws InterruptedException {

        price.addPrice();
      // size.addSize();
      color.addColor();
    buttons.addButton();
    }



}



