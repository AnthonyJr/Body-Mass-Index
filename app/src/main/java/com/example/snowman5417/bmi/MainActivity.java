package com.example.snowman5417.bmi;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   public static final String EXTRA_MESSAGE = "com.snowman5417.bmi.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String EXTRA_MESSAGE = "com.snowman5417.bmi.MESSAGE";

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){


        Intent intent = new Intent(this, MainActivity2Activity.class);

        int inches;
        int feet;
        int weight;
        float step1;
        float step2;
        float step3;
        String message;



        EditText getinches = (EditText)findViewById(R.id.et_getInches);
        EditText getFeet = (EditText)findViewById(R.id.et_getFeet);
        EditText getWeight = (EditText)findViewById(R.id.et_getWeight);
        TextView t1 = (TextView) findViewById(R.id.ans);

        inches = Integer.parseInt(getinches.getText().toString());
        feet = Integer.parseInt(getFeet.getText().toString());
        weight = Integer.parseInt(getWeight.getText().toString());

        step1 = weight * 703;
        step2 = (feet * 12) + inches;
        step2 = step2* step2;
        step3 = step1 / step2;



        t1.setText(Float.toString(step3));
        message = t1.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message);



        startActivity(intent);
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
