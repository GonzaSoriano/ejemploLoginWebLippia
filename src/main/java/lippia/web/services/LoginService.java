package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService extends ActionManager {

    /**
     * Este metodo llama a una funcion de Lippia, que está en la clase WebActionManager, llamada navigateTo
     * y nos lleva hasta la url solicitada
     */
    public static void navegarAlLogin(){
        WebActionManager.navigateTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    /**
     * Este metodo recibe un string que contiene un email enviado desde los steps(en este caso LoginSteps),
     * y lo que hace es setear ese texto en el input email ubicado en la pagina de Login
     */
    public static void setEmail(String email){
      setInput(LoginConstants.INPUT_EMAIL_CSS, email);
    }

    /**
     * Este metodo recibe un string que contiene una contraseña enviada desde los steps (en este caso LoginSteps),
     * y lo que hace es setear ese texto en el input email ubicado en la pagina de Login
     */
    public static void setPassword(String password){
        setInput(LoginConstants.INPUT_PASSWORD_CSS, password);
    }

    /**
     * Este metodo hace click en el boton SignIn ubicado en la pagina de login
     */
    public static void clickSignIn(){
        click(LoginConstants.BUTTON_SIGNIN_CSS);
    }


}
