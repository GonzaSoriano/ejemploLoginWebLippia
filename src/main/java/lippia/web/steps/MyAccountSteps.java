package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Then;
import lippia.web.services.MyAccountService;

public class MyAccountSteps extends PageSteps {

    @Then("ingreso a My Account")
    public void pantallaMyAccount(){
        MyAccountService.validarMyAccount();
    }
}
