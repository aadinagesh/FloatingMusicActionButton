package com.elico.myapplication;

import android.graphics.drawable.Animatable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageView record=null;
        FloatingActionButton fabBtn=null;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        record=findViewById(R.id.record);
        fabBtn=findViewById(R.id.fab);

        //And for Vector support less than API 21
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);

        record.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Animatable animatable=(Animatable)record.getDrawable();
                animatable.start();
            }
        });

        fabBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Animatable animatable=(Animatable)fabBtn.getDrawable();
                animatable.start();
            }
        });


    }
}
