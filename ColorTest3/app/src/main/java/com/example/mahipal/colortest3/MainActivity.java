package com.example.mahipal.colortest3;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {

    RelativeLayout Background;
    Button blueButton, redButton, greenButton, skyBlueButton, limeGreenButton, purpleButton, magentaButton, lightPinkButton, yellowButton, orangeButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Background = (RelativeLayout) findViewById(R.id.Background);

        blueButton = (Button) findViewById(R.id.blueButton);
        redButton = (Button) findViewById(R.id.redButton);
        greenButton = (Button) findViewById(R.id.greenButton);
        skyBlueButton = (Button) findViewById(R.id.skyBlueButton);
        limeGreenButton = (Button) findViewById(R.id.limeGreenButton);
        purpleButton = (Button) findViewById(R.id.purpleButton);
        magentaButton = (Button) findViewById(R.id.magentaButton);
        lightPinkButton = (Button) findViewById(R.id.lightPinkButton);
        yellowButton = (Button) findViewById(R.id.yellowButton);
        orangeButton = (Button) findViewById(R.id.orangeButton);

        //click button code goes here:

        blueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#ff1e33ff"));
            }

        });

        redButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#ffff1e15"));
            }

        });

        greenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#005C00"));
            }

        });

        skyBlueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#33CCFF"));
            }

        });

        limeGreenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#A3CC29"));
            }

        });

        purpleButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#3D007A"));
            }

        });

        magentaButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#A3007A"));
            }

        });

        lightPinkButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#FF99CC"));
            }

        });

        yellowButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#E8E819"));
            }

        });

        orangeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Background.setBackgroundColor(Color.parseColor("#FF7519"));
            }

        });
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
