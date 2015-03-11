package com.example.mahipal.samdroid;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;


/**
 * TODO: document your custom view class.
 */
public class TouchView extends View {
    private PointF p = new PointF();	//holds 2 floats
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private boolean first = true;



    //private Bitmap samDroid = new Bitmap(R.mipmap.samdroid_img);
    //public static Bitmap createBitmap (R.mipmap.samdroid_img, int x, int y, int width, int height);

    public TouchView(Context context) {
        super(context);
        paint.setColor(Color.WHITE);
        paint.setStyle(Paint.Style.FILL);

        setOnTouchListener(new OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        return true;	//do nothing

                    case MotionEvent.ACTION_UP:
                        return true;	//do nothing

                    case MotionEvent.ACTION_MOVE:
                        //Put center of drawable where finger touched.
                        p.set(event.getX(), event.getY());
                        invalidate();	//call onDraw method of TouchView
                        return true;	//do nothing else

                    default:
                        return false;
                }
            }
        });
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        final int width = getWidth();
        final int height = getHeight();
        //float radius = .1f * Math.min(width, height);
        float radius = .5f * Math.min(width, height);



        canvas.drawColor(Color.WHITE);	//background

        //draw samdroid_img.png
        Resources resources = getResources();
        Bitmap bitMap = BitmapFactory.decodeResource(resources, R.drawable.samdroid_img);
        int w = bitMap.getWidth();
        int h = bitMap.getHeight();
        //coordinates of upper left corner of BitMap, paint is null
        canvas.drawBitmap(bitMap, (p.x - w) / 1.0f, (p.y - h) / 1.0f, null);

    }
}
