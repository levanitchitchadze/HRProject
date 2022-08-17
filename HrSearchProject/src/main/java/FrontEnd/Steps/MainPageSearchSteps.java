package FrontEnd.Steps;

import FrontEnd.Pages.MainPage;
import com.codeborne.selenide.SelenideElement;
import com.sun.tools.javac.Main;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPageSearchSteps {

    MainPage MP=new MainPage();

    public void SearchWithCity(){

        MP.CityDropDown.click();

        for(int i=36;i<=112;i++){

            String Id="'mat-option-"+i+"'";
            $(By.xpath("//*[@id="+Id+"]")).click();

        }

    }



}
