
import static com.codeborne.selenide.Selenide.*;

//import FrontEnd.Data.RegEmailData;
//import FrontEnd.Pages.JobSeekerRegistrationPage;
import FrontEnd.Steps.ConfigBrowser;
//import FrontEnd.Steps.JobSeekerRegSteps;


import FrontEnd.Steps.MainPageSearchSteps;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.*;

//import FrontEnd.Steps.ConfigStep;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Configuration.*;
//import FrontEnd.Data.RegEmailData;
import javax.annotation.RegEx;
import com.codeborne.selenide.webdriver.*;
import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.FileDownloadMode;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.screenshot;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;



public class CitySearchTest {

    ConfigBrowser CB=new ConfigBrowser();

    MainPageSearchSteps MPSS=new MainPageSearchSteps();

    @BeforeClass
    public void OpenBrowser(){
        CB.ConfigBrowser();

    }

    @Test
    public void CitySearch(){
        MPSS.SearchWithCity();
    }





}
