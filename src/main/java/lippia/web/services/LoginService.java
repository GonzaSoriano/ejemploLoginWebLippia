package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;

public class LoginService extends ActionManager {

    public static void navegarAlLogin(){
        WebActionManager.navigateTo("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    public static void setEmail(String email){
      setInput(LoginConstants.INPUT_EMAIL_CSS, email);
    }

    public static void setPassword(String password){
        setInput(LoginConstants.INPUT_PASSWORD_CSS, password);
    }

    public static void clickSignIn(){
        click(LoginConstants.BUTTON_SIGNIN_CSS);
    }


}
