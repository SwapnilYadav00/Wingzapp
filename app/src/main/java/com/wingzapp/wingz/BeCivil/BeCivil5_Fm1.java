package com.wingzapp.wingz.BeCivil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wingzapp.wingz.PdfViewer;
import com.wingzapp.wingz.R;

public class BeCivil5_Fm1 extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;

    String sum15,sum16,sum17,sum18,sum19,win15,win16,win17,win18,win19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_civil5__fm1);

        sum15="1LqC1wisCICCSMVjsbmLB3ERbxXTqMIDs";
        sum16 ="1LnQfHWkfgI-FtJz3lJQTKl7RK9LLlxaz";
        sum17="1LoIkLk4NVTUAiUAnS2pq8AWlRQN9f4Og";
        sum18="1LqanGkEWg6uJr4DvdaTQfMkmQjAyR2YH";
        sum19="1LiyxWmbDpuJ6d8qUNBoK4VWrW_k0dfCR";
        win15="1LrURbK7saK1Ub9ebqgzhFI5FCZqBiEsN";
        win16="1LukMprqWx293RUD9aZrNrfX8SGOiUP2w";
        win17="1LxDpIzPhE_c_r6p10su9153l5kQj6DeG";
        win18="1M-be_WgAMKXkpJaPK9MFI_ksvUBicTKq";
        win19 = null;


        s15 = findViewById(R.id.s15);s16 = findViewById(R.id.s16);s17 = findViewById(R.id.s17);s18 = findViewById(R.id.s18);s19 = findViewById(R.id.s19);
        w15 = findViewById(R.id.w15); w16 = findViewById(R.id.w16); w17 = findViewById(R.id.w17);w18 = findViewById(R.id.w18); w19 = findViewById(R.id.w19);

        s16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sum16);
                startActivity(intent);
            }
        });
        w17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",win17);
                startActivity(intent);
            }

        });
        s18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sum18);
                startActivity(intent);
            }
        });
        w18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",win18);
                startActivity(intent);
            }

        });
        w15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",win15);
                startActivity(intent);
            }

        });
        w16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",win16);
                startActivity(intent);
            }

        });
        s15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sum15);
                startActivity(intent);
            }

        });
        s17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sum17);
                startActivity(intent);
            }

        });
        s19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sum19);
                startActivity(intent);
            }

        });
        w19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",win19);
                startActivity(intent);
            }

        });
    }
}