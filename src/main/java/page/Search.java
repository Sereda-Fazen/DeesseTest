package page;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.thoughtworks.selenium.SeleneseTestBase.assertFalse;
import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by Dima on 03.03.2015.
 */
public class Search extends PageObject {
    private static final Integer CATALOG_WAIT_FOR_TIMEOUT = 5000;

    /*Search product 1*/

    @FindBy(name = "search")
    private WebElement input;

    @FindBy(xpath = "//*[@id='livesearch_search_results']/li[1]/a")
    private WebElement search;

    @FindBy(className = "input-group-btn")
    private WebElement True;

    @FindBy(className = "close")
    private WebElement close;





    public Search(WebDriver driver) {
        super(driver, CATALOG_WAIT_FOR_TIMEOUT);
    }

    public void setInput() {
        enter("Экокожа").into(input);
    }
    public void setSearch () {
        clickOn(search);
       assertEquals(true, element(True).isPresent());
       assertFalse("Error",element(close).isPresent());
    }








}


