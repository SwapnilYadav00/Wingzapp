package com.wingzapp.wingz.BeCivil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.wingzapp.wingz.PdfViewer;
import com.wingzapp.wingz.R;

public class BeCivil5_Sa2 extends AppCompatActivity {
    Button s19,s18,s17,s16,s15,w19,w18,w17,w16,w15;

    private String sum15,sum16,sum17,sum18,sum19,win15,win16,win17,win18,win19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_civil5__sa2);

        sum15="1NWf0G2iiTklMo58JF-e_xOCh-KParSCg";
        sum16 ="1Nx0cFnQuDLKf6GDpyC5Dhnmfv9xZWQiL";
        sum17="1NTfAtj8PoTwrKMgPTtsXTgSgn_9F4uBW";
        sum18="1NXdBfG-vELkaEo_2L9cm2IpRsg2qXBUm";
        sum19="1NM9b2OD9REJQWVWC_rmiOl0dFEGr-5wu";
        win15="1NkSFEP0I7dNXOzPxDxR7PKTJo14zCU_f";
        win16="1Nl40AOw07Sk1QEI6g76pI5jEZxEH15cL";
        win17="1NllE62A85bGiAWKv_2cl6kHj6FTHAZEl";
        win18="1Nve_ncqx0Zo9jWAnc61QA2YyQBOL_jfk";
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