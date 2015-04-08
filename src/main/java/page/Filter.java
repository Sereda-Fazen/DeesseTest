package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestBase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Dima on 20.03.2015.
 */
public class Filter extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 10000;
    //Price
    @FindBy (xpath = "//*[@id='filter-price']/div[1]")
    private WebElement price;
    @FindBy (xpath = "//*[@id='left-begun']")
    private WebElement leftPrice;
    @FindBy (xpath = "//*[@id='right-begun']")
    private WebElement rigthPrice;
    //Показать
    @FindBy (xpath = "//*[@id='filter-button']/span")
    private WebElement view;


    //Color
    @FindBy (xpath = "//*[@id='other-options']/div[4]/div[1]/span")
    private WebElement color;

    @FindBy (xpath = "//*[@id='v-5125']/input")
    private WebElement selectСolor1;
    @FindBy (xpath = "//*[@id='v-40260']/span/button")
    private WebElement selectColor2;
    @FindBy (xpath = "//*[@id='v-40263']/span/button")
    private WebElement selectColor3;
    // button
    @FindBy (xpath = "//*[@id='other-options']/div[4]/div[2]/div/span")
    private WebElement selectButton;
    //True
    @FindBy(xpath = "//*[@id='product-filter']/form/div[4]/a/span")
    private WebElement selectPrice;


    @FindBy(xpath = "//*[@id='contentRow']/div/div/div[2]/div/div[1]/div[3]/button")
    private WebElement selectColorTrue;
    //False
    @FindBy(xpath = "//*[@id='wrapper']/div/div[2]")
    private WebElement selectColorFalse;


    public void setFilterPrice() throws InterruptedException {

        clickOn(price);
        Actions min1 = new Actions(getDriver());
        min1.dragAndDropBy(leftPrice, 10, 0).perform();
        Thread.sleep(1000);

        Actions max1 = new Actions(getDriver());
        max1.dragAndDropBy(rigthPrice, -10, 0).perform();
        Thread.sleep(1000);

        Actions min2 = new Actions(getDriver());
        min2.dragAndDropBy(leftPrice, 50, 0).perform();
        Thread.sleep(1000);


        Actions max2 = new Actions(getDriver());
        max2.dragAndDropBy(rigthPrice, -50, 0).perform();
        Thread.sleep(1000);

        clickOn(view);
        assertTrue(element(selectPrice).isPresent());
        clickOn(selectPrice);

    }
    public void setFilterColor() {
        clickOn(color);
        clickOn(selectСolor1);


    }
    public void setButton () throws InterruptedException{
        clickOn(selectButton);
    }

    public Filter (WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public String getTextNote () {
        return $(selectPrice).getText();
    }

}
