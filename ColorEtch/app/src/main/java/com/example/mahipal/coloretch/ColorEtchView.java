package com.example.mahipal.coloretch;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class ColorEtchView extends View {

    //final Button blueButton;
    //final Button redButton;
    //final Button greenButton;
   // final Button skyBlueButton;
    //final Button limeGreenButton;
    //final Button purpleButton;
   // final Button magentaButton;
   // final Button lightPinkButton;
   // final Button yellowButton;
   // final Button orangeButton;

   // blueButton = (Button) findViewById(R.layout.color_picker.blueButton);
   // redButton = (Button) findViewById(R.layout.color_picker.redButton);
   // greenButton = (Button) findViewById(R.layout.color_picker.greenButton);
   // skyBlueButton = (Button) findViewById(R.layout.color_picker.skyBlueButton);
   // limeGreenButton = (Button) findViewById(R.layout.color_picker.limeGreenButton);
   // purpleButton = (Button) findViewById(R.layout.color_picker.purpleButton);
   // magentaButton = (Button) findViewById(R.layout.color_picker.magentaButton);
   // lightPinkButton = (Button) findViewById(R.layout.color_picker.lightPinkButton);
   // yellowButton = (Button) findViewById(R.layout.color_picker.yellowButton);
   // orangeButton = (Button) findViewById(R.layout.color_picker.orangeButton);


    final Path path = new Path();
    final Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public ColorEtchView(Context context) {
        super(context);

        //Switch(paint) {
        //Case R.id.redButton:
        //redButton.isPressed();
        // paint.setColor(Color.parseColor("#ffff1e15"));
        //break;




        // }


        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1);

        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        path.moveTo(event.getX(), event.getY());
                        invalidate();	//call onDraw
                        return true;

                    case MotionEvent.ACTION_MOVE:
                        path.lineTo(event.getX(), event.getY());
                        invalidate();	//call onDraw
                        return true;

                    default:
                        return false;
                }
            }
        });
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);	//background
        canvas.drawPath(path, paint);
    }
}
