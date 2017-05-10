package mepec.buttonsmash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * End Menu will pop up after time runs out.
 * Will have say Score and the number of points.
 * Will have a delayed button appear that asks Play Again?
 */

public class EndMenu extends AppCompatActivity {
    Button PlayAgain;           //Play Again button
    TextView sc;                //TextView for score counter text
    static int finalScore = 0;  //Final score that will be assigned to in MainActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.end_menu);

        //TODO:
            //Make a Button in end_menu.xml with id attribute play_again_button
            //Use findViewById to link PlayAgain button to play_again_button in xml
            //Set onClickListener to PlayAgain button
                //Set onClick
                    //Create Intent with this and MainActivity
                    //Start activity with intent as argument
                    //Finish this activity
            //call setScore();
            //call showButton();

    }

    protected void setScore() {
        //TODO:
            //Make TextView in end_menu.xml with id attribute final_score
            //Uncomment code below

//        sc = (TextView)findViewById(R.id.final_score);
//        String s = "";
//        sc.setText(s.format("%d", EndMenu.finalScore));
    }

    //TODO:
        //To delay the appearance of the play again button so it's not accidentally pressed
        //We use a handler to delay it showing by 1.5 seconds
        //To do this, we set the visibility to VISIBLE

        //For your play again button, make sure the attribute visibility is set to invisible
        //Then, uncomment code below

    private Handler handler;

    private void showButton(){
//        handler = new Handler();
//
//        handler.postDelayed(new Runnable(){
//            @Override
//            public void run(){
//                PlayAgain.setVisibility(View.VISIBLE);
//            }
//        }, 1500);
    }


}
