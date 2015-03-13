package com.example.mahipal.programatically;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        RelativeLayout relativeLayout = new RelativeLayout(this);

        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,	//width
                ViewGroup.LayoutParams.MATCH_PARENT		//height
        );
        relativeLayout.setLayoutParams(layoutParams);

        Resources resources = getResources();
        relativeLayout.setPadding(
                (int)resources.getDimension(R.dimen.activity_horizontal_margin), //left
                (int)resources.getDimension(R.dimen.activity_vertical_margin),   //top
                (int)resources.getDimension(R.dimen.activity_horizontal_margin), //right
                (int)resources.getDimension(R.dimen.activity_vertical_margin)    //bottom
        );

        Button button = new Button(this);
        button.setText("Press in case of emergency");

        layoutParams = new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,   //width
                ViewGroup.LayoutParams.WRAP_CONTENT    //height
        );
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
        button.setLayoutParams(layoutParams);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button)v;
                button.setText("Thanks for pressing this button.");
                Toast.makeText(MainActivity.this, "Button pressed", Toast.LENGTH_LONG).show();
            }
        });

        relativeLayout.addView(button);
        setContentView(relativeLayout); //argument is a View, not an int
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
