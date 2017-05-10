package mepec.buttonsmash;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * The main activity
 * Will need a Time left and a time keeper counting down
 * Will need a score and the score keeper
 * Will need the button to press
 */

public class MainActivity extends AppCompatActivity{
    ImageButton SmashButton;                //Button to press
    static long millisLeft;                 //Milliseconds left in count down Timer
    CountDownTimer countDownTimer;          //The count down timer
    static int scoreCounter;                //The score counter - static so there is only one instance of it
    TextView sc;                            //The text that will update with the score counter


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        millisLeft = 11000; //11 seconds
        scoreCounter = 0;
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        setContentView(R.layout.main_activity);

        //TODO:
            //Last thing you do in this activity
            //Uncomment code below


//        TextView t = (TextView)findViewById(R.id.score_keeper);
//        String timeStr = "";
//        t.setText(timeStr.format("%d", scoreCounter));
    }

    @Override
    protected void onPause() {
        super.onPause();
        countDownTimer.cancel();
    }

    @Override
    protected void onResume() {
        super.onResume();

        //TODO:
            //Create an ImageButton in main_activity.xml with id attribute smash_button
            //Create an TextView in main_activity.xml with id attribute time_keeper
            //Find the ImageButton using findViewById
            //Set the onClickListener
                //onClick should call updateScore()
            //Uncomment timer code below


//        countDownTimer = new CountDownTimer(millisLeft, 1000) {
//            TextView t = (TextView) findViewById(R.id.time_keeper);
//
//            public void onTick(long millisUntilFinished) {
//                String timeStr = "";
//                t.setText(timeStr.format("%d", (millisUntilFinished / 1000) - 1));
//
//                millisLeft = millisLeft - 1000;
//            }
//
//            public void onFinish() {
//                EndMenu.finalScore = scoreCounter;
//
//                //TODO:
//                    //Create new Intent from this to EndMenu
//                    //Start the activity with intent as argument
//                    //Finish this activity
//            }
//        }.start();

    }

    private void updateScore() {
        //Updates the score counter and the textview

        //TODO:
            //one line to update score counter
            //Make a TextView object in main_activity.xml with id attribute score_keeper
            //Uncomment code below

//        sc = (TextView)findViewById(R.id.score_keeper);
//        String s = "";
//        sc.setText(s.format("%d",scoreCounter));
    }
}
