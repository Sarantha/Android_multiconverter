package com.industrialmaster.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TimeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        Spinner dropdown = findViewById(R.id.spinner1);
        Spinner dropdown2 = findViewById(R.id.spinner2);
//create a list of items for the spinner.
        String[] items = new String[]{"Minutes", "Seconds"};
        String[] items2 = new String[]{"Seconds", "Minutes"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
        dropdown2.setAdapter(adapter2);
    }
    public void onConvert (View view){
        Spinner dropdown = findViewById(R.id.spinner1);
        Spinner dropdown2 = findViewById(R.id.spinner2);

        String left = dropdown.getSelectedItem().toString();
        String right = dropdown2.getSelectedItem().toString();
        EditText val = findViewById(R.id.valueToConvert);
        TextView ans = findViewById(R.id.answer);
        String val2 = val.getText().toString();


        if(left.equalsIgnoreCase(right)){
            Context context = getApplicationContext();
            CharSequence text = "Same Time units on both sides choose differently";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

        }else{


            String answer;
            Double val_to_convert = Double.parseDouble(val2);

            Double time = 0.00;

            if(left == "Minutes"){
                time = val_to_convert* 60;
                String result = String.format("%.2f", time);
                answer = String.valueOf(result+" S");
                ans.setText(answer);
            }else{
                time = (val_to_convert / 60);
                String result = String.format("%.2f", time);
                answer = String.valueOf(result+" Mins");
                ans.setText(answer);
            }
        }
    }
    public void onClear (View view){
        EditText val = findViewById(R.id.valueToConvert);
        TextView ans = findViewById(R.id.answer);
        val.setText("");
        ans.setText("Converted Value");
    }
}
