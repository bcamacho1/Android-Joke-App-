package com.android.bc.basicandroidapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    public EditText etName;
    public TextView tvLabel;

    //setContentView - takes view and turn it into real Java objects
    //R - resource; layout - type of resource; specifies particular view that will be used to build thr main activity
    //activity_main.xml and MainActivity class are connected by this line setContentView(R.layout.activity_main);
    //the views are created and ready to be accessed by Java code
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    // Run when the button is clicked
    public void onSubmit(View view) {
        //getText() returns Editable so need to add toString method
        String fieldValue = etName.getText().toString();
        //Toast is a small notification on the button of the screen
        //Context is where you want to display the toast. In this case we want to display in this activity.
        //toast is created but has to be shown too. Include show method.
        Toast.makeText(this, "- Why was there a bug in the computer?\n" +
                "     It was looking for a byte to eat. ", Toast.LENGTH_LONG).show();
        tvLabel.setText(fieldValue);
    }
}
