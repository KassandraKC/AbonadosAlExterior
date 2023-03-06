package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class SubscriberListActivity {

    public Button newSubscriberButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363430"));

    public Button menuButton = new Button(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.ImageView"));
    //VER
    public Button optionSeeButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363149"));
    //EDITAR
    public Button optionEditButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363138"));
    //ELIMINAR
    public Button optionEliminateButton = new Button(By.id("bnb.com.bo.bnbmovil:id/2131363137"));

    public boolean isNoteDisplayed(){
        Label note=new Label(By.id("bnb.com.bo.bnbmovil:id/2131364843"));
        return note.isControlDisplayed();
    }
}
