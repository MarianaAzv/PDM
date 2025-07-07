package com.ifsc.contaclicks;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements SensorEventListener{

    Integer i = 0;

    SensorManager mSensorManager;
    Sensor sensor;
    TextView x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        x = findViewById(R.id.X);
        y = findViewById(R.id.Y);
        z = findViewById(R.id.Z);

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mSensorManager.registerListener(this,sensor,SensorManager.SENSOR_DELAY_NORMAL);
    }




    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        x.setText("X: " + Float.toString(sensorEvent.values[0]));
        y.setText("Y: " + Float.toString(sensorEvent.values[1]));
        z.setText("Z: " + Float.toString(sensorEvent.values[2]));
    }



    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }


}