package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lippia.web.services.LoginService;

public class LoginSteps extends PageSteps {

    @Given("estoy en la pantalla de Login")
    public void pantallaLogin(){
        LoginService.navegarAlLogin();
    }

    @When("ingreso mi usuario (.*) y contraseña (.*)")
    public void ingresarCredencial(String usuario, String password) {
        LoginService.setEmail(usuario);
        LoginService.setPassword(password);
        LoginService.clickSignIn();
    }


}
