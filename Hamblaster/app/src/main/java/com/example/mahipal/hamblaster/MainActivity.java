package com.example.mahipal.hamblaster;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;





public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       final Button mixBatter = (Button)findViewById(R.id.btnMixBatter);
       final Button putInOven = (Button)findViewById(R.id.btnPutInOven);
       final Button eatCake = (Button)findViewById(R.id.btnEatCake);

       final TextView showLine = (TextView)findViewById(R.id.showLine);


        mixBatter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                showLine.setText("Mixing the batter!");
            }

        });

        putInOven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                showLine.setText("Putting cake in the oven!");
            }

        });

        eatCake.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                showLine.setText("Eating the cake!");
            }

        });

    }


   // @Override
    //public void Choices(Button mixBatter,Button putInOven,Button eatCake, TextView showLine){

        //new Switch() {
            //case mixBatter:
                 //mixBatter.isPressed();
               // showLine.displayText("Mixing the batter!");
          //  return true;
            //    break;


          //  case putInOven:
                  // putInOven.isPressed():
               // showLine.displayText("Putting in oven!");
           // return true;
               // break;


            //case eatCake:
               // eatCake.isPressed();
                //showLine.displayText("Eating cake!");
            //return true;
                //break;

            //default: TextView showLine;
       // }
  //  }


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

