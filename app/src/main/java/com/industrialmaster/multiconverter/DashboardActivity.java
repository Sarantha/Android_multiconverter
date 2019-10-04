package com.industrialmaster.multiconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }
    public void temperature (View view){
        Intent intent = new Intent(DashboardActivity.this,TemperatureActivity.class);
        startActivity(intent);
    }
    public void length (View view){
        Intent intent = new Intent(DashboardActivity.this,LengthActivity.class);
        startActivity(intent);
    }
    public void volume (View view){
        Intent intent = new Intent(DashboardActivity.this,VolumeActivity.class);
        startActivity(intent);
    }
    public void time (View view){
        Intent intent = new Intent(DashboardActivity.this,TimeActivity.class);
        startActivity(intent);
    }
    public void speed (View view){
        Intent intent = new Intent(DashboardActivity.this,SpeedActivity.class);
        startActivity(intent);
    }
    public void area (View view){
        Intent intent = new Intent(DashboardActivity.this,AreaActivity.class);
        startActivity(intent);
    }
}
