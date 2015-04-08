package tests;


import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import steps.*;


import javax.validation.constraints.Size;
import java.io.IOException;

import static org.hamcrest.core.Is.is;


/**
 * Created by rb on 19.01.15.
 */
public class BeforeClass {


    @Managed(uniqueSession = true, driver = "chrome")
        /*Регистрация*/

    public WebDriver driver;
    public String IEPath = "c:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\IEDriverServer.exe";
    public String ChromePath = "c:\\Test\\Automation testing(art-lemon)\\DriverBrowsers\\chromedriver.exe";



    @Steps
    public RegistrationSteps compare;
    @Steps
    public RegistrationSteps name;
    @Steps
    public RegistrationSteps mail;
    @Steps
    public RegistrationSteps phone;
    @Steps
    public RegistrationSteps adres;
    @Steps
    public RegistrationSteps city;
    @Steps
    public RegistrationSteps pass1;
    @Steps
    public RegistrationSteps pass2;
    @Steps
    public RegistrationSteps select;
    @Steps
    public RegistrationSteps button;

    /*Авторизация*/


    @Steps
    public AuthSteps compare1;
    @Steps
    public AuthSteps email;
    @Steps
    public AuthSteps pass;
    @Steps
    public AuthSteps enter;

    /*Поиск*/

    @Steps
    public SearchSteps input;
    @Steps
    public SearchSteps submit;

     /*Заказ*/

    @Steps
    public OrderSteps click;
    @Steps
    public OrderSteps clickProd;
    @Steps
    public OrderSteps buy;
    @Steps
    public OrderSteps buy2;
    @Steps
    public OrderSteps orderBuy;
    @Steps
    public OrderSteps nameOrder;
    @Steps
    public OrderSteps emailOrder;
    @Steps
    public OrderSteps phoneOrder;
    @Steps
    public OrderSteps order;

    // Фильтры

    @Steps
    public FilterSteps price;
    @Steps
    public FilterSteps color;
    @Steps
    public FilterSteps buttons;


    @Before
    public void myTest() throws Exception {
        System.setProperty("webdriver.ie.driver", IEPath);
        System.setProperty("webdriver.chrome.driver", ChromePath);
        compare.start_browser();
        driver.manage().window().maximize();
     // driver.manage().window().setSize(new Dimension(1024, 768));
    }
    @After
    public void close() throws IOException {
        driver.close();
    }

    public void assertText() {
        Assert.assertThat(color.getAssertText(), is("Сбросить все"));
    }








}



