package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService extends ActionManager {

    /**
     * Este metodo valida que el texto extraido del titulo de la pagina My Account, es efectivamente el texto "MY ACCOUNT"
     *
     * Se agrega un waitVisibility para que Lippia espere a que el elemento que solicitamos (TITLE_MYACCOUNT_CSS)
     * se muestre en pantalla antes de realizar el paso de la validacion
     */
    public static void validarMyAccount(){
        waitVisibility(MyAccountConstants.TITLE_MYACCOUNT_CSS);
        Assert.assertEquals(getText(MyAccountConstants.TITLE_MYACCOUNT_CSS), "MY ACCOUNT");
    }
}
