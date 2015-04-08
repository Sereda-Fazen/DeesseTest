package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import page.Search;

/**
 * Created by Dima on 12.03.2015.
 */
public class SearchSteps extends ScenarioSteps {
    Search searchPage;

    public SearchSteps(Pages pages) {
        super(pages);
    }

    @Step("Запустил браузер")
    public void start_browser() {
        Search loginPage = getPages().get(Search.class);
        loginPage.open();
    }

    @Step("Ввел в поиск")
    public void addInput() {
        searchPage.setInput();
    }

    @Step("Выбрал вариант и кликнул")
    public void addSearch() {
        searchPage.setSearch();
    }


}
