package NewPackage;

import org.testng.annotations.DataProvider;

public class DataProvider_inherit {
	@DataProvider(name = "search-data")
    public Object[][] provideSearchData() {
        return new Object[][] {
            {"Selenium WebDriver"},
            {"TestNG DataProvider"},
            {"Cucumber Framework"},
            {"Automated Testing"}
        };
    }
}
