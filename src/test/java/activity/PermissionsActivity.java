package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class PermissionsActivity {

    public Button saveButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131362082"));
    public Button activePermissionsButton = new Button(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    public Button fingerprintButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]"));

}
