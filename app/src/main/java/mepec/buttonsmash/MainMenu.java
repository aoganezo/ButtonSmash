package mepec.buttonsmash;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * The main menu that shows on launch
 * Will need the game title
 * Will need the play button
 */

public class MainMenu extends AppCompatActivity{
    Button PlayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        //TODO:
            //Make a Button in main_menu.xml with id attribute play_button
            //Use findViewById to link PlayButton button to play_button in xml
            //Set onClickListener to PlayButton button
                //Set onClick
                    //Create Intent with this and MainActivity
                    //Start activity with intent as argument
                    //Finish this activity
    }

}
