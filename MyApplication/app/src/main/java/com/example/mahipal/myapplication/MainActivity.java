package com.example.mahipal.myapplication;

import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    //final Path path = new Path();
    //final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    //final Canvas canvas = new Canvas();

    final FrameLayout etchBG = (FrameLayout) findViewById(R.id.etchFrame);

    final Button blueButton = (Button) findViewById(R.id.blueButton);
    final Button redButton = (Button) findViewById(R.id.redButton);
    final Button greenButton = (Button) findViewById(R.id.greenButton);
    final Button skyBlueButton = (Button) findViewById(R.id.skyBlueButton);
    final Button limeGreenButton = (Button) findViewById(R.id.limeGreenButton);
    final Button purpleButton = (Button) findViewById(R.id.purpleButton);
    final Button magentaButton = (Button) findViewById(R.id.magentaButton);
    final Button lightPinkButton = (Button) findViewById(R.id.lightPinkButton);
    final Button yellowButton = (Button) findViewById(R.id.yellowButton);
    final Button orangeButton = (Button) findViewById(R.id.orangeButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
   // public Bitmap viewToBitmap(final FrameLayout etchBG) {
       // final Bitmap bitmap = Bitmap.createBitmap(etchBG.getWidth(), etchBG.getHeight(), Bitmap.Config.ARGB_8888);

        //Canvas canvas = new Canvas(bitmap);
        //etchBG.draw(canvas);
        //canvas.drawPath(path, paint);
        //paint.setColor(Color.BLACK);
        //paint.setStyle(Paint.Style.STROKE);
        //paint.setStrokeWidth(1);
        //return bitmap;
        //etchBG.onDraw(canvas);
        //canvas.drawColor(Color.WHITE);
        //canvas.drawPath(path, paint);









