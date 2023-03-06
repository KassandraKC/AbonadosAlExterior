package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class BeneficiaryBankActivity {

    public Button selectCountryButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363132"));
    public Button verificationCodeButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363131"));
    public TextBox verificationCodeTxBox= new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362453"));
    public Button verificationButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362064"));
    public TextBox contryTxBox= new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362449"));
    public TextBox agencyTxBox= new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362448"));
    public Button followingButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362061"));

}
