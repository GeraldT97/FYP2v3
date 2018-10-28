package com.example.enduser.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.BatchUpdateException;
import java.util.Scanner;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        TextView fingerprint = (TextView)v.findViewById(R.id.fingerprint);
        fingerprint.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getActivity().getApplicationContext(), ManageFingerprint.class);
                startActivity(startIntent);
            }

        });

        ImageView Scanner = (ImageView) v.findViewById(R.id.Scanner);
        Scanner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getActivity().getApplicationContext(), ManageFingerprint.class);
                startActivity(startIntent);
            }
            });





        TextView car = (TextView)v.findViewById(R.id.car);
        car.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getActivity().getApplicationContext(), CarStatus.class);
                startActivity(startIntent);
            }

        });

        ImageView carstatus  = (ImageView) v.findViewById(R.id.carstatus);
        Scanner.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getActivity().getApplicationContext(), CarStatus.class);
                startActivity(startIntent);
            }
        });

        return v;






    }

}


