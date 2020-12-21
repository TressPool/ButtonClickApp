/***
 * Event driven frameworks
 */
package com.example.buttonclickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/** Widgets **/
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/** Goes back to API 9 **/
public class MainActivity extends AppCompatActivity {

    /** Local Variables **/
    private EditText userInput;
    private Button button;
    private TextView textView;

    private  int numTimesClicked = 0;

    /** Bundle - java class, used for passing data around **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // uses the parent function onCreate()
        setContentView(R.layout.activity_main); // uses the .xml file

        /** Connect Widgets **/
        // connect userInput to the widget
        userInput = (EditText) findViewById(R.id.inputText);
        // connect the button to the widget
        button = (Button) findViewById(R.id.button);
        // connect the text view
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("Hello world");

        // create our On Click Listener
//        View.OnClickListener onClickListener = new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                numTimesClicked ++;
//                String result = "\nThe button got tapped " +numTimesClicked +" times";
//                String result2 = "\nThe button got tapped 1 time";
//                // The first click
//                if(numTimesClicked == 1) {
//                   textView.append(result2);
//                }
//                // all other clicks after
//                else {
//                    textView.append(result);
//                }
//            }
//
//        };

        // Create the listener we just made above to our button
//        button.setOnClickListener(onClickListener);

        /** Alternative way of creating on click listener **/
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numTimesClicked ++;
                String result = "\nThe button got tapped " +numTimesClicked +" times";
                String result2 = "\nThe button got tapped 1 time";
                // The first click
                if(numTimesClicked == 1) {
                    textView.append(result2);
                }
                // all other clicks after
                else {
                    textView.append(result);
                }
            }
        });

    }
}