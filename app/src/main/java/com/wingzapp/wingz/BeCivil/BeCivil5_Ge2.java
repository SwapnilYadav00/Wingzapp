package com.wingzapp.wingz.BeCivil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wingzapp.wingz.PdfViewer;
import com.wingzapp.wingz.R;

public class BeCivil5_Ge2 extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;
    private String sum15,sum16,sum17,sum18,sum19,win15,win16,win17,win18,win19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_civil5__ge2);

        sum15="1M7zjZsI30b_-q0hKN0yblGG3FPehodNi";
        sum16 ="1MZUDKlFDPoRMcQL6D1qghRmObvqvSEpI";
        sum17="1MIHdT5Bz3CKraZv8nuKBFp5DAc1jBviC";
        sum18="1MIeXgPEYqvB1ono15sPDltER8JPeTdmb";
        sum19="1M0nGL5yTVBWsIAXN2BhiyWrSyNUAVyiu";
        win15="1MMDLcvVBHtrIvTE1ofIbnlVmBdwQb194";
        win16="1MOhEkQxzZMJ_ZVKp1BPxY7Vs8Xtgu4yk";
        win17="1MTr2o8cp66IRRScrk523iZCB94IHTTaR";
        win18="1MXa8c8nDi5vnKukH1cqKPzfB2kAgKqZW";
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