package WeatherShopper.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage {
    @FindBy(id= "temperature")
    public WebElement temperature;

    @FindBy(css= "a[href='/moisturizer']")
    public WebElement moisturizersButton;

    @FindBy(css= "a[href='/sunscreen']")
    public WebElement suncreamButton;


    public int getWeather(){
    String temperatureText = temperature.getText();
    int currentTemperature = Integer.parseInt(temperatureText.replaceAll("[^0-9]", ""));

        return currentTemperature;
    }}