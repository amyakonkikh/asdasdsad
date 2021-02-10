package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

import static com.example.myapplication.Display.colorList;
import static com.example.myapplication.Display.current_paint;
import static com.example.myapplication.Display.pathList;

public class MainActivity extends AppCompatActivity {
    public static Path path = new Path();
    public static Paint paint = new Paint();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

;        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redColor(View view) {
        paint.setColor(Color.RED);
        currentColor(paint.getColor());
    }

    public void pencil(View view) {
        paint.setColor(Color.BLACK);
        currentColor(paint.getColor());

    }

    public void eraser(View view) {
        pathList.clear();
        colorList.clear();
        path.reset();
    }

    public void greenColor(View view) {
        paint.setColor(Color.GREEN);
        currentColor(paint.getColor());
    }

    public void blueColor(View view) {
        paint.setColor(Color.BLUE);
        currentColor(paint.getColor());

    }
    public  void currentColor(int c){
        current_paint = c;
        path = new Path();
    }
}