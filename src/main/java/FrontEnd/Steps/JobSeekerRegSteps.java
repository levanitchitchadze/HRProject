package FrontEnd.Steps;

import FrontEnd.Pages.JobSeekerRegistrationPage;

public class JobSeekerRegSteps {

    JobSeekerRegistrationPage JSRP =new JobSeekerRegistrationPage();

    public void ValidateCheckbox (){
        JSRP.Checkbox.click();

    }

    public void ClickToRegistrationButton(){
        JSRP.RegistrationButton.click();
    }




}
