package com.example.firstapp;

import android.opengl.Visibility;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Test","Created");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public String myval;
    public void whenclicked(View view){
    	TextView text = (TextView)findViewById(R.id.sometext);
    	text.setVisibility(View.VISIBLE);
    	text.setText(myval);
    }
    
    public void changeval(View view){
    	myval = "hello";
    }
    
 
}
