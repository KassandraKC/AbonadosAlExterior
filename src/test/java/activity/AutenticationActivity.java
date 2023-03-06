package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class AutenticationActivity {

    public TextBox userTxtBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362565"));
    public TextBox passTxBox= new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362569"));
    public Button saveButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362077"));
}
