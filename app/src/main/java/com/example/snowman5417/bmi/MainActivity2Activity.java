package com.example.snowman5417.bmi;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView t1 = (TextView) findViewById(R.id.textView3);
        t1.setText(message);

        TextView t2 = (TextView) findViewById(R.id.weightClass);

        float bmi = Float.parseFloat(message);
        t1.setTextSize(15);
        t2.setTextSize(15);
        if (bmi < 18.5){
            t2.setText("Underweight");
        } else if ((bmi >= 18.5) || (bmi <=24.9)){
            t2.setText("Normal");
        } else if ((bmi >= 25) || (bmi <= 29.9 )){
            t2.setText("Overweight");
        } else if (bmi >= 30) {
            t2.setText("Obese");
        }






    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
