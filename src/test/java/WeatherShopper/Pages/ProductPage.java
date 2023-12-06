package WeatherShopper.Pages;

import WeatherShopper.Utilities.BrowserUtils;
import WeatherShopper.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.openqa.selenium.WebDriver;


public class ProductPage extends BasePage {

    @FindBy(css = "Moisturizers")
    public WebElement MoisturizersButton;

    @FindBy(css = "p.top-space-10")
    public List<WebElement> MoisturizerProducts;


    @FindBy(css = "p:nth-last-of-type(2)")
    public List<WebElement> Products;


    @FindBy(xpath = "//*[contains(@onclick, 'addToCart')]")
    public WebElement AddtoCart;




    public List<WebElement> getAloeContainingProducts(List<WebElement> products) {
        return products.stream()
                .filter(productElement -> productElement.getText().toLowerCase().contains("aloe"))
                .collect(Collectors.toList());
    }

    public List<WebElement> getAlmondContainingProducts(List<WebElement> products) {
        return products.stream()
                .filter(productElement -> productElement.getText().toLowerCase().contains("almond"))
                .collect(Collectors.toList());}

    public List<WebElement> filterMoisturizersByIngredient(List<WebElement> moisturizers, String ingredient) {
        return moisturizers.stream()
                .filter(productElement -> productElement.getText().toLowerCase().contains(ingredient.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void selectMoisturizer(WebElement moisturizer) {
        String productName = moisturizer.getText().trim().toLowerCase();
        String moisturizerSelector = getMoisturizerSelector(productName);

        WebElement product = Driver.get().findElement(By.xpath(moisturizerSelector));
        product.click();
        BrowserUtils.waitFor(6);
    }
    public String getMoisturizerSelector(String productName) {
        return "//p[contains(text(),'" + productName + "')]/ancestor::div[@class='container']";
    }
    public int compareProductPrices(WebElement product1, WebElement product2) {
        String productName1 = product1.getText().trim().toLowerCase();
        String productName2 = product2.getText().trim().toLowerCase();
        return productName1.compareTo(productName2);

    }
}