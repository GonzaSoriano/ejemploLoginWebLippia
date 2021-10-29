package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.MyAccountConstants;
import org.testng.Assert;

public class MyAccountService extends ActionManager {

    public static void validarMyAccount(){
        waitVisibility(MyAccountConstants.TITLE_MYACCOUNT_CSS);
        Assert.assertEquals(getText(MyAccountConstants.TITLE_MYACCOUNT_CSS), "MY ACCOUNT");
    }
}
