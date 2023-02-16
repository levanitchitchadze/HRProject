package FrontEnd.Steps;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;
import FrontEnd.Data.RegEmailData;
import static com.codeborne.selenide.Configuration.*;
import FrontEnd.Data.RegEmailData;
import FrontEnd.Steps.ConfigStep;
import org.openqa.selenium.chrome.ChromeDriver;
import javax.annotation.RegEx;

public class ConfigStep {

    RegEmailData regEmailData = new RegEmailData();

    public void ConfigBrowser(){

        holdBrowserOpen=true;
        browserSize="1366x1080";
        screenshots=true;


    }

}
