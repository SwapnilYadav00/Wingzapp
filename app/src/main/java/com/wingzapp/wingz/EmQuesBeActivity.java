package com.wingzapp.wingz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EmQuesBeActivity extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;
    String sum19,sum18,sum17,sum16,sum15,win19,win18,win17,win16,win15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_em_ques_be);

        sum15 =null;      win15 ="1Bv22mHGmveYgCD3DZJox0afCoKpJSxQo";
        sum16 =null;      win16 = null;
        sum17 ="1Bvuo1y8YYYL0ZBLw3Dmsa-lYUq8vfozN";      win17 ="1C9OuvpxvnxpsEs9SgNQ4UdSAX1pAekzK";
        sum18 ="1C28xVhz8EKJcHNgJbjUANn8XJW-TsA-i";      win18 ="1BvvD7FnfEoyuhYVeWZaq8DOKNAhUtJLg";
        sum19 =null;      win19 = null;


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
