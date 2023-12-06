package WeatherShopper.Steps_Definitions;

import WeatherShopper.Pages.DashboardPage;
import WeatherShopper.Pages.ProductPage;
import WeatherShopper.Utilities.BrowserUtils;
import WeatherShopper.Utilities.ConfigurationReader;
import WeatherShopper.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MoisturizersStepsDef {
DashboardPage dashboardPage = new DashboardPage();
ProductPage productPage = new ProductPage();

    @Given("User is on the dashboard")
    public void user_is_on_the_dashboard() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);




    }
    @Then("the user checks the temperature")
    public void the_user_checks_the_temperature() {
        dashboardPage.temperature.isDisplayed();
        int currentWeather = dashboardPage.getWeather();

    }
    @Then("the user navigates to the moisturizers or sunscreens product page according to the temperature")
    public void the_user_navigates_to_the_moisturizers_or_sunscreens_product_page_according_to_the_temperature() {
        // Check the weather conditions and shop accordingly
        int currentWeather = dashboardPage.getWeather();
        if (currentWeather < 19) {
            dashboardPage.moisturizersButton.click();
            List<WebElement> moisturizerElements = productPage.MoisturizerProducts;
            List<WebElement> aloeMoisturizers = productPage.getAloeContainingProducts(moisturizerElements);
            List<WebElement> almondMoisturizers = productPage.getAlmondContainingProducts(moisturizerElements);
            if (!aloeMoisturizers.isEmpty()) {
                WebElement leastExpensiveAloeMoisturizer = aloeMoisturizers.stream()
                        .min((product1, product2) -> productPage.compareProductPrices(product1, product2))
                        .orElseThrow(() -> new RuntimeException("No moisturizer with Aloe found"));

                productPage.selectMoisturizer(leastExpensiveAloeMoisturizer);
            }

// Select the least expensive moisturizer with Almond
            if (!almondMoisturizers.isEmpty()) {
                WebElement leastExpensiveAlmondMoisturizer = almondMoisturizers.stream()
                        .min((product1, product2) -> productPage.compareProductPrices(product1, product2))
                        .orElseThrow(() -> new RuntimeException("No moisturizer with Almond found"));

                productPage.selectMoisturizer(leastExpensiveAlmondMoisturizer);
            }

            productPage.AddtoCart.click();
        } else if (currentWeather > 34) {
            dashboardPage.suncreamButton.click();
            System.out.println(currentWeather);
        }
    }



    @Then("the user selects the products and add them to the cart")
    public void the_user_selects_the_products_and_add_them_to_the_cart() {
        BrowserUtils.waitForPageToLoad(10);
        List<WebElement> products = productPage.Products;
        int numberOfProducts = products.size();

        for (WebElement product : products) {
            //System.out.println(product.getText());
        }
        List<String> selectionCriteriaList = Arrays.asList();

        for (String selectionCriteria : selectionCriteriaList) {
            String productSelector;

            switch (selectionCriteria.trim().toLowerCase()) {
                case "aloe":
                    productSelector = "//p[contains(text(),'Aloe')]";
                    break;
                case "spf-30":
                    productSelector = "//p[contains(translate(text(),'SPF-30', 'spf-30'))]";

                    break;

                default:
                    throw new IllegalArgumentException("Invalid selection criteria: " + selectionCriteria);

            }
            selectionCriteriaList.add(productSelector);
            BrowserUtils.waitFor(6);
            productPage.AddtoCart.click();

            System.out.println(selectionCriteria);

        }
        }

}
