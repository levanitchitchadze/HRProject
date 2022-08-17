package FrontEnd.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    ElementsCollection elementcolection = $$(By.xpath("html/body"));

    public SelenideElement CityDropDown=$(By.xpath("//div[@class='mat-form-field-flex ng-tns-c69-3']"));


}
