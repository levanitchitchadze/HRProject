import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.*;

import FrontEnd.Data.RegEmailData;
import FrontEnd.Pages.JobSeekerRegistrationPage;
import FrontEnd.Steps.JobSeekerRegSteps;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.testng.ScreenShooter;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.*;
import FrontEnd.Data.RegEmailData;
import FrontEnd.Steps.ConfigStep;

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

public class RegistrationAsJobseeker {

    RegEmailData regEmailData=new RegEmailData();
    ConfigStep configStep =new ConfigStep();
    JobSeekerRegistrationPage JSRP = new JobSeekerRegistrationPage();
    JobSeekerRegSteps JSRS=new JobSeekerRegSteps();



    @BeforeTest
    public void OpenBrowser(){
        configStep.ConfigBrowser();
        JSRP.OpneRegistrationPage();


    }


    @Test
    public void FillRegData(){

        JSRP.EmailInput.sendKeys(regEmailData.EmailDom1);
        JSRP.Password.sendKeys(regEmailData.Password);
        JSRP.PhoneNumber.sendKeys(regEmailData.PhoneNumber);
        JSRP.Firstname.sendKeys(regEmailData.FirstName);
        JSRP.Lastname.sendKeys(regEmailData.Lastname);
        JSRS.ValidateCheckbox();




    }



    @Test
    public void PassSecurity(){

        for(int i=0;i<2;i++){

            String pngFileName = screenshot("my_file_name"+i);

            $(By.xpath("/html/body/div[2]/div/div/form/div/div[1]/div/div[5]/div[1]/img")).download();




        }

        JSRS.ClickToRegistrationButton();

    }









}
