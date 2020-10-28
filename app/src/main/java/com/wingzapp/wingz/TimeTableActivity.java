package com.wingzapp.wingz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeTableActivity extends AppCompatActivity {
Button sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8;
String sem1tt,sem2tt,sem3tt,sem4tt,sem5tt,sem6tt,sem7tt,sem8tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);

        init();
        sem1tt ="11bBBdU-cJxwGZDzOl9OeEdhai__vnjHk";
        sem2tt ="11bjb5Uxcyz4a6wVUp8QmheblwnUaQLYa";
        sem3tt ="11gDzOFfV7hNidVHK1M12Mtfa6R5m0FfK";
        sem4tt ="11ocuNVwyH1sAn3DvrXav9IgCmxcN4EWb";
        sem5tt ="11voBP5ohnq0UVZa5jUbcQbyD6j2HHz88";
        sem6tt ="11zZ1H2O7dEkFntaqZWsKlY2cxhPkp3iT";
        sem7tt ="120ulFcMWqnoy13bMdWZ-K2NY4ZlrpBLV";
        sem8tt ="1Uc6tEEZAQ3G7sMJKDqI_ZvS69q9JRkfQ";

        sem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem1tt);
                startActivity(intent);
            }
        });
        sem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem2tt);
                startActivity(intent);
            }
        });
        sem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem3tt);
                startActivity(intent);
            }
        });
        sem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem4tt);
                startActivity(intent);
            }
        });
        sem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem5tt);
                startActivity(intent);
            }
        });
        sem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem6tt);
                startActivity(intent);
            }
        });
        sem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem7tt);
                startActivity(intent);
            }
        });
        sem8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), PdfViewer.class);
                intent.putExtra("id",sem8tt);
                startActivity(intent);
            }
        });


    }

    private void init() {
        sem1 = findViewById(R.id.sem1);
        sem2 = findViewById(R.id.sem2);
        sem3 = findViewById(R.id.sem3);
        sem4 = findViewById(R.id.sem4);
        sem5 = findViewById(R.id.sem5);
        sem6 = findViewById(R.id.sem6);
        sem7 = findViewById(R.id.sem7);
        sem8 = findViewById(R.id.sem8);
    }
}
