package FrontEnd.Pages;

import FrontEnd.Data.RegEmailData;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class JobSeekerRegistrationPage {

    RegEmailData regEmailData = new RegEmailData();

    public void OpneRegistrationPage (){

        open(regEmailData.BaseUrl);


    }

    public SelenideElement EmailInput =$(By.xpath("//input[@id='Email']")),
            Password =$(By.xpath("//input[@id='Password']")),
            Firstname =$(By.xpath("//input[@id='Name']")),
            Lastname =$(By.xpath("//input[@id='Surname']")),
            PhoneNumber =$(By.xpath("//input[@id='PhoneNumber']")),
            Checkbox =$(By.xpath("//*[@id='IsAgreementChecked']")),
            RegistrationButton =$(By.xpath("//input[@type='button']")),
            CaptchaValue =$(By.xpath("//input[@type='CaptchaValue']"));








}
