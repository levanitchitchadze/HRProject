package FrontEnd.Steps;

import FrontEnd.Data.SeaerchData;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;


public class ConfigBrowser {

    SeaerchData SD = new SeaerchData();

    public void ConfigBrowser(){

        holdBrowserOpen=true;
        browserSize="1366x1080";
        screenshots=true;
        Configuration.reportsFolder = "src/main/ScreenShots";
        open(SD.BASEURL);

    }


}
