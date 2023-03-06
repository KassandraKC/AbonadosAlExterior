package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Button selectItemEdit = new Button(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));

    public boolean isNoteDisplayed(String message){
        Label note=new Label(By.xpath("//android.widget.TextView[@text='"+message+"']"));
        return note.isControlDisplayed();
    }
}
