package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Filter;
import page.Order;
import page.Search;

/**
 * Created by Dima on 12.03.2015.
 */
public class FilterSteps extends ScenarioSteps {
    Filter  filterPage;

    public  FilterSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Filter loginPage = getPages().get( Filter.class);
        loginPage.open();
    }

    @Step("Выбрал цену")
    public void addPrice() throws InterruptedException{
        filterPage.setFilterPrice();
    }
    @Step("Выбрал размер")
    public void addSize() {
        filterPage.setFilterSize();
    }
    @Step("Выбрал цвет")
    public void addColor() {
        filterPage.setFilterColor();
    }
    @Step("Кликнул" )
    public void addButton() throws InterruptedException{
        filterPage.setButton();
    }







}




