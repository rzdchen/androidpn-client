package com.cc.pn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.cc.apn.ServiceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("DemoAppActivity", "onCreate()...");

        // Settings
        Button okButton = (Button) findViewById(R.id.btn_settings);
        okButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ServiceManager.viewNotificationSettings(MainActivity.this);
            }
        });

        // Start the service
        ServiceManager serviceManager = new ServiceManager(this);
        serviceManager.setNotificationIcon(R.mipmap.notification);
        serviceManager.startService();

    }
}
