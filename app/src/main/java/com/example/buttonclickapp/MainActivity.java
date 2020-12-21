/***
 * Event driven frameworks
 */
package com.example.buttonclickapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
/** Widgets **/
import android.text.Editable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /** Local Variables **/
    private EditText userInput;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); // uses the parent function onCreate()
        setContentView(R.layout.activity_main); // uses the .xml file

        // connect userInput to the widget
        userInput = findViewById(R.id.inputText);

        // connect the text view
        textView = findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());

        // connect the button to the widget
        button = findViewById(R.id.button);

        // set the onClick method for button
        button.setOnClickListener(new View.OnClickListener(){
            // set what we want to do when the button is clicked
            public void onClick(View v){
                String result = userInput.getText().toString(); // get userInput
                if(result.isEmpty())
                    return;

                result += "\n";

                // append to text view
                textView.append(result);

                // clear the userInput field
                userInput.setText("");
            }

        });

    }
}