package com.esparza.burnedcaloriescalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText weightET = (EditText) findViewById(R.id.weightET);
        EditText nameET = (EditText) findViewById(R.id.nameET);
        SeekBar seekbar = (SeekBar) findViewById(R.id.seekBar);
        final Spinner feetSP = (Spinner) findViewById(R.id.feetSP);
        final Spinner inchesSP = (Spinner) findViewById(R.id.inchesSP);
        final TextView milesRanET = (TextView) findViewById(R.id.milesRanET);
        final TextView burnedET = (TextView) findViewById(R.id.burnedET);
        final TextView BMIET = (TextView) findViewById(R.id.BMIET);

        weightET.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {

                if(actionId == EditorInfo.IME_ACTION_DONE)
                {
                    burnedET = .75 * weightET * milesRanET;
                    BMIET = (weightET * 703)/((12 * feetSP + inchesSP)*(12 * feetSP + inchesSP));
                }

                return false;
            }
        });

    }
}
