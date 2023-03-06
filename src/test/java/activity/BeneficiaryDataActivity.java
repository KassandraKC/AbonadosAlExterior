package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class BeneficiaryDataActivity {

    public Button selectCountryBeneficiaryButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363136"));
    public Button economicActivityButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363150"));
    public TextBox nameTxBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362463"));
    public TextBox accountNumberTxBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362460"));
    public TextBox addressTxBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362461"));
    public TextBox cityTxBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362462"));
    public TextBox phoneTxBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362465"));
    public TextBox idNumberTxBox = new TextBox(By.id("bnb.com.bo.bnbmovil:id/2131362464"));
    public Button issuedButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.Spinner[1]/android.widget.TextView"));
    public Button issuedSelectButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[10]"));
    public Button nationalityButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.Spinner[2]/android.widget.TextView"));
    public Button nationalitySelectButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[5]"));
    public Button saveBeneficiaryButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362067"));

}
