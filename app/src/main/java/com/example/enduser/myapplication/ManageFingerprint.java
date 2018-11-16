package com.example.enduser.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import com.example.simplebluetooth.BluetoothConnection;

public class ManageFingerprint extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage_fingerprint);





        Button addfinger = (Button) findViewById(R.id.addfinger);
        addfinger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ScanMainPage.class);
                startActivity(startIntent);
            }
        });



                Button deletefinger = (Button) findViewById(R.id.deletefinger);
                deletefinger.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick (View v){
                Intent startIntent = new Intent(getApplicationContext(), DeleteFingerprint.class);
                startActivity(startIntent);
                }
            });


        Button viewfinger = (Button) findViewById(R.id.viewfinger);
        viewfinger.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent startIntent = new Intent(getApplicationContext(), BluetoothConnectionPre3.class);
                startActivity(startIntent);
            }
        });


                        }
                    }






